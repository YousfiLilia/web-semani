package full_projetHMIN218;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;


public class MainProjetHMIN218 {

	// directory for triplestore
	static String dirRDFS = "/Users/fatou/Desktop/M1IPS/semestre_2/HMIN218/projet/TripleStore/RDFS" ;
	static String dirWikidata1 = "/Users/fatou/Desktop/M1IPS/semestre_2/HMIN218/projet/TripleStore/Wikidata/Wikidata1";
	static String dirWikidata2 = "/Users/fatou/Desktop/M1IPS/semestre_2/HMIN218/projet/TripleStore/Wikidata/Wikidata2" ;
	static String dirSGWikidata1 = "/Users/fatou/Desktop/M1IPS/semestre_2/HMIN218/projet/TripleStore/SG_Wikidata/SG_Wikidata1" ;
	static String dirSGWikidata2 = "/Users/fatou/Desktop/M1IPS/semestre_2/HMIN218/projet/TripleStore/SG_Wikidata/SG_Wikidata2" ;

	public static void main(String args[]) {

		System.out.println("------------------------------------------ MODELE RDF/RDFS ---------------------------------------------");

		// (1) definition des espaces de noms
		// __________________________________________________________________________________________________________________________
		EspaceDeNom espace_modele = new EspaceDeNom("http://www.ex.fr/gare_ferroviaire#","gare");
		EspaceDeNom espace_individus =new EspaceDeNom("http://www.ex.fr/individus#","ex");

		// (2) initialisation du modele
		// __________________________________________________________________________________________________________________________
		Model m = ModelFactory.createDefaultModel();
		m.setNsPrefix("gare", espace_modele.getModele());
		m.setNsPrefix("ex", espace_individus.getModele());
		m.setNsPrefix("rdf", RDF.getURI());
		m.setNsPrefix("rdfs", RDFS.getURI());
		m.setNsPrefix("xsd", XSD.getURI());

		// (3) initialisation des ressources & creation des proprietes
		// __________________________________________________________________________________________________________________________
		InitialisationRessource mes_ressources = new InitialisationRessource(m, espace_modele.getModele(),espace_individus.getModele());
		Model mon_modele = mes_ressources.iniRessource();

		// (4) sauvegarder modele
		// __________________________________________________________________________________________________________________________
		Save s = new Save(mon_modele,"full_projet_HMIN218.n3");
		s.saveN3File();
	
		// (5) requetes locales SPARQL 
		// __________________________________________________________________________________________________________________________
		RequeteSelectSPARQL rq = new RequeteSelectSPARQL("full_projet_HMIN218.n3");

		System.out.println("------------------------------------ REQUETES SELECT GRAPHE LOCAL ------------------------------------");
		System.out.println();

		System.out.println("requete pour afficher les 10 premiers triplets par ordre alphabetique");
		rq.rqSelectSPARQLType1("?s","?o","?p", 10);  

		System.out.println("requete pour afficher les 10 premieres stations de metro par ordre alphabetique");
		rq.rqSelectSPARQLType2("?nom_station","gare:Station","rdf:type",10); 

		System.out.println("requete pour afficher les 14 lignes de metro par ordre alphabetique"); 
		rq.rqSelectSPARQLType2("?nom_ligne","gare:LigneMetro","rdf:type",14); 

		System.out.println("requete pour afficher les 10 premieres stations de metro de la zone 1 par ordre alphabetique");
		rq.rqSelectSPARQLType3("?nom_station","?zone","gare:Zone",1, 10); 

		System.out.println("requete pour afficher les 10 premieres stations de metro de la zone 2 par ordre alphabetique");
		rq.rqSelectSPARQLType3("?nom_station","?zone","gare:Zone",2, 10); 
		
		System.out.println("requete pour afficher les stations de metro et les lignes auxquelles elles appartiennent");
		rq.rqSelectSPARQLType4("?nom_station", "?ligne_metro", "gare:Arret", "gare:Transport", 10); 

		System.out.println("requete pour afficher les stations qui appartiennent a plus de 3 lignes");
		rq.rqSelectSPARQLType6("?nom_station", "?ligne_metro", "?nombre_de_lignes",">=3","gare:Arret","gare:Transport",10);

		System.out.println("requete pour afficher le nombre de lignes qui passe par chaque station");
		rq.rqSelectSPARQLType5("?nom_station", "?ligne_metro", "?nombre_de_lignes", "gare:Arret", "gare:Transport",10);

		System.out.println("requete pour afficher pour chaque station sa station suivante, suivant une ligne et une direction donnée");
		rq.rqSelectSPARQLType7("?station_actuelle", "?station_suivante", "?ligne", "?direction","gare:StationPrecedente", "gare:StationSuivante", " gare:Appartient_à", " gare:Direction", 20); 


		System.out.println("------------------------------------ REQUETES DESCRIBE GRAPHE LOCAL ------------------------------------");
		RequeteDescribeSPARQL rqd = new RequeteDescribeSPARQL("full_projet_HMIN218.n3");

		System.out.println("requete pour décrire toutes les propriétés des sujets de type 'station' dans le modele");
		rqd.rqDescribeSPARQLType1("?s","rdf:type","gare:Station");//,"gare:Zone",1);

		System.out.println("requete pour décrire toutes les propriétés liées aux stations dans le modele");
		rqd.rqDescribeSPARQLType3("?station","rdf:type","gare:Station");
		
		System.out.println("requete pour décrire toutes les propriétés liées aux lignes de metro dans le modele");
		rqd.rqDescribeSPARQLType3("?ligne","rdf:type","gare:LigneMetro");
		

				
		System.out.println("requete pour décrire toutes les propriétés de la ligne métro 1");
		rqd.rqDescribeSPARQLType2("?ligne","rdf:type","gare:LigneMetro","rdfs:label","M_1");


		System.out.println("------------------------------------ REQUETES CONSTRUCT GRAPHE LOCAL ------------------------------------");
		RequeteConstructSPARQL rqc = new RequeteConstructSPARQL("full_projet_HMIN218.n3");

		System.out.println("requete pour construire sous-graphe des stations et leur zone correspondante");
		rqc.requeteConstructType1("rdf:type", "gare:Station", "gare:Zone", "?o", "sg_sation&zone.n3");

		System.out.println("requete pour construire sous-graphe de toutes les lignes de metro et leur label");
		rqc.requeteConstructType1("rdf:type", "gare:LigneMetro", "rdfs:label", "?o", "sg_lignes_metro.n3");

		System.out.println("requete pour construire sous-graphe des arrets de la ligne metro 1");
		rqc.requeteConstructType1("gare:Arret", "?o", "gare:Transport", "ex:Metro_1", "sg_arret_M1.n3");

		// (6) points accès
		// __________________________________________________________________________________________________________________________
		System.out.println("------------------------------------ REQUETES POINT ACCES WIKIDATA  ------------------------------------");
		System.out.println();

		Wikidata wk = new Wikidata("full_projet_HMIN218.n3",espace_individus.getModele()); 
		wk.requeteLatLonWikidata("full_HMIN218_sg_wikidata1.n3"); //execution requete wikidata et sauvegarde infos wikidata dans un fichier n3
		wk.update("full_projet_HMIN218.n3","full_HMIN218_sg_wikidata1.n3", "full_projet_HMIN218_update1.n3"); // update du graphe initial avec les infos du graphe wikidata 

		wk.requeteCodeStationWikidata("full_HMIN218_sg_wikidata2.n3"); //execution requete wikidata et sauvegarde infos wikidata dans un fichier n3
		wk.update("full_projet_HMIN218_update1.n3","full_HMIN218_sg_wikidata2.n3", "full_projet_HMIN218_update2.n3"); // update du graphe precedent avec les infos du graphe wikidata 2
		
		wk.requeteDateInaugurationWikidata("full_HMIN218_sg_wikidata3.n3"); //execution requete wikidata et sauvegarde infos wikidata dans un fichier n3
		wk.update("full_projet_HMIN218_update2.n3","full_HMIN218_sg_wikidata3.n3", "full_projet_HMIN218_update3.n3"); // update du graphe precedent avec les infos du graphe wikidata 3

		
		//---- savegarde du modele wikidata dans objet mwk (ce modèle est par la suite enrichie avec l'ontologie)
		Model mwk = ModelFactory.createDefaultModel();
		mwk.read("full_projet_HMIN218.n3");

		// point accès DbPedia
		// __________________________________________________________________________________________________________________________
		System.out.println("------------------------------------ REQUETES POINT ACCES DBPEDIA  ------------------------------------");

		// (7) TripleStore
		// __________________________________________________________________________________________________________________________
		System.out.println("---------------------------------------------- TRIPLESTORE  --------------------------------------------");
		// persistance du graphe local RDFS
		TripleStore TS_RDFS = new TripleStore("full_projet_HMIN218.n3",dirRDFS); 
		// persistance d'un sous-graphe Wikidata
		TripleStore TS_SG_WIKIDATA1 = new TripleStore("full_HMIN218_sg_wikidata1.n3",dirSGWikidata1); 
		// persistance du graphe local RDFS + sous-graphe Wikidata 1 
		TripleStore TS_WIKIDATA1 = new TripleStore("full_projet_HMIN218_update1.n3",dirWikidata1); 

		// definition des triplestores
		TS_RDFS.defineTripleStore(); TS_WIKIDATA1.defineTripleStore();	TS_SG_WIKIDATA1.defineTripleStore();

		// taille triplestorre
		TS_RDFS.sizeTripleStore(); TS_WIKIDATA1.sizeTripleStore(); TS_SG_WIKIDATA1.sizeTripleStore();
		
		// consultation des triplestores --> requetes SPARQL
		System.out.println();
		RequeteSelectSPARQL rq_TS_RDFS = new RequeteSelectSPARQL("full_projet_HMIN218.n3",dirRDFS);
		
		System.out.println("requete pour afficher pour chaque station sa station suivante, suivant une ligne et une direction donnée");
		rq_TS_RDFS.rqSelectSPARQLType7("?station_actuelle", "?station_suivante", "?ligne", "?direction","gare:StationPrecedente", "gare:StationSuivante", " gare:Appartient_à", " gare:Direction", 20); 

	
		RequeteSelectSPARQL rq_TS_SG_WIKIDATA1 = new RequeteSelectSPARQL("full_HMIN218_sg_wikidata1.n3",dirSGWikidata1);
		
		System.out.println("requete pour afficher pour chaque station sa station suivante, suivant une ligne et une direction donnée");
		rq_TS_SG_WIKIDATA1.rqSelectSPARQLType7("?station_actuelle", "?station_suivante", "?ligne", "?direction","gare:StationPrecedente", "gare:StationSuivante", " gare:Appartient_à", " gare:Direction", 20); 

		// (8) Ontologie
		// __________________________________________________________________________________________________________________________
		System.out.println("----------------------------------------------- ONTOLOGIE  ---------------------------------------------");

		// creation de l'ontologie
		OntModel om = ModelFactory.createOntologyModel();
		OntModel om_rich = ModelFactory.createOntologyModel();

		// ajout des espaces de noms
		om.setNsPrefix("gare", espace_modele.getModele());
		om.setNsPrefix("ex", espace_individus.getModele());
		
		om_rich.setNsPrefix("gare", espace_modele.getModele());
		om_rich.setNsPrefix("ex", espace_individus.getModele());
		
		Ontologie ontologie = new Ontologie(om);
		Ontologie ontologie_rich = new Ontologie(om_rich);

		
		// creation classes
		ontologie.owlClass(mon_modele,espace_modele.getModele()); // ontologie avec modele rdf
		ontologie_rich.owlClass(mwk,espace_modele.getModele()); // ontologie avec modele rdf enrichi avec donnees wikidata

		
		// creation proprietes
		ontologie.owlProperty(mon_modele,espace_modele.getModele());
		ontologie_rich.owlProperty(mwk,espace_modele.getModele());
		
		ontologie.owlDomain(espace_modele.getModele(),"Arret","Passe_Par");
		ontologie.owlRange(espace_modele.getModele(),"Arret","LigneMetro");
		ontologie.owlDomain(espace_modele.getModele(),"Transport","Passe_Par");
		ontologie.owlRange(espace_modele.getModele(),"Transport","LigneMetro");
		ontologie.owlDomain(espace_modele.getModele(),"StationPrecedente","Connexion");
		ontologie.owlRange(espace_modele.getModele(),"StationPrecedente","Station");
		ontologie.owlDomain(espace_modele.getModele(),"StationSuivante","Connexion");
		ontologie.owlRange(espace_modele.getModele(),"StationSuivante","Station");
		ontologie.owlDomain(espace_modele.getModele(),"Direction","Connexion");
		ontologie.owlRange(espace_modele.getModele(),"Direction","Station");
		ontologie.owlDomain(espace_modele.getModele(),"Appartient_à","Connexion");
		ontologie.owlRange(espace_modele.getModele(),"Appartient_à","Station");
		
		ontologie.owlInverseOf(espace_modele.getModele(),"StationSuivante","StationPrecedente");
		
		ontologie.owlTransitivity(espace_modele.getModele(),"EstAvant","");
		ontologie.owlTransitivity(espace_modele.getModele(),"EstApres","EstAvant");
		ontologie.owlDomainTransitivity(espace_modele.getModele(),"EstAvant","Station");
		ontologie.owlRangeTransitivity(espace_modele.getModele(),"EstAvant","Station");
		ontologie.owlDomainTransitivity(espace_modele.getModele(),"EstApres","Station");
		ontologie.owlRangeTransitivity(espace_modele.getModele(),"EstApres","Station");
		
		ontologie_rich.owlDomain(espace_modele.getModele(),"Arret","Passe_Par");
		ontologie_rich.owlRange(espace_modele.getModele(),"Arret","LigneMetro");
		ontologie_rich.owlDomain(espace_modele.getModele(),"Transport","Passe_Par");
		ontologie_rich.owlRange(espace_modele.getModele(),"Transport","LigneMetro");
		ontologie_rich.owlDomain(espace_modele.getModele(),"StationPrecedente","Connexion");
		ontologie_rich.owlRange(espace_modele.getModele(),"StationPrecedente","Station");
		ontologie_rich.owlDomain(espace_modele.getModele(),"StationSuivante","Connexion");
		ontologie_rich.owlRange(espace_modele.getModele(),"StationSuivante","Station");
		ontologie_rich.owlDomain(espace_modele.getModele(),"Direction","Connexion");
		ontologie_rich.owlRange(espace_modele.getModele(),"Direction","Station");
		ontologie_rich.owlDomain(espace_modele.getModele(),"Appartient_à","Connexion");
		ontologie_rich.owlRange(espace_modele.getModele(),"Appartient_à","Station");
		
		ontologie_rich.owlInverseOf(espace_modele.getModele(),"StationSuivante","StationPrecedente");

		ontologie_rich.owlTransitivity(espace_modele.getModele(),"EstAvant","");
		ontologie_rich.owlTransitivity(espace_modele.getModele(),"EstApres","EstAvant");
		ontologie_rich.owlDomainTransitivity(espace_modele.getModele(),"EstAvant","Station");
		ontologie_rich.owlRangeTransitivity(espace_modele.getModele(),"EstAvant","Station");
		ontologie_rich.owlDomainTransitivity(espace_modele.getModele(),"EstApres","Station");
		ontologie_rich.owlRangeTransitivity(espace_modele.getModele(),"EstApres","Station");
		
		// individus
		ontologie.owlIndividual(mon_modele,espace_individus.getModele(),espace_modele.getModele());
		ontologie_rich.owlIndividual(mwk,espace_individus.getModele(),espace_modele.getModele());
		
		
		// exemple sur la transitivite
		ontologie.owlExampleStationEstAvant(espace_modele.getModele(),espace_individus.getModele(), "EstAvant", "EstApres");
		ontologie_rich.owlExampleStationEstAvant(espace_modele.getModele(),espace_individus.getModele(), "EstAvant", "EstApres");

		// reasonner & inference
		InfModel im = ontologie.owlReasoner();
		InfModel im_rich = ontologie_rich.owlReasoner();

		// validite du modele 
		ontologie.owlValidite(im);
		ontologie_rich.owlValidite(im_rich);

		System.out.println();
		System.out.println("------------------------------------------ test sur inférence -------------------------------------------");

		System.out.println("test sur la propriété inverseof : requête pour retourner les stations qui viennent avant Pont_de_Neuilly ");
		ontologie.rqOntologie(im, espace_modele.getModele(), espace_individus.getModele(), "Pont_de_Neuilly", "EstApres", null);
		
		
		System.out.println("test sur la transitivité : requête pour retourner les stations sont viennent après La_Défense_Grande_Arche ");
		ontologie.rqOntologie(im, espace_modele.getModele(), espace_individus.getModele(), "La_Défense_Grande_Arche", "EstAvant", null);
		
		// sauvegarde du modele ontologie
		Save os = new Save(om,"full_projet_HMIN218_ontologie.n3");
		os.saveN3FileOntModel();
		
		Save os_rich = new Save(om_rich,"full_projet_HMIN218_ontologie_riche.n3");
		os_rich.saveN3FileOntModel();
		
		// sauvegarde inference
		Save model_inf =  new Save(im, "full_projet_HMIN218_inference.n3");
		model_inf.saveN3FileInfModel();
		
		Save model_inf_rich =  new Save(im_rich, "full_projet_HMIN218_inference_riche.n3");
		model_inf_rich.saveN3FileInfModel();
				
		// requetes ontologie
		RequeteSelectSPARQL rq_InfModel = new RequeteSelectSPARQL("full_projet_HMIN218_inference.n3");

		System.out.println("------------------------------------ REQUETES SELECT MODELE INFERENCE ------------------------------------");
		System.out.println();

		System.out.println("requete pour afficher les 10 premiers triplets par ordre alphabetique");
		rq_InfModel.rqSelectSPARQLType1("?s","?o","?p", 10);  
		
		
		System.out.println("------------------------------------ REQUETES DESCRIBE MODELE INFERENCE ------------------------------------");
		RequeteDescribeSPARQL rqd_InfModel = new RequeteDescribeSPARQL("full_projet_HMIN218_inference.n3");
		
		System.out.println("requete pour décrire toutes les propriétés des sujets de type 'station' dans le modele");
		rqd_InfModel.rqDescribeSPARQLType1("?individu","rdf:type","gare:Station");


		System.out.println("requete pour décrire toutes les propriétés de la ligne métro 1");
		rqd_InfModel.rqDescribeSPARQLType2("?ligne","rdf:type","gare:LigneMetro","rdfs:label","M_1");

		System.out.println("requete pour décrire toutes les propriétés liées aux stations dans le modele");
		rqd_InfModel.rqDescribeSPARQLType3("?station","rdf:type","gare:Station");


		RequeteDescribeSPARQL rqd_InfModelRich = new RequeteDescribeSPARQL("full_projet_HMIN218_inference_riche.n3");
		
		System.out.println("requete pour décrire toutes les propriétés des sujets de type 'station' dans le modele");
		rqd_InfModelRich.rqDescribeSPARQLType1("?individu","rdf:type","gare:Station");

		System.out.println("requete pour décrire toutes les propriétés liées aux stations dans le modele");
		rqd_InfModelRich.rqDescribeSPARQLType3("?station","rdf:type","gare:Station");

		System.out.println("requete pour décrire toutes les propriétés liées aux lignes de metro dans le modele");
		rqd_InfModelRich.rqDescribeSPARQLType3("?ligne","rdf:type","gare:LigneMetro");
		
		System.out.println("requete pour décrire toutes les propriétés de la ligne métro 1");
		rqd_InfModelRich.rqDescribeSPARQLType2("?ligne","rdf:type","gare:LigneMetro","rdfs:label","M_1");

		
		System.out.println("----------------------------------------- FIN EXÉCUTION MAIN   --------------------------------------------");
	}
}









