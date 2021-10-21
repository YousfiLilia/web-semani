package full_projetHMIN218;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.update.UpdateAction;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;


public class Wikidata {

	// attributs
	public static final String NL = System.getProperty("line.separator");
	static Model m = ModelFactory.createDefaultModel();
	static Model n = ModelFactory.createDefaultModel();
	//static Model l = ModelFactory.createDefaultModel();

	private String file_projet;
	private String ns_individus;

	static String sparqlService = "https://query.wikidata.org/sparql";

	static String prolog1 = "PREFIX schema: <http://schema.org/>";
	static String prolog2 = "PREFIX rdfs: <" + RDFS.getURI() + ">";
	static String prolog3 = "PREFIX wd: <http://www.wikidata.org/entity/>";
	static String prolog4 = "PREFIX wdt: <http://www.wikidata.org/prop/direct/>";
	static String prolog5 = "PREFIX wikibase: <http://wikiba.se/ontology#>";
	static String prolog6 = "PREFIX bd: <http://www.bigdata.com/rdf#>";
	static String prolog7 = "PREFIX geo: <http://www.opengis.net/ont/geosparql#>";
	static String prolog8 = "PREFIX ex: <http://www.ex.fr/individus#>";
	static String prolog9 = "PREFIX gare: <http://www.ex.fr/gare_ferroviaire#>";

	// accesseurs
	public String getFile_projet() {
		return file_projet;
	}
	public void setFile_projet(String file_projet) {
		this.file_projet = file_projet;
	}
	public String getNs_individus() {
		return ns_individus;
	}
	public void setNs_individus(String ns_individus) {
		this.ns_individus = ns_individus;
	}

	// constructeurs
	public Wikidata() {};
	public Wikidata(String inputFile, String ns_individus) {
		this.setFile_projet(inputFile);
		this.setNs_individus(ns_individus);
	}


	// methodes

	// methode pour updater un modele avec les informations obtenus sur un autre modele
	// exploitation 2 graphes 
	public void update(String model_ini, String model_wiki, String file_update) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("** update graphe " + model_ini + " avec infos graphe " + model_wiki +" \n");
		System.out.println("      le résultat est enregistré dans le graphe "+ file_update );
		System.out.println();

