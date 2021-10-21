package full_projetHMIN218;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Connexion {

	private Model m = ModelFactory.createDefaultModel();
	private String ns_modele;
	private Resource dir;
	private Resource ligne_metro;

	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	}

	public String getNs_modele() {
		return ns_modele;
	}

	public void setNs_modele(String ns_modele) {
		this.ns_modele = ns_modele;
	}

	public Resource getDir() {
		return dir;
	}

	public void setDir(Resource dir) {
		this.dir = dir;
	}

	public Resource getLigne_metro() {
		return ligne_metro;
	}

	public void setLigne_metro(Resource ligne_metro) {
		this.ligne_metro = ligne_metro;
	}

	public Connexion() {};
	public Connexion(Model m, String espace1, Resource dir) {
		this.setM(m); this.setNs_modele(espace1);this.setDir(dir);
	}
	
	public Connexion(Model m, String espace1, Resource ligne, Resource dir) {
		this.setM(m); this.setNs_modele(espace1); this.setLigne_metro(ligne);this.setDir(dir);
	}
	
	
	Model mesConnexions(Resource nom_ligne,Resource stationP, Resource stationS, String label_ligne, int dist, int time) 
	{
		// creation de la ressource connexion
		Resource connexion = m.createResource(ns_modele + "Connexion");

		// instance de la resource connexion est un noeud anonyme
		Resource anonC = m.createResource(); // 

		/* Proprietes sur la ressource connexion */
		CreatePropriete p = new CreatePropriete(m,connexion);
		Model pp = p.maProprieteSousClasseDeClass(); // la ressource connexion est sous classe de Class

		CreatePropriete p_anonC = new CreatePropriete(m,anonC,connexion);
		Model prop_anonC = p_anonC.maProprieteType(); // le noeud anonyme est un type de connexion

		CreatePropriete pl1 = new CreatePropriete(m,nom_ligne,ligne_metro,label_ligne);
		
		/* Propriete sur les connexions */
		//Property stationPrecedente = m.createProperty(gare_ferroviaire + "StationPrecedente");
		CreatePropriete pc1 = new CreatePropriete(m,ns_modele,"StationPrecedente");
		CreatePropriete pc2 = new CreatePropriete(m,ns_modele,"StationSuivante");
		CreatePropriete pc3 = new CreatePropriete(m,ns_modele,"Direction");
		CreatePropriete pc4 = new CreatePropriete(m,ns_modele,"Appartient_à");
		CreatePropriete pc5 = new CreatePropriete(m,ns_modele,"Distance");
		CreatePropriete pc6 = new CreatePropriete(m,ns_modele,"Temps");
		
		Property stationPrecedente = pc1.maPropriete();
		Property stationSuivante = pc2.maPropriete();
		Property direction = pc3.maPropriete();
		Property appartient_a = pc4.maPropriete();
		Property distance = pc5.maPropriete(); // distance en metres
		Property temps = pc6.maPropriete(); // temps en secondes
		
		
		Model prop_distanceC1_l1_n1 = p_anonC.maProprieteLiteralInt(distance, dist); 
		Model prop_tempsC1_l1_n1 = p_anonC.maProprieteLiteralInt(temps, time);

		Model infoStationPrecedente1_l1 = pl1.ajoute(anonC, stationPrecedente, stationP);
		Model infoStationSuivante1_l1 = pl1.ajoute(anonC, stationSuivante, stationS);
		Model infoDirection1_l1 = pl1.ajoute(anonC, direction, dir);
		Model infoAppartient1_l1 = pl1.ajoute(anonC, appartient_a, nom_ligne);


		return m;
	}

}

