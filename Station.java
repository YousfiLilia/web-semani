package full_projetHMIN218;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Station {

	// attributs
	private Model m;
	private String ns_modele;


	// accesseurs
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

	// constructeurs
	public Station(){} // constructeur vide


	public Station(Model m, String ns_modele){
		this.setM(m); this.setNs_modele(ns_modele); 
	}


	// methodes

	Model mesStations(Resource res, int valZone) {

		// ressource station
		Resource station = m.createResource(ns_modele + "Station");


		// creation des proprietes sur les stations
		CreatePropriete p = new CreatePropriete(m,station);
		Model pp = p.maProprieteSousClasseDeClass(); // la ressource station est sous classe de Class

		/* Propriete sur les stations */
		CreatePropriete ps1 = new CreatePropriete(m,ns_modele,"Pays");
		CreatePropriete ps2 = new CreatePropriete(m,ns_modele,"Ville");
		CreatePropriete ps3 = new CreatePropriete(m,ns_modele,"Heure_ouverture");
		CreatePropriete ps4 = new CreatePropriete(m,ns_modele,"Heure_fermeture");
		CreatePropriete ps5 = new CreatePropriete(m,ns_modele,"Zone");

		/* Propriete sur les stations */
		Property country = ps1.maPropriete();
		Property city =  ps2.maPropriete();		
		Property opening_hour =  ps3.maPropriete();
		Property closing_hour =  ps4.maPropriete();
		Property zone =  ps5.maPropriete();

		// Propriete pays valeur litral		
		station.addProperty(country, m.createLiteral("France", "fr"));
		station.addProperty(country, m.createLiteral("France", "en"));

		// Propriete ville valeur litral		
		station.addProperty(city, m.createLiteral("Paris", "fr"));
		station.addProperty(city, m.createLiteral("Paris", "en"));

		// Propriete heure ouverture valeur literal
		station.addProperty(opening_hour, m.createLiteral("05h30", "fr"));
		station.addProperty(opening_hour, m.createLiteral("05:30 am", "en"));

		// Propriete heure fermeture valeur litral
		station.addProperty(closing_hour, m.createLiteral("01h00", "fr"));
		station.addProperty(closing_hour, m.createLiteral("01:00 am", "en"));


		CreatePropriete stat = new CreatePropriete(m,res,station);

		Model prop_station = stat.maProprieteType();
		Model prop_zone = stat.maProprieteLiteralInt(zone, valZone);



		return m;		
	}


}