		try {

			//lecture modele initial
			Model modelIni = ModelFactory.createDefaultModel();
			modelIni.read(model_ini);

			// lecture modele wikidata
			Model modelWiki = ModelFactory.createDefaultModel();
			modelWiki.read(model_wiki);

			// recuperation infos sur modele wikidata
			StmtIterator iter = modelWiki.listStatements();

			while (iter.hasNext()) {   

				Statement stmt = iter.nextStatement(); // get next statement
				String predicate = stmt.getPredicate().getLocalName();
				String subject = stmt.getSubject().getLocalName();
				String object = stmt.getObject().toString();

				// update a faire
				String update =  prolog1 + NL + prolog2 + NL + prolog3 + NL + prolog4 + NL 
						+ prolog5 + NL + prolog6 + NL + prolog7 + NL + prolog8 + NL + prolog9 + NL
						+ "insert { " + "ex:"+subject +" " + "gare:"+predicate + " '"+ object + "'  } "
						+ "where { " + "ex:"+subject + "  gare:Zone ?o }";
				// execution update
				UpdateAction.parseExecute( update, modelIni );
			}
			//on réécrit le modele dans un fichier n3	
			FileOutputStream outStream = new FileOutputStream(file_update); //
			modelIni.write(outStream, "N3");
			outStream.close();
		}
		catch (Exception e) {System.out.println("failure" + e);
		} finally {
		}
	}


	// requete pour recuperer la laitude et la longitude des stations si disponible
	public void requeteLatLonWikidata(String file_wikidata) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("**requete sur wikidata :  récupération infos latitude et longitude des stations.");
		System.out.println();

		// lecture du modele
		m.read(this.file_projet);

		// listes des ressources stations dans le modele (initiatlisatiom, liste vide)
		ArrayList<String> listeStations = new ArrayList<String>(); 

		// on extrait les stations
		extractStations(listeStations);

		// sort the result alphabetically
		Collections.sort(listeStations); //QC

		// boucle sur chaque element de la liste
		for (String element : listeStations) {

			String station = element.replace("_", " ");
			// System.out.println("station test 1: " + station); // QC

			// si il y a plus au moins deux mots separés par un espace
			if (station.contains(" ")) {
				ArrayList<String> array = new ArrayList<String>(); // Create an ArrayList object
				array.add(station);

				for (String mots : array) {
					latlon(mots,file_wikidata);
				}					
			}
			else
			{
				latlon(station,file_wikidata);
			}
		}

	}

	// requete pour recuperer le code station de chacune des stationss i disponible
	public void requeteCodeStationWikidata(String file_wikidata) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("**requete sur wikidata :  récupération infos code stations des stations.");
		System.out.println();
		
		// lecture du modele
		m.read(this.file_projet);

		// listes des ressources stations dans le modele (initiatlisatiom, liste vide)
		ArrayList<String> listeStations = new ArrayList<String>(); 

		// on extrait les stations
		extractStations(listeStations);

		// sort the result alphabetically
		Collections.sort(listeStations); //QC

		// boucle sur chaque element de la liste
		for (String element : listeStations) {

			String station = element.replace("_", " ");
			// System.out.println("station test 1: " + station); // QC

			// si il y a plus au moins deux mots separés par un espace
			if (station.contains(" ")) {
				ArrayList<String> array = new ArrayList<String>(); // Create an ArrayList object
				array.add(station);

				for (String mots : array) {
					codeStation(mots,file_wikidata);
				}					
			}
			else
			{
				codeStation(station,file_wikidata);
			}
		}

	}		


	// requete pour recuperer la date d'inauguration de chaque station si disponible
	public void requeteDateInaugurationWikidata(String file_wikidata) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("**requete sur wikidata :  récupération infos date d'inauguration des stations.");
		System.out.println();
		// lecture du modele
		m.read(this.file_projet);

		// listes des ressources stations dans le modele (initiatlisatiom, liste vide)
		ArrayList<String> listeStations = new ArrayList<String>(); 

		// on extrait les stations
		extractStations(listeStations);

		// sort the result alphabetically
		Collections.sort(listeStations); //QC

		// boucle sur chaque element de la liste
		for (String element : listeStations) {

			String station = element.replace("_", " ");
			// System.out.println("station test 1: " + station); // QC

			// si il y a plus au moins deux mots separés par un espace
			if (station.contains(" ")) {
				ArrayList<String> array = new ArrayList<String>(); // Create an ArrayList object
				array.add(station);

				for (String mots : array) {
					dateInauguration(mots,file_wikidata);
				}					
			}
			else
			{
				dateInauguration(station,file_wikidata);
			}
		}

	}		



	/////////////////////////////////////// methodes privees a la classe ////////////////////////////////////////////////

	private String checkElement(String element) {
		if(element.contains(" ")){
			String e = element.replace(" ", "_");
			return e;
		}
		return element;
	}

	private void extractStations(ArrayList<String> listeStations) {

		// iterateur sur les ressources de propriete RDF.type
		ResIterator iter = m.listResourcesWithProperty(RDF.type);

		// pour chacune des ressources on recuperes celles qui correspondent aux stations de metro
		while (iter.hasNext()) {        	
			Resource r = iter.next();
			String res = r.getLocalName();

			if(res != null && !res.contains("Metro_")){

				listeStations.add(res);
			}
		}
	}

	private void latlon(String element, String file_wikidata) {

		// lecture du modèle
		m.read(this.file_projet);

		String modele_ns = m.getNsPrefixURI("gare");
		String individu_ns = m.getNsPrefixURI("ex");

		String search_word = checkElement(element);
		Resource res = m.getResource(individu_ns + search_word);

		Property coordonnees = m.createProperty(modele_ns + "Coordonnées");

		String wdt = "wdt:P625"; // coordonnees de la station
		requete(n,element,res,coordonnees,wdt,file_wikidata); 
	}

	private void dateInauguration(String element, String file_wikidata) {
		// lecture du modèle
		m.read(this.file_projet);

		String modele_ns = m.getNsPrefixURI("gare");
		String individu_ns = m.getNsPrefixURI("ex");

		String search_word = checkElement(element);
		Resource res = m.getResource(individu_ns + search_word);

		Property date = m.createProperty(modele_ns + "Date_Inauguration");

		String wdt = "wdt:P1619" ; // date d'inauguratioon
		requete(n,element,res,date,wdt,file_wikidata); 
	}


	private void codeStation(String element, String file_wikidata) {

		m.read(this.file_projet);
		String modele_ns = m.getNsPrefixURI("gare");
		String individu_ns = m.getNsPrefixURI("ex");

		String search_word = checkElement(element);
		Resource res = m.getResource(individu_ns + search_word);

		Property code = m.createProperty(modele_ns + "Code");

		String wdt = "wdt:P296"; // code station
		requete(n,element,res,code,wdt,file_wikidata); 
	}	

	private void labelGeo(String element, String file_wikidata) {

		try {
			// lecture du modèle
			m.read(this.file_projet);

			String modele_ns = m.getNsPrefixURI("gare");
			String individu_ns = m.getNsPrefixURI("ex");

			String search_word = checkElement(element);
			Resource res = m.getResource(individu_ns + search_word);

			Property geolocalisation = m.createProperty(modele_ns + "Géolocalisation");
			Property geolocalisationLabel = m.createProperty(modele_ns + "Label_geolocalisation");

			n.setNsPrefix("gare", "http://www.ex.fr/gare_ferroviaire#");
			n.setNsPrefix("ex", "http://www.ex.fr/individus#");
			n.setNsPrefix("wd", "http://www.wikidata.org/entity/");
			n.setNsPrefix("wdt", "http://www.wikidata.org/prop/direct/");
			n.setNsPrefix("schema","http://schema.org/");
			n.setNsPrefix("wikibase", "http://wikiba.se/ontology#");
			n.setNsPrefix("bd", "http://www.bigdata.com/rdf#");

			String rdq = prolog1 + NL + prolog2 + NL + prolog3 + NL + prolog4 + NL 
					+ prolog5 + NL + prolog6 + NL

					+ "SELECT ?s ?label ?o ?label_geo WHERE {\n"
					+ "  ?s wdt:P31 wd:Q928830;\n"
					+ "  rdfs:label ?label;\n"
					+ "  wdt:P361 wd:Q50716.\n"
					+ "  FILTER((REGEX(?label, \""
					+ element
					+ "\")) && ((LANG(?label)) = \"fr\"))\n"
					+ "  OPTIONAL { ?s wdt:P131 ?o. }\n"
					+ "  ?o rdfs:label ?label_geo.\n"
					+ "  FILTER((LANG(?label_geo)) = \"fr\")\n"
					+ "}";

			Query query = QueryFactory.create(rdq);
			QueryExecution qexec = QueryExecutionFactory.sparqlService(sparqlService, query);

			Resource localisation = null;

			ResultSet results = qexec.execSelect();
			for (; results.hasNext();) {
				QuerySolution sol = results.next();
				localisation = (Resource) sol.get("?o");
				Literal label_geo = (Literal) sol.get("?label_geo");

				n.add(res,geolocalisation,localisation);
				n.add(res,geolocalisationLabel,label_geo);
			}

			qexec.close();
			FileOutputStream outStream = new FileOutputStream(file_wikidata); //
			n.write(outStream, "N3");
			outStream.close();


		} catch (Exception e) {System.out.println("failure" + e);
		} finally {
		}
	}


	// methode prive pour les requetes
	private void requete(Model model, String element, Resource res, Property p, String wdt, String outfile ) {

		try {

			model.setNsPrefix("gare", "http://www.ex.fr/gare_ferroviaire#");
			model.setNsPrefix("ex", "http://www.ex.fr/individus#");
			model.setNsPrefix("wd", "http://www.wikidata.org/entity/");
			model.setNsPrefix("wdt", "http://www.wikidata.org/prop/direct/");
			model.setNsPrefix("schema","http://schema.org/");
			model.setNsPrefix("wikibase", "http://wikiba.se/ontology#");
			model.setNsPrefix("bd", "http://www.bigdata.com/rdf#");
			model.setNsPrefix("geo","http://www.opengis.net/ont/geosparql#wktLiteral");

			String rdq = prolog1 + NL + prolog2 + NL + prolog3 + NL + prolog4 + NL 
					+ prolog5 + NL + prolog6 + NL + prolog7 + NL + prolog8 + NL + prolog9 + NL

					+ "SELECT ?s ?label ?tmp  WHERE {\n"
					+ "?s wdt:P31 wd:Q928830;\n"
					+ "rdfs:label ?label; wdt:P361 wd:Q50716.\n"
					+ "OPTIONAL { ?s "+ wdt +" ?tmp . }\n"
					+ "  FILTER((REGEX(?label, \""
					+ element  
					+ "\""+","+"\"i\")) && ((LANG(?label)) = \"fr\"))\n"
					+ "}";

			Query query = QueryFactory.create(rdq);
			QueryExecution qexec = QueryExecutionFactory.sparqlService(sparqlService, query);

			ResultSet results = qexec.execSelect();
			for (; results.hasNext();) {
				QuerySolution sol = results.next();
				Literal code_station = (Literal) sol.get("?tmp");			

				model.add(res,p,code_station);
			}

			qexec.close();
			FileOutputStream outStream = new FileOutputStream(outfile); //
			model.write(outStream, "N3");
			outStream.close();
			System.out.println();


		} catch (Exception e) {
			System.out.println("failure" + e);
		} finally {
		}

	}



}


