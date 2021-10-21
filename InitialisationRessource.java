package full_projetHMIN218;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

// C'est une classe qui permet de creer les ressources et les proprietes associees
public class InitialisationRessource {


	private Model m = ModelFactory.createDefaultModel();
	private String ns_modele;
	private String ns_individus;

	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	};

	public String getNs_modele() {
		return ns_modele;
	}

	public void setNs_modele(String ns_modele) {
		this.ns_modele = ns_modele;
	}

	public String getNs_individus() {
		return ns_individus;
	}

	public void setNs_individus(String ns_individus) {
		this.ns_individus = ns_individus;
	}

	public InitialisationRessource() {};
	public InitialisationRessource(Model m, String espace1, String espace2) {
		this.setM(m);
		this.setNs_modele(espace1);
		this.setNs_individus(espace2);
	}


	Model iniRessource() {

		Resource line = m.createResource(ns_modele + "Ligne");
		Resource ligne_metro = m.createResource(ns_modele + "LigneMetro");
		Resource passe_par = m.createResource(ns_modele + "Passe_Par");

		/*__ les ressources instances de lignes de metro __*/
		Resource ligne_metro1= m.createResource(ns_individus + "Metro_1");
		Resource ligne_metro2= m.createResource(ns_individus + "Metro_2");
		Resource ligne_metro3= m.createResource(ns_individus + "Metro_3");
		Resource ligne_metro3b= m.createResource(ns_individus + "Metro_3b");
		Resource ligne_metro4= m.createResource(ns_individus + "Metro_4");
		Resource ligne_metro5= m.createResource(ns_individus + "Metro_5");
		Resource ligne_metro6= m.createResource(ns_individus + "Metro_6");
		Resource ligne_metro7= m.createResource(ns_individus + "Metro_7");
		Resource ligne_metro7b= m.createResource(ns_individus + "Metro_7b");
		Resource ligne_metro8= m.createResource(ns_individus + "Metro_8");
		Resource ligne_metro9= m.createResource(ns_individus + "Metro_9");
		Resource ligne_metro10= m.createResource(ns_individus + "Metro_10");
		Resource ligne_metro11= m.createResource(ns_individus + "Metro_11");
		Resource ligne_metro12= m.createResource(ns_individus + "Metro_12");
		Resource ligne_metro13= m.createResource(ns_individus + "Metro_13");
		Resource ligne_metro14= m.createResource(ns_individus + "Metro_14");

		/*__ les ressources instances de station de metro __*/
		//__________________________________________________________________________________________________________________________
		Resource Abbesses = m.createResource(ns_individus + "Abbesses");  Station s1 = new Station(m,ns_modele); s1.mesStations(Abbesses,1);
		Resource Alésia = m.createResource(ns_individus + "Alésia");  Station s2 = new Station(m,ns_modele); s2.mesStations(Alésia,1);
		Resource Alexandre_Dumas = m.createResource(ns_individus + "Alexandre_Dumas");  Station s3 = new Station(m,ns_modele); s3.mesStations(Alexandre_Dumas,1);
		Resource Alma_Marceau = m.createResource(ns_individus + "Alma_-_Marceau");  Station s4 = new Station(m,ns_modele); s4.mesStations(Alma_Marceau,1);
		Resource Anatole_France = m.createResource(ns_individus + "Anatole_France");  Station s5 = new Station(m,ns_modele); s5.mesStations(Anatole_France,2);
		Resource Anvers = m.createResource(ns_individus + "Anvers");  Station s6 = new Station(m,ns_modele); s6.mesStations(Anvers,1);
		Resource Argentine = m.createResource(ns_individus + "Argentine");  Station s7 = new Station(m,ns_modele); s7.mesStations(Argentine,1);
		Resource Arts_et_Métiers = m.createResource(ns_individus + "Arts_et_Métiers");  Station s8 = new Station(m,ns_modele); s8.mesStations(Arts_et_Métiers,1);
		Resource Asnières_Gennevilliers_Les_Courtilles = m.createResource(ns_individus + "Asnières_Gennevilliers_Les_Courtilles");  Station s9 = new Station(m,ns_modele); s9.mesStations(Asnières_Gennevilliers_Les_Courtilles,3);
		Resource Assemblée_Nationale = m.createResource(ns_individus + "Assemblée_Nationale");  Station s10 = new Station(m,ns_modele); s10.mesStations(Assemblée_Nationale,1);
		Resource Aubervilliers_Pantin_Quatre_Chemins = m.createResource(ns_individus + "Aubervilliers_-_Pantin_-_Quatre_Chemins");  Station s11 = new Station(m,ns_modele); s11.mesStations(Aubervilliers_Pantin_Quatre_Chemins,1);
		Resource Avenue_Émile_Zola = m.createResource(ns_individus + "Avenue_Émile_Zola");  Station s12 = new Station(m,ns_modele); s12.mesStations(Avenue_Émile_Zola,1);
		Resource Avron = m.createResource(ns_individus + "Avron");  Station s13 = new Station(m,ns_modele); s13.mesStations(Avron,1);
		Resource Bagneux = m.createResource(ns_individus + "Bagneux");  Station s14 = new Station(m,ns_modele); s14.mesStations(Bagneux,3);
		Resource Balard = m.createResource(ns_individus + "Balard");  Station s15 = new Station(m,ns_modele); s15.mesStations(Balard,1);
		Resource Barbès_Rochechouart = m.createResource(ns_individus + "Barbès_Rochechouart");  Station s16 = new Station(m,ns_modele); s16.mesStations(Barbès_Rochechouart,1);
		Resource Basilique_de_Saint_Denis = m.createResource(ns_individus + "Basilique_de_Saint_Denis");  Station s17 = new Station(m,ns_modele); s17.mesStations(Basilique_de_Saint_Denis,1);
		Resource Bastille = m.createResource(ns_individus + "Bastille");  Station s18 = new Station(m,ns_modele); s18.mesStations(Bastille,1);
		Resource Bel_Air = m.createResource(ns_individus + "Bel_Air");  Station s19 = new Station(m,ns_modele); s19.mesStations(Bel_Air,1);
		Resource Belleville = m.createResource(ns_individus + "Belleville");  Station s20 = new Station(m,ns_modele); s20.mesStations(Belleville,1);
		Resource Bérault = m.createResource(ns_individus + "Bérault");  Station s21 = new Station(m,ns_modele); s21.mesStations(Bérault,2);
		Resource Bercy = m.createResource(ns_individus + "Bercy");  Station s22 = new Station(m,ns_modele); s22.mesStations(Bercy,2);
		Resource Bibliothèque_François_Mitterrand = m.createResource(ns_individus + "Bibliothèque_François_Mitterrand");  Station s23 = new Station(m,ns_modele); s23.mesStations(Bibliothèque_François_Mitterrand,1);
		Resource Billancourt = m.createResource(ns_individus + "Billancourt");  Station s24 = new Station(m,ns_modele); s24.mesStations(Billancourt,1);
		Resource Blanche = m.createResource(ns_individus + "Blanche");  Station s25 = new Station(m,ns_modele); s25.mesStations(Blanche,1);
		Resource Bobigny_Pablo_Picasso = m.createResource(ns_individus + "Bobigny_-_Pablo_Picasso");  Station s26 = new Station(m,ns_modele); s26.mesStations(Bobigny_Pablo_Picasso,1);
		Resource Boissière = m.createResource(ns_individus + "Bossière");  Station s27 = new Station(m,ns_modele); s27.mesStations(Boissière,1);
		Resource Bolivar = m.createResource(ns_individus + "Bolivar");  Station s28 = new Station(m,ns_modele); s28.mesStations(Bolivar,1);
		Resource Bonne_Nouvelle = m.createResource(ns_individus + "Bonne_Nouvelle");  Station s29 = new Station(m,ns_modele); s29.mesStations(Bonne_Nouvelle,1);
		Resource Botzaris = m.createResource(ns_individus + "Botzaris");  Station s30 = new Station(m,ns_modele); s30.mesStations(Botzaris,1);
		Resource Boulogne_Jean_Jaurès = m.createResource(ns_individus + "Boulogne_-_Jean_Jaurès");  Station s31 = new Station(m,ns_modele); s31.mesStations(Boulogne_Jean_Jaurès,1);
		Resource Boulogne_Pont_de_Saint_Cloud = m.createResource(ns_individus + "Boulogne_-_Pont_de_Saint_Cloud");  Station s32 = new Station(m,ns_modele); s32.mesStations(Boulogne_Pont_de_Saint_Cloud,2);
		Resource Boucicaut = m.createResource(ns_individus + "Boucicaut");  Station s33 = new Station(m,ns_modele); s33.mesStations(Boucicaut,2);
		Resource Bourse = m.createResource(ns_individus + "Bourse");  Station s34 = new Station(m,ns_modele); s34.mesStations(Bourse,1);
		Resource Bréguet_Sabin = m.createResource(ns_individus + "Bréguet_Sabin");  Station s35 = new Station(m,ns_modele); s35.mesStations(Bréguet_Sabin,1);
		Resource Brochant = m.createResource(ns_individus + "Brochant");  Station s36 = new Station(m,ns_modele); s36.mesStations(Brochant,1);
		Resource Buttes_Chaumont = m.createResource(ns_individus + "Buttes_Chaumont");  Station s37 = new Station(m,ns_modele); s37.mesStations(Buttes_Chaumont,1);
		Resource Buzenval = m.createResource(ns_individus + "Buzenval");  Station s38 = new Station(m,ns_modele); s38.mesStations(Buzenval,1);
		Resource Cadet = m.createResource(ns_individus + "Cadet");  Station s39 = new Station(m,ns_modele); s39.mesStations(Cadet,1);
		Resource Cambronne = m.createResource(ns_individus + "Cambronne");  Station s40 = new Station(m,ns_modele); s40.mesStations(Cambronne,1);
		Resource Campo_Formio = m.createResource(ns_individus + "Campo_Formio");  Station s41 = new Station(m,ns_modele); s41.mesStations(Campo_Formio,1);
		Resource Cardinal_Lemoine = m.createResource(ns_individus + "Cardinal_Lemoine");  Station s42 = new Station(m,ns_modele); s42.mesStations(Cardinal_Lemoine,1);
		Resource Carrefour_Pleyel = m.createResource(ns_individus + "Carrefour_Pleyel");  Station s43 = new Station(m,ns_modele); s43.mesStations(Carrefour_Pleyel,1);
		Resource Censier_Daubenton = m.createResource(ns_individus + "Censier_Daubenton");  Station s44 = new Station(m,ns_modele); s44.mesStations(Censier_Daubenton,1);
		Resource Champs_Élysées_Clemenceau = m.createResource(ns_individus + "Champs-Élysées_-_Clemenceau");  Station s45 = new Station(m,ns_modele); s45.mesStations(Champs_Élysées_Clemenceau,1);
		Resource Chardon_Lagache = m.createResource(ns_individus + "Chardon-Lagache");  Station s46 = new Station(m,ns_modele); s46.mesStations(Chardon_Lagache,1);
		Resource Charenton_Écoles = m.createResource(ns_individus + "Charenton_-_Écoles");  Station s47 = new Station(m,ns_modele); s47.mesStations(Charenton_Écoles,1);
		Resource Charles_de_Gaulle_Étoile = m.createResource(ns_individus + "Charles_de_Gaulle_-_Étoile");  Station s48 = new Station(m,ns_modele); s48.mesStations(Charles_de_Gaulle_Étoile,1);
		Resource Charles_Michels = m.createResource(ns_individus + "Charles_Michels");  Station s49 = new Station(m,ns_modele); s49.mesStations(Charles_Michels,1);
		Resource Charonne = m.createResource(ns_individus + "Charonne");  Station s50 = new Station(m,ns_modele); s50.mesStations(Charonne,1);
		Resource Chateau_d_eau = m.createResource(ns_individus + "Chateau_d_eau");  Station s51 = new Station(m,ns_modele); s51.mesStations(Chateau_d_eau,1);
		Resource Chateau_de_Vincennes = m.createResource(ns_individus + "Chateau_de_Vincennes");  Station s52 = new Station(m,ns_modele); s52.mesStations(Chateau_de_Vincennes,2);
		Resource Chateau_Landon = m.createResource(ns_individus + "Chateau_Landon");  Station s53 = new Station(m,ns_modele); s53.mesStations(Chateau_Landon,1);
		Resource Chateau_Rouge = m.createResource(ns_individus + "Chateau_Rouge");  Station s54 = new Station(m,ns_modele); s54.mesStations(Chateau_Rouge,1);
		Resource Châtelet = m.createResource(ns_individus + "Châtelet");  Station s55 = new Station(m,ns_modele); s55.mesStations(Châtelet,1);
		Resource Châtillon_Montrouge = m.createResource(ns_individus + "Châtillon_Montrouge");  Station s56 = new Station(m,ns_modele); s56.mesStations(Châtillon_Montrouge,1);
		Resource Chaussée_d_Antin_La_Fayette = m.createResource(ns_individus + "Chaussée_d_Antin_-_La_Fayette");  Station s57 = new Station(m,ns_modele); s57.mesStations(Chaussée_d_Antin_La_Fayette,1);
		Resource Chemin_Vert = m.createResource(ns_individus + "Chemin_Vert");  Station s58 = new Station(m,ns_modele); s58.mesStations(Chemin_Vert,1);
		Resource Chevaleret = m.createResource(ns_individus + "Chevaleret");  Station s59 = new Station(m,ns_modele); s59.mesStations(Chevaleret,1);
		Resource Cité = m.createResource(ns_individus + "Cité");  Station s60 = new Station(m,ns_modele); s60.mesStations(Cité,1);
		Resource Cluny_La_Sorbonne = m.createResource(ns_individus + "Cluny_-_La_Sorbonne");  Station s61 = new Station(m,ns_modele); s61.mesStations(Cluny_La_Sorbonne,1);
		Resource Colonel_Fabien = m.createResource(ns_individus + "Colonel_Fabien");  Station s62 = new Station(m,ns_modele); s62.mesStations(Colonel_Fabien,1);
		Resource Commerce = m.createResource(ns_individus + "Commerce");  Station s63 = new Station(m,ns_modele); s63.mesStations(Commerce,1);
		Resource Concorde = m.createResource(ns_individus + "Concorde");  Station s64 = new Station(m,ns_modele); s64.mesStations(Concorde,1);
		Resource Convention = m.createResource(ns_individus + "Convention");  Station s65 = new Station(m,ns_modele); s65.mesStations(Convention,1);
		Resource Corentin_Cariou = m.createResource(ns_individus + "Corentin_Cariou");  Station s66 = new Station(m,ns_modele); s66.mesStations(Corentin_Cariou,1);
		Resource Corenti_Celton = m.createResource(ns_individus + "Corentin_Celton");  Station s67 = new Station(m,ns_modele); s67.mesStations(Corenti_Celton,1);
		Resource Corvisart = m.createResource(ns_individus + "Corvisart");  Station s68 = new Station(m,ns_modele); s68.mesStations(Corvisart,2);
		Resource Cour_Saint_Émilion = m.createResource(ns_individus + "Cour_Saint-Émilion");  Station s69 = new Station(m,ns_modele); s69.mesStations(Cour_Saint_Émilion,1);
		Resource Courcelles = m.createResource(ns_individus + "Courcelles");  Station s70 = new Station(m,ns_modele); s70.mesStations(Courcelles,1);
		Resource Couronnes = m.createResource(ns_individus + "Couronnes");  Station s71 = new Station(m,ns_modele); s71.mesStations(Couronnes,1);
		Resource Créteil_L_Échat = m.createResource(ns_individus + "Créteil_-_L’Échat");  Station s72 = new Station(m,ns_modele); s72.mesStations(Créteil_L_Échat,1);
		Resource Créteil_Préfecture = m.createResource(ns_individus + "Créteil_-_Préfecture");  Station s73 = new Station(m,ns_modele); s73.mesStations(Créteil_Préfecture,1);
		Resource Créteil_Université = m.createResource(ns_individus + "Créteil_-_Université");  Station s74 = new Station(m,ns_modele); s74.mesStations(Créteil_Université,1);
		Resource Crimée = m.createResource(ns_individus + "Crimée");  Station s75 = new Station(m,ns_modele); s75.mesStations(Crimée,1);
		Resource Croix_de_Chavaux = m.createResource(ns_individus + "Croix_de_Chavaux");  Station s76 = new Station(m,ns_modele); s76.mesStations(Croix_de_Chavaux,1);
		Resource Danube = m.createResource(ns_individus + "Danube");  Station s77 = new Station(m,ns_modele); s77.mesStations(Danube,1);
		Resource Daumesnil = m.createResource(ns_individus + "Daumesnil");  Station s78 = new Station(m,ns_modele); s78.mesStations(Daumesnil,1);
		Resource Denfert_Rochereau = m.createResource(ns_individus + "Denfert-Rochereau");  Station s79 = new Station(m,ns_modele); s79.mesStations(Denfert_Rochereau,1);
		Resource Dugommier = m.createResource(ns_individus + "Dugommier");  Station s80 = new Station(m,ns_modele); s80.mesStations(Dugommier,1);
		Resource Dupleix = m.createResource(ns_individus + "Dupleix");  Station s81 = new Station(m,ns_modele); s81.mesStations(Dupleix,1);
		Resource Duroc = m.createResource(ns_individus + "Duroc");  Station s82 = new Station(m,ns_modele); s82.mesStations(Duroc,1);
		Resource École_Militaire = m.createResource(ns_individus + "École_Militaire");  Station s83 = new Station(m,ns_modele); s83.mesStations(École_Militaire,1);
		Resource École_Vétérinaire_de_Maisons_Alfort = m.createResource(ns_individus + "École_Vétérinaire_de_Maisons_Alfort");  Station s84 = new Station(m,ns_modele); s84.mesStations(École_Vétérinaire_de_Maisons_Alfort,1);
		Resource Edgar_Quinet = m.createResource(ns_individus + "Edgar_Quinet");  Station s85 = new Station(m,ns_modele); s85.mesStations(Edgar_Quinet,1);
		Resource Église_d_Auteuil = m.createResource(ns_individus + "Église_d_Auteuil");  Station s86 = new Station(m,ns_modele); s86.mesStations(Église_d_Auteuil,1);
		Resource Église_de_Pantin = m.createResource(ns_individus + "Église_de_Pantin");  Station s87 = new Station(m,ns_modele); s87.mesStations(Église_de_Pantin,1);
		Resource Esplanade_de_la_defense = m.createResource(ns_individus + "Esplanade_de_la_Défense");  Station s88 = new Station(m,ns_modele); s88.mesStations(Esplanade_de_la_defense,2);
		Resource Étienne_Marcel = m.createResource(ns_individus + "Étienne_Marcel");  Station s89 = new Station(m,ns_modele); s89.mesStations(Étienne_Marcel,1);
		Resource Europe = m.createResource(ns_individus + "Europe");  Station s90 = new Station(m,ns_modele); s90.mesStations(Europe,1);
		Resource Exelmans = m.createResource(ns_individus + "Exelmans");  Station s91 = new Station(m,ns_modele); s91.mesStations(Exelmans,1);
		Resource Faidherbe_Chaligny = m.createResource(ns_individus + "Faidherbe_-_Chaligny");  Station s92 = new Station(m,ns_modele); s92.mesStations(Faidherbe_Chaligny,1);
		Resource Falguière = m.createResource(ns_individus + "Falguière");  Station s93 = new Station(m,ns_modele); s93.mesStations(Falguière,1);
		Resource Felix_Faure = m.createResource(ns_individus + "Felix_Faure");  Station s94 = new Station(m,ns_modele); s94.mesStations(Felix_Faure,1);
		Resource Filles_du_Calvaire = m.createResource(ns_individus + "Filles_du_Calvaire");  Station s95 = new Station(m,ns_modele); s95.mesStations(Filles_du_Calvaire,1);
		Resource Fort_d_Aubervilliers = m.createResource(ns_individus + "Fort_d_Aubervilliers");  Station s96 = new Station(m,ns_modele); s96.mesStations(Fort_d_Aubervilliers,1);
		Resource Franklin_D_Roosevelt = m.createResource(ns_individus + "Franklin_D._Roosevelt");  Station s97 = new Station(m,ns_modele); s97.mesStations(Franklin_D_Roosevelt,2);
		Resource Gabriel_Péri = m.createResource(ns_individus + "Gabriel_Péri");  Station s98 = new Station(m,ns_modele); s98.mesStations(Gabriel_Péri,1);
		Resource Gaîté = m.createResource(ns_individus + "Gaîté");  Station s99 = new Station(m,ns_modele); s99.mesStations(Gaîté,3);
		Resource Gallieni = m.createResource(ns_individus + "Gallieni");  Station s100 = new Station(m,ns_modele); s100.mesStations(Gallieni,1);
		Resource Gambetta = m.createResource(ns_individus + "Gambetta");  Station s101 = new Station(m,ns_modele); s101.mesStations(Gambetta,1);
		Resource Gare_d_Austerlitz = m.createResource(ns_individus + "Gare_d_Austerlitz");  Station s102 = new Station(m,ns_modele); s102.mesStations(Gare_d_Austerlitz,1);
		Resource Gare_de_l_Est = m.createResource(ns_individus + "Gare_de_l_Est");  Station s103 = new Station(m,ns_modele); s103.mesStations(Gare_de_l_Est,1);
		Resource Gare_de_Lyon = m.createResource(ns_individus + "Gare_de_Lyon");  Station s104 = new Station(m,ns_modele); s104.mesStations(Gare_de_Lyon,1);
		Resource Gare_du_Nord = m.createResource(ns_individus + "Gare_du_Nord");  Station s105 = new Station(m,ns_modele); s105.mesStations(Gare_du_Nord,1);
		Resource George_V = m.createResource(ns_individus + "George_V");  Station s106 = new Station(m,ns_modele); s106.mesStations(George_V,1);
		Resource Glacière = m.createResource(ns_individus + "Glacière");  Station s107 = new Station(m,ns_modele); s107.mesStations(Glacière,1);
		Resource Goncourt = m.createResource(ns_individus + "Goncourt");  Station s108 = new Station(m,ns_modele); s108.mesStations(Goncourt,1);
		Resource Grands_Boulevards = m.createResource(ns_individus + "Grands_Boulevards");  Station s109 = new Station(m,ns_modele); s109.mesStations(Grands_Boulevards,1);
		Resource Guy_Môquet = m.createResource(ns_individus + "Guy_Môquet");  Station s110 = new Station(m,ns_modele); s110.mesStations(Guy_Môquet,1);
		Resource Havre_Caumartin = m.createResource(ns_individus + "Havre_-_Caumartin");  Station s111 = new Station(m,ns_modele); s111.mesStations(Havre_Caumartin,1);
		Resource Hoche = m.createResource(ns_individus + "Hoche");  Station s112 = new Station(m,ns_modele); s112.mesStations(Hoche,1);
		Resource Hôtel_de_Ville = m.createResource(ns_individus + "Hôtel_de_Ville");  Station s113 = new Station(m,ns_modele); s113.mesStations(Hôtel_de_Ville,2);
		Resource Invalides = m.createResource(ns_individus + "Invalides");  Station s114 = new Station(m,ns_modele); s114.mesStations(Invalides,1);
		Resource Jacques_Bonsergent = m.createResource(ns_individus + "Jacques_Bonsergent");  Station s115 = new Station(m,ns_modele); s115.mesStations(Jacques_Bonsergent,1);
		Resource Jasmin = m.createResource(ns_individus + "Jasmin");  Station s116 = new Station(m,ns_modele); s116.mesStations(Jasmin,1);
		Resource Jaurès = m.createResource(ns_individus + "Jaurès");  Station s117 = new Station(m,ns_modele); s117.mesStations(Jaurès,1);
		Resource Javel_André_Citroën = m.createResource(ns_individus + "Javel_André_Citroën");  Station s118 = new Station(m,ns_modele); s118.mesStations(Javel_André_Citroën,1);
		Resource Jourdin = m.createResource(ns_individus + "Jourdin");  Station s119 = new Station(m,ns_modele); s119.mesStations(Jourdin,1);
		Resource Jules_Joffrin = m.createResource(ns_individus + "Jules_Joffrin");  Station s120 = new Station(m,ns_modele); s120.mesStations(Jules_Joffrin,1);
		Resource Jussieu = m.createResource(ns_individus + "Jussieu");  Station s121 = new Station(m,ns_modele); s121.mesStations(Jussieu,1);
		Resource Kléber = m.createResource(ns_individus + "Kléber");  Station s122 = new Station(m,ns_modele); s122.mesStations(Kléber,1);
		Resource La_Chapelle = m.createResource(ns_individus + "La_Chapelle");  Station s123 = new Station(m,ns_modele); s123.mesStations(La_Chapelle,1);
		Resource La_Courneuve_8_Mai_1945 = m.createResource(ns_individus + "La_Courneuve_8_Mai_945");  Station s124 = new Station(m,ns_modele); s124.mesStations(La_Courneuve_8_Mai_1945,2);
		Resource La_Défense_Grande_Arche = m.createResource(ns_individus + "La_Défense_Grande_Arche");  Station s125 = new Station(m,ns_modele); s125.mesStations(La_Défense_Grande_Arche,3);
		Resource La_Fourche = m.createResource(ns_individus + "La_Fourche");  Station s126 = new Station(m,ns_modele); s126.mesStations(La_Fourche,1);
		Resource La_Motte_Picquet_Grenelle = m.createResource(ns_individus + "La_Motte_Picquet_Grenelle");  Station s127 = new Station(m,ns_modele); s127.mesStations(La_Motte_Picquet_Grenelle,1);
		Resource La_Muette = m.createResource(ns_individus + "La_Muette");  Station s128 = new Station(m,ns_modele); s128.mesStations(La_Muette,1);
		Resource La_Tour_Maubourg = m.createResource(ns_individus + "La_Tour_Maubourg");  Station s129 = new Station(m,ns_modele); s129.mesStations(La_Tour_Maubourg,1);
		Resource Lamarck_Caulaincourt = m.createResource(ns_individus + "Lamarck_Caulaincourt");  Station s130 = new Station(m,ns_modele); s130.mesStations(Lamarck_Caulaincourt,1);
		Resource Laumière = m.createResource(ns_individus + "Laumière");  Station s131 = new Station(m,ns_modele); s131.mesStations(Laumière,1);
		Resource Le_Kremelin_Bicêtre = m.createResource(ns_individus + "Le_Kremelin_Bicêtre");  Station s132 = new Station(m,ns_modele); s132.mesStations(Le_Kremelin_Bicêtre,1);
		Resource Le_Peletier = m.createResource(ns_individus + "Le_Peletier");  Station s133 = new Station(m,ns_modele); s133.mesStations(Le_Peletier,2);
		Resource Ledru_Rollin = m.createResource(ns_individus + "Ledru_Rollin");  Station s134 = new Station(m,ns_modele); s134.mesStations(Ledru_Rollin,1);
		Resource Les_Agnettes = m.createResource(ns_individus + "Les_Agnettes");  Station s135 = new Station(m,ns_modele); s135.mesStations(Les_Agnettes,1);
		Resource Les_Gobelins = m.createResource(ns_individus + "Les_Gobelins");  Station s136 = new Station(m,ns_modele); s136.mesStations(Les_Gobelins,3);
		Resource Les_Halles = m.createResource(ns_individus + "Les_Halles");  Station s137 = new Station(m,ns_modele); s137.mesStations(Les_Halles,1);
		Resource Les_Sablons = m.createResource(ns_individus + "Les_Sablons");  Station s138 = new Station(m,ns_modele); s138.mesStations(Les_Sablons,1);
		Resource Liberté = m.createResource(ns_individus + "Liberté");  Station s139 = new Station(m,ns_modele); s139.mesStations(Liberté,2);
		Resource Liège = m.createResource(ns_individus + "Liège");  Station s140 = new Station(m,ns_modele); s140.mesStations(Liège,1);
		Resource Louis_Blanc = m.createResource(ns_individus + "Louis_Blanc");  Station s141 = new Station(m,ns_modele); s141.mesStations(Louis_Blanc,1);
		Resource Louise_Michel = m.createResource(ns_individus + "Louise_Michel");  Station s142 = new Station(m,ns_modele); s142.mesStations(Louise_Michel,1);
		Resource Lourmet = m.createResource(ns_individus + "Lourmet");  Station s143 = new Station(m,ns_modele); s143.mesStations(Lourmet,2);
		Resource Louvre_Rivoli = m.createResource(ns_individus + "Louvre_Rivoli");  Station s144 = new Station(m,ns_modele); s144.mesStations(Louvre_Rivoli,1);
		Resource Mabillon = m.createResource(ns_individus + "Mabillon");  Station s145 = new Station(m,ns_modele); s145.mesStations(Mabillon,1);
		Resource Madeleine = m.createResource(ns_individus + "Madeleine");  Station s146 = new Station(m,ns_modele); s146.mesStations(Madeleine,1);
		Resource Mairie_d_Issy = m.createResource(ns_individus + "Mairie_d_Issy");  Station s147 = new Station(m,ns_modele); s147.mesStations(Mairie_d_Issy,1);
		Resource Mairie_d_Ivry = m.createResource(ns_individus + "Mairie_d_Ivry");  Station s148 = new Station(m,ns_modele); s148.mesStations(Mairie_d_Ivry,2);
		Resource Mairie_de_Clichy = m.createResource(ns_individus + "Mairie_de_Clichy");  Station s149 = new Station(m,ns_modele); s149.mesStations(Mairie_de_Clichy,1);
		Resource Mairie_de_Montreuil = m.createResource(ns_individus + "Mairie_de_Montreuil");  Station s150 = new Station(m,ns_modele); s150.mesStations(Mairie_de_Montreuil,2);
		Resource Mairie_de_Montrouge = m.createResource(ns_individus + "Mairie_de_Montrouge");  Station s151 = new Station(m,ns_modele); s151.mesStations(Mairie_de_Montrouge,1);
		Resource Mairie_de_Saint_Ouen = m.createResource(ns_individus + "Mairie_de_Saint_Ouen");  Station s152 = new Station(m,ns_modele); s152.mesStations(Mairie_de_Saint_Ouen,1);
		Resource Mairie_des_Lilas = m.createResource(ns_individus + "Mairie_des_Lilas");  Station s153 = new Station(m,ns_modele); s153.mesStations(Mairie_des_Lilas,1);
		Resource Maison_Blanche = m.createResource(ns_individus + "Maison_Blanche");  Station s154 = new Station(m,ns_modele); s154.mesStations(Maison_Blanche,1);
		Resource Maisons_Alfort_Les_Juilliottes = m.createResource(ns_individus + "Maisons_Alfort_Les_Juilliottes");  Station s155 = new Station(m,ns_modele); s155.mesStations(Maisons_Alfort_Les_Juilliottes,1);
		Resource Maisons_Alfort_Stade = m.createResource(ns_individus + "Maisons_Alfort_Stade");  Station s156 = new Station(m,ns_modele); s156.mesStations(Maisons_Alfort_Stade,1);
		Resource Malakoff_Plateau_de_Vanves = m.createResource(ns_individus + "Malakoff_Plateau_de_Vanves");  Station s157 = new Station(m,ns_modele); s157.mesStations(Malakoff_Plateau_de_Vanves,1);
		Resource Malakoff_Rue_Étienne_Dolet = m.createResource(ns_individus + "Malakoff_Rue_Étienne_Dolet");  Station s158 = new Station(m,ns_modele); s158.mesStations(Malakoff_Rue_Étienne_Dolet,1);
		Resource Malesherbes = m.createResource(ns_individus + "Malesherbes");  Station s159 = new Station(m,ns_modele); s159.mesStations(Malesherbes,1);
		Resource Maraîchers = m.createResource(ns_individus + "Maraîchers");  Station s160 = new Station(m,ns_modele); s160.mesStations(Maraîchers,1);
		Resource Marcadet_Poissonniers = m.createResource(ns_individus + "Marcadet_Poissonniers");  Station s161 = new Station(m,ns_modele); s161.mesStations(Marcadet_Poissonniers,1);
		Resource Marcel_Sembat = m.createResource(ns_individus + "Marcel_Sembat");  Station s162 = new Station(m,ns_modele); s162.mesStations(Marcel_Sembat,1);
		Resource Marx_Dormoy = m.createResource(ns_individus + "Marx_Dormoy");  Station s163 = new Station(m,ns_modele); s163.mesStations(Marx_Dormoy,1);
		Resource Maubert_Mutualité = m.createResource(ns_individus + "Maubert_Mutualité");  Station s164 = new Station(m,ns_modele); s164.mesStations(Maubert_Mutualité,1);
		Resource Ménilmontant = m.createResource(ns_individus + "Ménilmontant");  Station s165 = new Station(m,ns_modele); s165.mesStations(Ménilmontant,1);
		Resource Michel_Bizot = m.createResource(ns_individus + "Michel_Bizot");  Station s166 = new Station(m,ns_modele); s166.mesStations(Michel_Bizot,1);
		Resource Michel_Ange_Auteuil = m.createResource(ns_individus + "Michel_Ange_Auteuil");  Station s167 = new Station(m,ns_modele); s167.mesStations(Michel_Ange_Auteuil,1);
		Resource Michel_Ange_Molitor = m.createResource(ns_individus + "Michel_Ange_Molitor");  Station s168 = new Station(m,ns_modele); s168.mesStations(Michel_Ange_Molitor,1);
		Resource Mirabeau = m.createResource(ns_individus + "Mirabeau");  Station s169 = new Station(m,ns_modele); s169.mesStations(Mirabeau,1);
		Resource Miromesnil = m.createResource(ns_individus + "Miromesnil");  Station s170 = new Station(m,ns_modele); s170.mesStations(Miromesnil,1);
		Resource Monceau = m.createResource(ns_individus + "Monceau");  Station s171 = new Station(m,ns_modele); s171.mesStations(Monceau,1);
		Resource Montgallet = m.createResource(ns_individus + "Montgallet");  Station s172 = new Station(m,ns_modele); s172.mesStations(Montgallet,1);
		Resource Montparnasse_Bienvenüe = m.createResource(ns_individus + "Montparnasse_Bienvenüe");  Station s173 = new Station(m,ns_modele); s173.mesStations(Montparnasse_Bienvenüe,1);
		Resource Mouton_Duvernet = m.createResource(ns_individus + "Mouton_Duvernet");  Station s174 = new Station(m,ns_modele); s174.mesStations(Mouton_Duvernet,1);
		Resource Nation = m.createResource(ns_individus + "Nation");  Station s175 = new Station(m,ns_modele); s175.mesStations(Nation,1);
		Resource Nationale = m.createResource(ns_individus + "Nationale");  Station s176 = new Station(m,ns_modele); s176.mesStations(Nationale,1);
		Resource Notre_Dame_de_Lorette = m.createResource(ns_individus + "Notre_Dame_de_Lorette");  Station s177 = new Station(m,ns_modele); s177.mesStations(Notre_Dame_de_Lorette,1);
		Resource Notre_Dame_des_Champs = m.createResource(ns_individus + "Notre_Dame_des_Champs");  Station s178 = new Station(m,ns_modele); s178.mesStations(Notre_Dame_des_Champs,1);
		Resource Maraichers = m.createResource(ns_individus + "Maraîchers");  Station s179 = new Station(m,ns_modele); s179.mesStations(Maraichers,1);
		Resource Oberkampf = m.createResource(ns_individus + "Oberkampf");  Station s180 = new Station(m,ns_modele); s180.mesStations(Oberkampf,1);
		Resource Odéon = m.createResource(ns_individus + "Odéon");  Station s181 = new Station(m,ns_modele); s181.mesStations(Odéon,1);
		Resource Olympiades = m.createResource(ns_individus + "Olympiades");  Station s182 = new Station(m,ns_modele); s182.mesStations(Olympiades,1);
		Resource Opéra = m.createResource(ns_individus + "Opéra");  Station s183 = new Station(m,ns_modele); s183.mesStations(Opéra,1);
		Resource Ourcq = m.createResource(ns_individus + "Ourcq");  Station s184 = new Station(m,ns_modele); s184.mesStations(Ourcq,1);
		Resource Palais_Royal_Musée_du_Louvre = m.createResource(ns_individus + "Palais_Royal_Musée_du_Louvre");  Station s185 = new Station(m,ns_modele); s185.mesStations(Palais_Royal_Musée_du_Louvre,1);
		Resource Parmentier = m.createResource(ns_individus + "Parmentier");  Station s186 = new Station(m,ns_modele); s186.mesStations(Parmentier,1);
		Resource Passy = m.createResource(ns_individus + "Passy");  Station s187 = new Station(m,ns_modele); s187.mesStations(Passy,1);
		Resource Pasteur = m.createResource(ns_individus + "Pasteur");  Station s188 = new Station(m,ns_modele); s188.mesStations(Pasteur,1);
		Resource Pelleport = m.createResource(ns_individus + "Pelleport");  Station s189 = new Station(m,ns_modele); s189.mesStations(Pelleport,1);
		Resource Père_Lachaise = m.createResource(ns_individus + "Père_Lachaise");  Station s190 = new Station(m,ns_modele); s190.mesStations(Père_Lachaise,1);
		Resource Pereire = m.createResource(ns_individus + "Pereire");  Station s191 = new Station(m,ns_modele); s191.mesStations(Pereire,1);
		Resource Pernety = m.createResource(ns_individus + "Pernety");  Station s192 = new Station(m,ns_modele); s192.mesStations(Pernety,1);
		Resource Philippe_Auguste = m.createResource(ns_individus + "Philippe_Auguste");  Station s193 = new Station(m,ns_modele); s193.mesStations(Philippe_Auguste,1);
		Resource Picpus = m.createResource(ns_individus + "Picpus");  Station s194 = new Station(m,ns_modele); s194.mesStations(Picpus,1);
		Resource Pierre_et_Marie_Curie = m.createResource(ns_individus + "Pierre_et_Marie_Curie");  Station s195 = new Station(m,ns_modele); s195.mesStations(Pierre_et_Marie_Curie,1);
		Resource Pigalle = m.createResource(ns_individus + "Pigalle");  Station s196 = new Station(m,ns_modele); s196.mesStations(Pigalle,1);
		Resource Place_d_Italie = m.createResource(ns_individus + "Place_d_Italie");  Station s197 = new Station(m,ns_modele); s197.mesStations(Place_d_Italie,1);
		Resource Place_de_Clichy = m.createResource(ns_individus + "Place_de_Clichy");  Station s198 = new Station(m,ns_modele); s198.mesStations(Place_de_Clichy,1);
		Resource Place_des_Fêtes = m.createResource(ns_individus + "Place_des_Fêtes");  Station s199 = new Station(m,ns_modele); s199.mesStations(Place_des_Fêtes,1);
		Resource Place_Monge = m.createResource(ns_individus + "Place_Monge");  Station s200 = new Station(m,ns_modele); s200.mesStations(Place_Monge,1);
		Resource Plaisance = m.createResource(ns_individus + "Plaisance");  Station s201 = new Station(m,ns_modele); s201.mesStations(Plaisance,1);
		Resource Pointe_du_Lac = m.createResource(ns_individus + "Pointe_du_Lac");  Station s202 = new Station(m,ns_modele); s202.mesStations(Pointe_du_Lac,1);
		Resource Poissonnière = m.createResource(ns_individus + "Poissonnière");  Station s203 = new Station(m,ns_modele); s203.mesStations(Poissonnière,1);
		Resource Pont_de_Levallois_Bécon = m.createResource(ns_individus + "Pont_de_Levallois_Bécon");  Station s204 = new Station(m,ns_modele); s204.mesStations(Pont_de_Levallois_Bécon,2);
		Resource Pont_de_Neuilly = m.createResource(ns_individus + "Pont_de_Neuilly");  Station s205 = new Station(m,ns_modele); s205.mesStations(Pont_de_Neuilly,2);
		Resource Pont_de_Sèvres = m.createResource(ns_individus + "Pont_de_Sèvres");  Station s206 = new Station(m,ns_modele); s206.mesStations(Pont_de_Sèvres,1);
		Resource Pont_Marie = m.createResource(ns_individus + "Pont_Marie");  Station s207 = new Station(m,ns_modele); s207.mesStations(Pont_Marie,1);
		Resource Pont_Neuf = m.createResource(ns_individus + "Pont_Neuf");  Station s208 = new Station(m,ns_modele); s208.mesStations(Pont_Neuf,1);
		Resource Porte_d_Auteuil = m.createResource(ns_individus + "Porte_d_Auteuil");  Station s209 = new Station(m,ns_modele); s209.mesStations(Porte_d_Auteuil,1);
		Resource Porte_d_Italie = m.createResource(ns_individus + "Porte_d_Italie");  Station s210 = new Station(m,ns_modele); s210.mesStations(Porte_d_Italie,1);
		Resource Porte_d_Ivry = m.createResource(ns_individus + "Porte_d_Ivry");  Station s211 = new Station(m,ns_modele); s211.mesStations(Porte_d_Ivry,1);
		Resource Porte_d_Orléans = m.createResource(ns_individus + "Porte_d_Orléans");  Station s212 = new Station(m,ns_modele); s212.mesStations(Porte_d_Orléans,1);
		Resource Porte_Dauphine = m.createResource(ns_individus + "Porte_Dauphine");  Station s213 = new Station(m,ns_modele); s213.mesStations(Porte_Dauphine,1);
		Resource Porte_de_Bagnolet = m.createResource(ns_individus + "Porte_de_Bagnolet");  Station s214 = new Station(m,ns_modele); s214.mesStations(Porte_de_Bagnolet,1);
		Resource Porte_de_Champerret = m.createResource(ns_individus + "Porte_de_Champerret");  Station s215 = new Station(m,ns_modele); s215.mesStations(Porte_de_Champerret,1);
		Resource Porte_de_Charenton = m.createResource(ns_individus + "Porte_de_Charenton");  Station s216 = new Station(m,ns_modele); s216.mesStations(Porte_de_Charenton,1);
		Resource Porte_de_Choisy = m.createResource(ns_individus + "Porte_de_Choisy");  Station s217 = new Station(m,ns_modele); s217.mesStations(Porte_de_Choisy,1);
		Resource Porte_de_Clichy = m.createResource(ns_individus + "Porte_de_Clichy");  Station s218 = new Station(m,ns_modele); s218.mesStations(Porte_de_Clichy,1);
		Resource Porte_de_Clignancourt = m.createResource(ns_individus + "Porte_de_Clignancourt");  Station s219 = new Station(m,ns_modele); s219.mesStations(Porte_de_Clignancourt,1);
		Resource Porte_de_la_Chapelle = m.createResource(ns_individus + "Porte_de_la_Chapelle");  Station s220 = new Station(m,ns_modele); s220.mesStations(Porte_de_la_Chapelle,1);
		Resource Porte_de_la_Villette = m.createResource(ns_individus + "Porte_de_la_Villette");  Station s221 = new Station(m,ns_modele); s221.mesStations(Porte_de_la_Villette,1);
		Resource Porte_de_Montreuil = m.createResource(ns_individus + "Porte_de_Montreuil");  Station s222 = new Station(m,ns_modele); s222.mesStations(Porte_de_Montreuil,1);
		Resource Porte_de_Pantin = m.createResource(ns_individus + "Porte_de_Pantin");  Station s223 = new Station(m,ns_modele); s223.mesStations(Porte_de_Pantin,1);
		Resource Porte_de_Saint_Cloud = m.createResource(ns_individus + "Porte_de_Saint_Cloud");  Station s224 = new Station(m,ns_modele); s224.mesStations(Porte_de_Saint_Cloud,1);
		Resource Porte_de_Saint_Ouen = m.createResource(ns_individus + "Porte_de_Saint_Ouen");  Station s225 = new Station(m,ns_modele); s225.mesStations(Porte_de_Saint_Ouen,1);
		Resource Porte_de_Vanves = m.createResource(ns_individus + "Porte_de_Vanves");  Station s226 = new Station(m,ns_modele); s226.mesStations(Porte_de_Vanves,1);
		Resource Porte_de_Versailles = m.createResource(ns_individus + "Porte_de_Versailles");  Station s227 = new Station(m,ns_modele); s227.mesStations(Porte_de_Versailles,1);
		Resource Porte_de_Vincennes = m.createResource(ns_individus + "Porte_de_Vincennes");  Station s228 = new Station(m,ns_modele); s228.mesStations(Porte_de_Vincennes,1);
		Resource Porte_des_Lilas = m.createResource(ns_individus + "Porte_des_Lilas");  Station s229 = new Station(m,ns_modele); s229.mesStations(Porte_des_Lilas,1);
		Resource Porte_Dorée = m.createResource(ns_individus + "Porte_Dorée");  Station s230 = new Station(m,ns_modele); s230.mesStations(Porte_Dorée,1);
		Resource Porte_Maillot = m.createResource(ns_individus + "Porte_Maillot");  Station s231 = new Station(m,ns_modele); s231.mesStations(Porte_Maillot,1);
		Resource Pré_Saint_Gervais = m.createResource(ns_individus + "Pré-Saint-Gervais");  Station s232 = new Station(m,ns_modele); s232.mesStations(Pré_Saint_Gervais,1);
		Resource Pyramides = m.createResource(ns_individus + "Pyramides");  Station s233 = new Station(m,ns_modele); s233.mesStations(Pyramides,1);
		Resource Pyrénées = m.createResource(ns_individus + "Pyrénées");  Station s234 = new Station(m,ns_modele); s234.mesStations(Pyrénées,1);
		Resource Quai_de_la_Gare = m.createResource(ns_individus + "Quai_de_la_Gare");  Station s235 = new Station(m,ns_modele); s235.mesStations(Quai_de_la_Gare,1);
		Resource Quai_de_la_Rapée = m.createResource(ns_individus + "Quai_de_la_Rapée");  Station s236 = new Station(m,ns_modele); s236.mesStations(Quai_de_la_Rapée,1);
		Resource Quatre_Septembre = m.createResource(ns_individus + "Quatre_Septembre");  Station s237 = new Station(m,ns_modele); s237.mesStations(Quatre_Septembre,1);
		Resource Rambuteau = m.createResource(ns_individus + "Rambuteau");  Station s238 = new Station(m,ns_modele); s238.mesStations(Rambuteau,1);
		Resource Ranelagh = m.createResource(ns_individus + "Ranelagh");  Station s239 = new Station(m,ns_modele); s239.mesStations(Ranelagh,1);
		Resource Raspail = m.createResource(ns_individus + "Raspail");  Station s240 = new Station(m,ns_modele); s240.mesStations(Raspail,1);
		Resource Réaumur_Sébastropol = m.createResource(ns_individus + "Réaumur_-_Sébastropol");  Station s241 = new Station(m,ns_modele); s241.mesStations(Réaumur_Sébastropol,1);
		Resource Rennes = m.createResource(ns_individus + "Rennes");  Station s242 = new Station(m,ns_modele); s242.mesStations(Rennes,1);
		Resource République = m.createResource(ns_individus + "République");  Station s243 = new Station(m,ns_modele); s243.mesStations(République,1);
		Resource Reuilly_Diderot = m.createResource(ns_individus + "Reuilly_-_Diderot");  Station s244 = new Station(m,ns_modele); s244.mesStations(Reuilly_Diderot,1);
		Resource Richard_Lenoir = m.createResource(ns_individus + "Richard-Lenoir");  Station s245 = new Station(m,ns_modele); s245.mesStations(Richard_Lenoir,1);
		Resource Richelieu_Drouot = m.createResource(ns_individus + "Richelieu_-_Drouot");  Station s246 = new Station(m,ns_modele); s246.mesStations(Richelieu_Drouot,1);
		Resource Riquet = m.createResource(ns_individus + "Riquet");  Station s247 = new Station(m,ns_modele); s247.mesStations(Riquet,1);
		Resource Robespierre = m.createResource(ns_individus + "Robespierre");  Station s248 = new Station(m,ns_modele); s248.mesStations(Robespierre,1);
		Resource Rome = m.createResource(ns_individus + "Rome");  Station s249 = new Station(m,ns_modele); s249.mesStations(Rome,1);
		Resource Rue_de_la_Pompe = m.createResource(ns_individus + "Rue_de_la_Pompe");  Station s250 = new Station(m,ns_modele); s250.mesStations(Rue_de_la_Pompe,1);
		Resource Rue_des_Boulets = m.createResource(ns_individus + "Rue_des_Boulets");  Station s251 = new Station(m,ns_modele); s251.mesStations(Rue_des_Boulets,1);
		Resource Rue_du_Bac = m.createResource(ns_individus + "Rue_du_Bac");  Station s252 = new Station(m,ns_modele); s252.mesStations(Rue_du_Bac,1);
		Resource Rue_Saint_Maur = m.createResource(ns_individus + "Rue_Saint_Maur");  Station s253 = new Station(m,ns_modele); s253.mesStations(Rue_Saint_Maur,1);
		Resource Saint_Ambroise = m.createResource(ns_individus + "Saint-Ambroise");  Station s254 = new Station(m,ns_modele); s254.mesStations(Saint_Ambroise,1);
		Resource Saint_Augustin = m.createResource(ns_individus + "Saint-Augustin");  Station s255 = new Station(m,ns_modele); s255.mesStations(Saint_Augustin,1);
		Resource Saint_Denis_Porte_de_Paris = m.createResource(ns_individus + "Saint-Denis_-_Porte_de_Paris");  Station s256 = new Station(m,ns_modele); s256.mesStations(Saint_Denis_Porte_de_Paris,1);
		Resource Saint_Denis_Université = m.createResource(ns_individus + "Saint-Denis_-_Université");  Station s257 = new Station(m,ns_modele); s257.mesStations(Saint_Denis_Université,1);
		Resource Saint_Fargeau = m.createResource(ns_individus + "Saint-Fargeau");  Station s258 = new Station(m,ns_modele); s258.mesStations(Saint_Fargeau,1);
		Resource Saint_François_Xavier = m.createResource(ns_individus + "Saint-François-Xavier");  Station s259 = new Station(m,ns_modele); s259.mesStations(Saint_François_Xavier,1);
		Resource Saint_Germain_des_Prés = m.createResource(ns_individus + "Saint_Germain_des_Prés");  Station s260 = new Station(m,ns_modele); s260.mesStations(Saint_Germain_des_Prés,1);
		Resource Saint_Georges = m.createResource(ns_individus + "Saint-Georges");  Station s261 = new Station(m,ns_modele); s261.mesStations(Saint_Georges,1);
		Resource Saint_Jacques = m.createResource(ns_individus + "Saint-Jacques");  Station s262 = new Station(m,ns_modele); s262.mesStations(Saint_Jacques,1);
		Resource Saint_Lazare = m.createResource(ns_individus + "Saint-Lazare");  Station s263 = new Station(m,ns_modele); s263.mesStations(Saint_Lazare,1);
		Resource Saint_Mandé = m.createResource(ns_individus + "Saint-Mandé");  Station s264 = new Station(m,ns_modele); s264.mesStations(Saint_Mandé,2);
		Resource Saint_Marcel = m.createResource(ns_individus + "Saint-Marcel");  Station s265 = new Station(m,ns_modele); s265.mesStations(Saint_Marcel,1);
		Resource Saint_Michel = m.createResource(ns_individus + "Saint-Michel");  Station s266 = new Station(m,ns_modele); s266.mesStations(Saint_Michel,1);
		Resource Saint_Paul = m.createResource(ns_individus + "Saint-Paul");  Station s267 = new Station(m,ns_modele); s267.mesStations(Saint_Paul,1);
		Resource Saint_Philippe_du_Roule = m.createResource(ns_individus + "Saint-Philippe_du_Roule");  Station s268 = new Station(m,ns_modele); s268.mesStations(Saint_Philippe_du_Roule,1);
		Resource Saint_Placide = m.createResource(ns_individus + "Saint-Placide");  Station s269 = new Station(m,ns_modele); s269.mesStations(Saint_Placide,1);
		Resource Saint_Placide_Froissart = m.createResource(ns_individus + "Saint-Placide_-_Froissart");  Station s270 = new Station(m,ns_modele); s270.mesStations(Saint_Placide_Froissart,1);
		Resource Saint_Sulpice = m.createResource(ns_individus + "Saint-Sulpice");  Station s271 = new Station(m,ns_modele); s271.mesStations(Saint_Sulpice,1);
		Resource Ségur = m.createResource(ns_individus + "Ségur");  Station s272 = new Station(m,ns_modele); s272.mesStations(Ségur,1);
		Resource Sentier = m.createResource(ns_individus + "Sentier");  Station s273 = new Station(m,ns_modele); s273.mesStations(Sentier,1);
		Resource Sèvres_Babylone = m.createResource(ns_individus + "Sèvres_-_Babylone");  Station s274 = new Station(m,ns_modele); s274.mesStations(Sèvres_Babylone,1);
		Resource Sèvres_Lecourbe = m.createResource(ns_individus + "Sèvres_-_Lecourbe");  Station s275 = new Station(m,ns_modele); s275.mesStations(Sèvres_Lecourbe,1);
		Resource Simplon = m.createResource(ns_individus + "Simplon");  Station s276 = new Station(m,ns_modele); s276.mesStations(Simplon,1);
		Resource Solférino = m.createResource(ns_individus + "Solférino");  Station s277 = new Station(m,ns_modele); s277.mesStations(Solférino,1);
		Resource Stalingrad = m.createResource(ns_individus + "Stalingrad");  Station s278 = new Station(m,ns_modele); s278.mesStations(Stalingrad,1);
		Resource Strasbourg_Saint_Denis = m.createResource(ns_individus + "Strasbourg_-_Saint-Denis");  Station s279 = new Station(m,ns_modele); s279.mesStations(Strasbourg_Saint_Denis,1);
		Resource Sully_Morland = m.createResource(ns_individus + "Sully_-_Morland");  Station s280 = new Station(m,ns_modele); s280.mesStations(Sully_Morland,1);
		Resource Télégraphe = m.createResource(ns_individus + "Télégraphe");  Station s281 = new Station(m,ns_modele); s281.mesStations(Télégraphe,1);
		Resource Temple = m.createResource(ns_individus + "Temple");  Station s282 = new Station(m,ns_modele); s282.mesStations(Temple,1);
		Resource Ternes = m.createResource(ns_individus + "Ternes");  Station s283 = new Station(m,ns_modele); s283.mesStations(Ternes,1);
		Resource Tolbiac = m.createResource(ns_individus + "Tolbiac");  Station s284 = new Station(m,ns_modele); s284.mesStations(Tolbiac,1);
		Resource Trinité_d_Estienne_d_Orves = m.createResource(ns_individus + "Trinité_-_d_Estienne_d_Orves");  Station s285 = new Station(m,ns_modele); s285.mesStations(Trinité_d_Estienne_d_Orves,1);
		Resource Trocadéro = m.createResource(ns_individus + "Trocadéro");  Station s286 = new Station(m,ns_modele); s286.mesStations(Trocadéro,1);
		Resource Tuileries = m.createResource(ns_individus + "Tuileries");  Station s287 = new Station(m,ns_modele); s287.mesStations(Tuileries,1);
		Resource Vaneau = m.createResource(ns_individus + "Vaneau");  Station s288 = new Station(m,ns_modele); s288.mesStations(Vaneau,1);
		Resource Varenne = m.createResource(ns_individus + "Varenne");  Station s289 = new Station(m,ns_modele); s289.mesStations(Varenne,1);
		Resource Vaugirard = m.createResource(ns_individus + "Vaugirard");  Station s290 = new Station(m,ns_modele); s290.mesStations(Vaugirard,1);
		Resource Vavin = m.createResource(ns_individus + "Vavin");  Station s291 = new Station(m,ns_modele); s291.mesStations(Vavin,1);
		Resource Verdun_Sud = m.createResource(ns_individus + "Verdun_Sud");  Station s292 = new Station(m,ns_modele); s292.mesStations(Verdun_Sud,1);
		Resource Victor_Hugo = m.createResource(ns_individus + "Victor_Hugo");  Station s293 = new Station(m,ns_modele); s293.mesStations(Victor_Hugo,1);
		Resource Villejuif_Léo_Lagrange = m.createResource(ns_individus + "Villejuif_-_Léo_Lagrange");  Station s294 = new Station(m,ns_modele); s294.mesStations(Villejuif_Léo_Lagrange,2);
		Resource Villejuif_Louis_Aragon = m.createResource(ns_individus + "Villejuif_-_Louis_Aragon");  Station s295 = new Station(m,ns_modele); s295.mesStations(Villejuif_Louis_Aragon,2);
		Resource Villejuif_Paul_Vaillant_Courtier = m.createResource(ns_individus + "Villejuif_-_Paul_Vaillant-Courtier");  Station s296 = new Station(m,ns_modele); s296.mesStations(Villejuif_Paul_Vaillant_Courtier,2);
		Resource Villiers = m.createResource(ns_individus + "Villiers");  Station s297 = new Station(m,ns_modele); s297.mesStations(Villiers,2);
		Resource Volontaires = m.createResource(ns_individus + "Volontaires");  Station s298 = new Station(m,ns_modele); s298.mesStations(Volontaires,1);
		Resource Voltaire = m.createResource(ns_individus + "Voltaire");  Station s299 = new Station(m,ns_modele); s299.mesStations(Voltaire,1);
		Resource Wagram = m.createResource(ns_individus + "Wagram");  Station s300 = new Station(m,ns_modele); s300.mesStations(Wagram,1);


		Resource Bobigny_Pantin_Raymond_Queneau = m.createResource(ns_individus + "Bobigny_-_Pantin_Raymond_Queneau");  Station s301 = new Station(m,ns_modele); s301.mesStations(Bobigny_Pantin_Raymond_Queneau,2);
		Resource Bir_Hakeim = m.createResource(ns_individus + "Bir_Hakeim");  Station s302 = new Station(m,ns_modele); s302.mesStations(Bir_Hakeim,1);
		Resource Créteil_Pointe_du_Lac = m.createResource(ns_individus + "Créteil_Pointe_du_Lac");  Station s303 = new Station(m,ns_modele); s303.mesStations(Créteil_Pointe_du_Lac,2);
		Resource Pont_Cardinet = m.createResource(ns_individus + "Pont_Cardinet");  Station s304 = new Station(m,ns_modele); s304.mesStations(Pont_Cardinet,1);
		Resource Saint_Ouen = m.createResource(ns_individus + "Saint_-_Ouen");  Station s305 = new Station(m,ns_modele); s305.mesStations(Saint_Ouen,2);
		Resource Saint_Sébastien_Froissart = m.createResource(ns_individus + "Saint_-_Sébastien_Froissart");  Station s306 = new Station(m,ns_modele); s306.mesStations(Saint_Sébastien_Froissart,1);
		Resource Iéna = m.createResource(ns_individus + "Iéna");  Station s307 = new Station(m,ns_modele); s307.mesStations(Iéna,1);
		Resource Aubervilliers_Front_Populaire = m.createResource(ns_individus + "Aubervilliers_Front_Populaire");  Station s308 = new Station(m,ns_modele); s308.mesStations(Aubervilliers_Front_Populaire,2);
		Resource Garibaldi = m.createResource(ns_individus + "Garibaldi");  Station s309 = new Station(m,ns_modele); s309.mesStations(Garibaldi,2);


		/*__ les ressources instances de passe_par __*/
		// on cree 2 noeuds par ligne: 1 pour les terminus et 1 pour les autres stations
		Resource anonPP_l1_n1= m.createResource();
		Resource anonPP_l1_n2 = m.createResource();
		Resource anonPP_l2_n1 = m.createResource();
		Resource anonPP_l2_n2 = m.createResource();
		Resource anonPP_l3_n1 = m.createResource(); 
		Resource anonPP_l3_n2 = m.createResource(); 
		Resource anonPP_l3b_n1 = m.createResource(); 
		Resource anonPP_l3b_n2 = m.createResource(); 
		Resource anonPP_l4_n1 = m.createResource(); 
		Resource anonPP_l4_n2 = m.createResource(); 
		Resource anonPP_l5_n1 = m.createResource(); 
		Resource anonPP_l5_n2 = m.createResource(); 
		Resource anonPP_l6_n1 = m.createResource(); 
		Resource anonPP_l6_n2 = m.createResource(); 
		Resource anonPP_l7_n1 = m.createResource(); 
		Resource anonPP_l7_n2 = m.createResource(); 
		Resource anonPP_l7b_n1 = m.createResource(); 
		Resource anonPP_l7b_n2 = m.createResource(); 
		Resource anonPP_l8_n1 = m.createResource(); 
		Resource anonPP_l8_n2 = m.createResource(); 
		Resource anonPP_l9_n1 = m.createResource(); 
		Resource anonPP_l9_n2 = m.createResource(); 
		Resource anonPP_l10_n1 = m.createResource(); 
		Resource anonPP_l10_n2 = m.createResource(); 
		Resource anonPP_l11_n1 = m.createResource(); 
		Resource anonPP_l11_n2 = m.createResource(); 
		Resource anonPP_l12_n1 = m.createResource(); 
		Resource anonPP_l12_n2 = m.createResource(); 
		Resource anonPP_l13_n1 = m.createResource(); 
		Resource anonPP_l13_n2 = m.createResource(); 
		Resource anonPP_l14_n1 = m.createResource(); 
		Resource anonPP_l14_n2 = m.createResource(); 


		//  definition des proprietes liees aux ressources
		// __________________________________________________________________________________________________________________________
		CreatePropriete p1 = new CreatePropriete(m,line); 
		CreatePropriete p2 = new CreatePropriete(m,ligne_metro);
		CreatePropriete p4 = new CreatePropriete(m,passe_par);
		CreatePropriete p6 = new CreatePropriete(m,ligne_metro,line);


		/* Propriete sur la ressource passe_par */
		CreatePropriete ppp1 = new CreatePropriete(m,ns_modele,"Arret");
		CreatePropriete ppp2 = new CreatePropriete(m,ns_modele,"Transport");
		CreatePropriete p_anonP_l1_n1 = new CreatePropriete(m,anonPP_l1_n1,passe_par); CreatePropriete p_anonP_l1_n2 = new CreatePropriete(m,anonPP_l1_n2,passe_par);
		CreatePropriete p_anonP_l2_n1 = new CreatePropriete(m,anonPP_l2_n1,passe_par); CreatePropriete p_anonP_l2_n2 = new CreatePropriete(m,anonPP_l2_n2,passe_par);
		CreatePropriete p_anonP_l3_n1 = new CreatePropriete(m,anonPP_l3_n1,passe_par); CreatePropriete p_anonP_l3_n2 = new CreatePropriete(m,anonPP_l3_n2,passe_par);
		CreatePropriete p_anonP_l3b_n1 = new CreatePropriete(m,anonPP_l3b_n1,passe_par); CreatePropriete p_anonP_l3b_n2 = new CreatePropriete(m,anonPP_l3b_n2,passe_par);
		CreatePropriete p_anonP_l4_n1 = new CreatePropriete(m,anonPP_l4_n1,passe_par); CreatePropriete p_anonP_l4_n2 = new CreatePropriete(m,anonPP_l4_n2,passe_par);
		CreatePropriete p_anonP_l5_n1 = new CreatePropriete(m,anonPP_l5_n1,passe_par); CreatePropriete p_anonP_l5_n2 = new CreatePropriete(m,anonPP_l5_n2,passe_par);
		CreatePropriete p_anonP_l6_n1 = new CreatePropriete(m,anonPP_l6_n1,passe_par); CreatePropriete p_anonP_l6_n2 = new CreatePropriete(m,anonPP_l6_n2,passe_par);
		CreatePropriete p_anonP_l7_n1 = new CreatePropriete(m,anonPP_l7_n1,passe_par); CreatePropriete p_anonP_l7_n2 = new CreatePropriete(m,anonPP_l7_n2,passe_par);
		CreatePropriete p_anonP_l7b_n1 = new CreatePropriete(m,anonPP_l7b_n1,passe_par); CreatePropriete p_anonP_l7b_n2 = new CreatePropriete(m,anonPP_l7b_n2,passe_par);
		CreatePropriete p_anonP_l8_n1 = new CreatePropriete(m,anonPP_l8_n1,passe_par); CreatePropriete p_anonP_l8_n2 = new CreatePropriete(m,anonPP_l8_n2,passe_par);
		CreatePropriete p_anonP_l9_n1 = new CreatePropriete(m,anonPP_l9_n1,passe_par); CreatePropriete p_anonP_l9_n2 = new CreatePropriete(m,anonPP_l9_n2,passe_par);
		CreatePropriete p_anonP_l10_n1 = new CreatePropriete(m,anonPP_l10_n1,passe_par); CreatePropriete p_anonP_l10_n2 = new CreatePropriete(m,anonPP_l10_n2,passe_par);
		CreatePropriete p_anonP_l11_n1 = new CreatePropriete(m,anonPP_l11_n1,passe_par); CreatePropriete p_anonP_l11_n2 = new CreatePropriete(m,anonPP_l11_n2,passe_par);
		CreatePropriete p_anonP_l12_n1 = new CreatePropriete(m,anonPP_l12_n1,passe_par); CreatePropriete p_anonP_l12_n2 = new CreatePropriete(m,anonPP_l12_n2,passe_par);
		CreatePropriete p_anonP_l13_n1 = new CreatePropriete(m,anonPP_l13_n1,passe_par); CreatePropriete p_anonP_l13_n2 = new CreatePropriete(m,anonPP_l13_n2,passe_par);
		CreatePropriete p_anonP_l14_n1 = new CreatePropriete(m,anonPP_l14_n1,passe_par); CreatePropriete p_anonP_l14_n2 = new CreatePropriete(m,anonPP_l14_n2,passe_par);

		/* Propriete sur les lignes de metro */
		CreatePropriete pl0 = new CreatePropriete(m,ns_modele,"Terminus");

		CreatePropriete pl1 = new CreatePropriete(m,ligne_metro1,ligne_metro,"M_1");
		CreatePropriete pl2 = new CreatePropriete(m,ligne_metro2,ligne_metro,"M_2");
		CreatePropriete pl3 = new CreatePropriete(m,ligne_metro3,ligne_metro,"M_3");
		CreatePropriete pl3b = new CreatePropriete(m,ligne_metro3b,ligne_metro,"M_3b");
		CreatePropriete pl4 = new CreatePropriete(m,ligne_metro4,ligne_metro,"M_4");
		CreatePropriete pl5 = new CreatePropriete(m,ligne_metro5,ligne_metro,"M_5");
		CreatePropriete pl6 = new CreatePropriete(m,ligne_metro6,ligne_metro,"M_6");
		CreatePropriete pl7 = new CreatePropriete(m,ligne_metro7,ligne_metro,"M_7");
		CreatePropriete pl7b = new CreatePropriete(m,ligne_metro7b,ligne_metro,"M_7b");
		CreatePropriete pl8 = new CreatePropriete(m,ligne_metro8,ligne_metro,"M_8");
		CreatePropriete pl9 = new CreatePropriete(m,ligne_metro9,ligne_metro,"M_9");
		CreatePropriete pl10 = new CreatePropriete(m,ligne_metro10,ligne_metro,"M_10");
		CreatePropriete pl11 = new CreatePropriete(m,ligne_metro11,ligne_metro,"M_11");
		CreatePropriete pl12 = new CreatePropriete(m,ligne_metro12,ligne_metro,"M_12");
		CreatePropriete pl13 = new CreatePropriete(m,ligne_metro13,ligne_metro,"M_13");
		CreatePropriete pl14 = new CreatePropriete(m,ligne_metro14,ligne_metro,"M_14");

		// creation des proprietes
		// __________________________________________________________________________________________________________________________
		Model prop1 = p1.maProprieteSousClasseDeClass();
		Model prop2 = p2.maProprieteSousClasseDeClass();
		Model prop4 = p4.maProprieteSousClasseDeClass();

		Model prop6 = p6.maProprieteSousClasseDeRessource();

		/* Propriete sur la ressource passe_par */
		Property  arret = ppp1.maPropriete();
		Property  transport = ppp2.maPropriete();
		Model prop_anonP_l1_n1 = p_anonP_l1_n1.maProprieteType(); Model prop_anonP_l1_n2 = p_anonP_l1_n2.maProprieteType();
		Model prop_anonP_l2_n1 = p_anonP_l2_n1.maProprieteType(); Model prop_anonP_l2_n2 = p_anonP_l2_n2.maProprieteType();
		Model prop_anonP_l3_n1 = p_anonP_l3_n1.maProprieteType(); Model prop_anonP_l3_n2 = p_anonP_l3_n2.maProprieteType();
		Model prop_anonP_l3b_n1 = p_anonP_l3b_n1.maProprieteType(); Model prop_anonP_l3b_n2 = p_anonP_l3b_n2.maProprieteType();
		Model prop_anonP_l4_n1 = p_anonP_l4_n1.maProprieteType(); Model prop_anonP_l4_n2 = p_anonP_l4_n2.maProprieteType();
		Model prop_anonP_l5_n1 = p_anonP_l5_n1.maProprieteType(); Model prop_anonP_l5_n2 = p_anonP_l5_n2.maProprieteType();
		Model prop_anonP_l6_n1 = p_anonP_l6_n1.maProprieteType(); Model prop_anonP_l6_n2 = p_anonP_l6_n2.maProprieteType();
		Model prop_anonP_l7_n1 = p_anonP_l7_n1.maProprieteType(); Model prop_anonP_l7_n2 = p_anonP_l7_n2.maProprieteType();
		Model prop_anonP_l7b_n1 = p_anonP_l7b_n1.maProprieteType(); Model prop_anonP_l7b_n2 = p_anonP_l7b_n2.maProprieteType();
		Model prop_anonP_l8_n1 = p_anonP_l8_n1.maProprieteType(); Model prop_anonP_l8_n2 = p_anonP_l8_n2.maProprieteType();
		Model prop_anonP_l9_n1 = p_anonP_l9_n1.maProprieteType(); Model prop_anonP_l9_n2 = p_anonP_l9_n2.maProprieteType();
		Model prop_anonP_l10_n1 = p_anonP_l10_n1.maProprieteType(); Model prop_anonP_l10_n2 = p_anonP_l10_n2.maProprieteType();
		Model prop_anonP_l11_n1 = p_anonP_l11_n1.maProprieteType(); Model prop_anonP_l11_n2 = p_anonP_l11_n2.maProprieteType();
		Model prop_anonP_l12_n1 = p_anonP_l12_n1.maProprieteType(); Model prop_anonP_l12_n2 = p_anonP_l12_n2.maProprieteType();
		Model prop_anonP_l13_n1 = p_anonP_l13_n1.maProprieteType(); Model prop_anonP_l13_n2 = p_anonP_l13_n2.maProprieteType();
		Model prop_anonP_l14_n1 = p_anonP_l14_n1.maProprieteType(); Model prop_anonP_l14_n2 = p_anonP_l14_n2.maProprieteType();


		/* Propriete sur les lignes de metro */
		Property  terminus = pl0.maPropriete();	
		Model prop_ligne1 = pl1.maProprieteType(); Model prop_label1 = pl1.maProprieteLabel();
		Model prop_ligne2 = pl2.maProprieteType(); Model prop_label2 = pl2.maProprieteLabel();
		Model prop_ligne3 = pl3.maProprieteType(); Model prop_label3 = pl3.maProprieteLabel();
		Model prop_ligne3b = pl3b.maProprieteType(); Model prop_label3b = pl3b.maProprieteLabel();
		Model prop_ligne4 = pl4.maProprieteType(); Model prop_label4 = pl4.maProprieteLabel();
		Model prop_ligne5 = pl5.maProprieteType(); Model prop_label5 = pl5.maProprieteLabel();
		Model prop_ligne6 = pl6.maProprieteType(); Model prop_label6 = pl6.maProprieteLabel();
		Model prop_ligne7 = pl7.maProprieteType(); Model prop_label7 = pl7.maProprieteLabel();
		Model prop_ligne7b = pl7b.maProprieteType(); Model prop_label7b = pl7b.maProprieteLabel();
		Model prop_ligne8 = pl8.maProprieteType(); Model prop_label8 = pl8.maProprieteLabel();
		Model prop_ligne9 = pl9.maProprieteType(); Model prop_label9 = pl9.maProprieteLabel();
		Model prop_ligne10 = pl10.maProprieteType(); Model prop_label10 = pl10.maProprieteLabel();
		Model prop_ligne11 = pl11.maProprieteType(); Model prop_label11 = pl11.maProprieteLabel();
		Model prop_ligne12 = pl12.maProprieteType(); Model prop_label12 = pl12.maProprieteLabel();
		Model prop_ligne13 = pl13.maProprieteType(); Model prop_label13 = pl13.maProprieteLabel();
		Model prop_ligne14 = pl14.maProprieteType(); Model prop_label14 = pl14.maProprieteLabel();



		// __________________________________________________________________________________________________________________________
		// ajout d'informations au modele
		// __________________________________________________________________________________________________________________________

		// __________________________________________________________________________________________________________________________	
		// ajout des informations sur les stations de passage des lignes et leur terminus
		// on cree 2 noeuds par ligne: 1 pour les terminus et 1 pour les autres stations
		// __________________________________________________________________________________________________________________________


		//____ la ligne 1, ses terminus et ses arrets
		Model infoTransport_n1_l1 = pl1.ajoute(anonPP_l1_n1, transport, ligne_metro1);
		Model infoArretTermninus1_l1 = pl1.ajoute(anonPP_l1_n1, arret, Chateau_de_Vincennes);
		Model infoArretTermninus2_l1 = pl1.ajoute(anonPP_l1_n1, arret, La_Défense_Grande_Arche);
		Model infoTerminusTrue_l1 = p_anonP_l1_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l1 = p_anonP_l1_n2.maProprieteLiteralBoolean(terminus, "false");
		Model infoTransport2_n2_l1 = pl1.ajoute(anonPP_l1_n2, transport, ligne_metro1);
		Model infoArret1_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Esplanade_de_la_defense);
		Model infoArret2_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Pont_de_Neuilly);
		Model infoArret3_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Les_Sablons);
		Model infoArret4_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Porte_Maillot);
		Model infoArret5_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Argentine);
		Model infoArret6_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Charles_de_Gaulle_Étoile);
		Model infoArret7_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, George_V);
		Model infoArret8_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Franklin_D_Roosevelt);
		Model infoArret9_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Champs_Élysées_Clemenceau);
		Model infoArret10_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Concorde);
		Model infoArret11_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Tuileries);
		Model infoArret12_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Palais_Royal_Musée_du_Louvre);
		Model infoArret13_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Louvre_Rivoli);
		Model infoArret14_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Châtelet);
		Model infoArret15_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Hôtel_de_Ville);
		Model infoArret16_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Saint_Paul);
		Model infoArret17_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Bastille);
		Model infoArret18_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Gare_de_Lyon);
		Model infoArret19_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Reuilly_Diderot);
		Model infoArret20_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Nation);
		Model infoArret21_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Porte_de_Vincennes);
		Model infoArret22_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Saint_Mandé);
		Model infoArret23_n2_l1 = pl1.ajoute(anonPP_l1_n2, arret, Bérault);


		//____ la ligne 2, ses terminus et ses arrets
		Model infoTransport_n1_l2 = pl1.ajoute(anonPP_l2_n1, transport, ligne_metro2);
		Model infoArretTermninus1_l2 = pl1.ajoute(anonPP_l2_n1, arret, Porte_Dauphine);
		Model infoArretTermninus2_l2 = pl1.ajoute(anonPP_l2_n1, arret, Nation);
		Model infoTerminusTrue_l2 = p_anonP_l2_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l2 = p_anonP_l2_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l2 = pl1.ajoute(anonPP_l2_n2, transport, ligne_metro2);
		Model infoArret1_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Victor_Hugo);
		Model infoArret2_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Charles_de_Gaulle_Étoile);
		Model infoArret3_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Ternes);
		Model infoArret4_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Courcelles);
		Model infoArret5_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Monceau);
		Model infoArret6_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Villiers);
		Model infoArret7_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Rome);
		Model infoArret8_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Place_de_Clichy);
		Model infoArret9_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Blanche);
		Model infoArret10_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Pigalle);
		Model infoArret11_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Anvers);
		Model infoArret12_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Barbès_Rochechouart);
		Model infoArret13_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, La_Chapelle);
		Model infoArret14_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Stalingrad);
		Model infoArret15_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Jaurès);
		Model infoArret16_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Colonel_Fabien);
		Model infoArret17_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Belleville);
		Model infoArret18_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Couronnes);
		Model infoArret19_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Ménilmontant);
		Model infoArret20_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Père_Lachaise);
		Model infoArret21_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Alexandre_Dumas);
		Model infoArret22_n2_l2 = pl1.ajoute(anonPP_l2_n2, arret, Avron);


		//____ la ligne 3, ses terminus et ses arrets
		Model infoTransport_n1_l3 = pl1.ajoute(anonPP_l3_n1, transport, ligne_metro3);
		Model infoArretTermninus1_l3 = pl1.ajoute(anonPP_l3_n1, arret, Pont_de_Levallois_Bécon);
		Model infoArretTermninus2_l3 = pl1.ajoute(anonPP_l3_n1, arret, Gallieni);
		Model infoTerminusTrue_l3 = p_anonP_l3_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l3 = p_anonP_l3_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l3 = pl1.ajoute(anonPP_l3_n2, transport, ligne_metro3);
		Model infoArret1_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Anatole_France);
		Model infoArret2_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Louise_Michel);
		Model infoArret3_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Porte_de_Champerret);
		Model infoArret4_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Pereire);
		Model infoArret5_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Wagram);
		Model infoArret6_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Malesherbes);
		Model infoArret7_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Villiers);
		Model infoArret8_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Europe);
		Model infoArret9_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Saint_Lazare);
		Model infoArret10_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Havre_Caumartin);
		Model infoArret11_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Opéra);
		Model infoArret12_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Quatre_Septembre);
		Model infoArret13_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Bourse);
		Model infoArret14_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Sentier);
		Model infoArret15_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Réaumur_Sébastropol);
		Model infoArret16_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Arts_et_Métiers);
		Model infoArret17_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Temple);
		Model infoArret18_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, République);
		Model infoArret19_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Parmentier);
		Model infoArret20_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Père_Lachaise);
		Model infoArret21_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Rue_Saint_Maur);
		Model infoArret22_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Porte_de_Bagnolet);
		Model infoArret23_n2_l3 = pl1.ajoute(anonPP_l3_n2, arret, Gambetta);

		//____ la ligne 3b, ses terminus et ses arrets
		Model infoTransport_n1_l3b = pl1.ajoute(anonPP_l3b_n1, transport, ligne_metro3b);
		Model infoArretTermninus1_l3b = pl1.ajoute(anonPP_l3b_n1, arret, Porte_des_Lilas);
		Model infoArretTermninus2_l3b = pl1.ajoute(anonPP_l3b_n1, arret, Gambetta);
		Model infoTerminusTrue_l3b = p_anonP_l3b_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l3b = p_anonP_l3b_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l3b = pl1.ajoute(anonPP_l3b_n2, transport, ligne_metro3b);
		Model infoArret1_n2_l3b = pl1.ajoute(anonPP_l3b_n2, arret, Saint_Fargeau);
		Model infoArret2_n2_l3b = pl1.ajoute(anonPP_l3b_n2, arret, Pelleport);

		//____ la ligne 4, ses terminus et ses arrets
		Model infoTransport_n1_l4 = pl1.ajoute(anonPP_l4_n1, transport, ligne_metro4);
		Model infoArretTermninus1_l4 = pl1.ajoute(anonPP_l4_n1, arret, Porte_de_Clignancourt);
		Model infoArretTermninus2_l4 = pl1.ajoute(anonPP_l4_n1, arret, Mairie_de_Montrouge);
		Model infoTerminusTrue_l4 = p_anonP_l4_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l4 = p_anonP_l4_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l4 = pl1.ajoute(anonPP_l4_n2, transport, ligne_metro4);
		Model infoArret1_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Simplon);
		Model infoArret2_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Marcadet_Poissonniers);
		Model infoArret3_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Chateau_Rouge);
		Model infoArret4_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Barbès_Rochechouart);
		Model infoArret5_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Gare_du_Nord);
		Model infoArret6_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Gare_de_l_Est);
		Model infoArret7_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Chateau_d_eau);
		Model infoArret8_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Strasbourg_Saint_Denis);
		Model infoArret9_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Réaumur_Sébastropol);
		Model infoArret10_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Étienne_Marcel);
		Model infoArret11_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Les_Halles);
		Model infoArret12_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Châtelet);
		Model infoArret13_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Cité);
		Model infoArret14_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Saint_Michel);
		Model infoArret15_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Odéon);
		Model infoArret16_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Saint_Germain_des_Prés);
		Model infoArret17_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Saint_Sulpice);
		Model infoArret18_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Saint_Placide);
		Model infoArret19_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Montparnasse_Bienvenüe);
		Model infoArret20_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Vavin);
		Model infoArret21_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Raspail);
		Model infoArret22_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Denfert_Rochereau);
		Model infoArret23_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Mouton_Duvernet);
		Model infoArret24_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Alésia);
		Model infoArret25_n2_l4 = pl1.ajoute(anonPP_l4_n2, arret, Porte_d_Orléans);

		//____ la ligne 5, ses terminus et ses arrets
		Model infoTransport_n1_l5 = pl1.ajoute(anonPP_l5_n1, transport, ligne_metro5);
		Model infoArretTermninus1_l5 = pl1.ajoute(anonPP_l5_n1, arret, Bobigny_Pablo_Picasso);
		Model infoArretTermninus2_l5 = pl1.ajoute(anonPP_l5_n1, arret, Place_d_Italie);
		Model infoTerminusTrue_l5 = p_anonP_l5_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l5 = p_anonP_l5_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l5 = pl1.ajoute(anonPP_l5_n2, transport, ligne_metro5);
		Model infoArret1_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Bobigny_Pantin_Raymond_Queneau);
		Model infoArret2_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Église_de_Pantin);
		Model infoArret3_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Hoche);
		Model infoArret4_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Porte_de_Pantin);
		Model infoArret5_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Ourcq);
		Model infoArret6_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Laumière);
		Model infoArret7_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Jaurès);
		Model infoArret8_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Stalingrad);
		Model infoArret9_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Gare_du_Nord);
		Model infoArret10_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Gare_de_l_Est);
		Model infoArret11_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Jacques_Bonsergent);
		Model infoArret12_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, République);
		Model infoArret13_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Oberkampf);
		Model infoArret14_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Richard_Lenoir);
		Model infoArret15_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Bréguet_Sabin);
		Model infoArret16_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Bastille);
		Model infoArret17_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Quai_de_la_Rapée);
		Model infoArret18_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Gare_d_Austerlitz);
		Model infoArret19_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Saint_Marcel);
		Model infoArret20_n2_l5 = pl1.ajoute(anonPP_l5_n2, arret, Campo_Formio);

		//____ la ligne 6, ses terminus et ses arrets
		Model infoTransport_n1_l6 = pl1.ajoute(anonPP_l6_n1, transport, ligne_metro6);
		Model infoArretTermninus1_l6 = pl1.ajoute(anonPP_l6_n1, arret, Charles_de_Gaulle_Étoile);
		Model infoArretTermninus2_l6 = pl1.ajoute(anonPP_l6_n1, arret, Nation);
		Model infoTerminusTrue_l6 = p_anonP_l6_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l6 = p_anonP_l6_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l6 = pl1.ajoute(anonPP_l6_n2, transport, ligne_metro6);
		Model infoArret1_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Kléber);
		Model infoArret2_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Boissière);
		Model infoArret3_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Trocadéro);
		Model infoArret4_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Passy);
		Model infoArret5_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Bir_Hakeim);
		Model infoArret6_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Dupleix);
		Model infoArret7_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, La_Motte_Picquet_Grenelle);
		Model infoArret8_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Cambronne);
		Model infoArret9_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Sèvres_Lecourbe);
		Model infoArret10_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Pasteur);
		Model infoArret11_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Montparnasse_Bienvenüe);
		Model infoArret12_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Edgar_Quinet);
		Model infoArret13_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Raspail);
		Model infoArret14_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Denfert_Rochereau);
		Model infoArret15_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Saint_Jacques);
		Model infoArret16_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Glacière);
		Model infoArret17_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Corvisart);
		Model infoArret18_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Place_d_Italie);
		Model infoArret19_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Nationale);
		Model infoArret20_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Chevaleret);
		Model infoArret21_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Quai_de_la_Gare);
		Model infoArret22_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Bercy);
		Model infoArret23_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Dugommier);
		Model infoArret24_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Daumesnil);
		Model infoArret25_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Bel_Air);
		Model infoArret26_n2_l6 = pl1.ajoute(anonPP_l6_n2, arret, Picpus);

		//____ la ligne 7, ses terminus et ses arrets
		Model infoTransport_n1_l7 = pl1.ajoute(anonPP_l7_n1, transport, ligne_metro7);
		Model infoArretTermninus1_l7 = pl1.ajoute(anonPP_l7_n1, arret, La_Courneuve_8_Mai_1945);
		Model infoArretTermninus2_l7 = pl1.ajoute(anonPP_l7_n1, arret, Mairie_d_Ivry);
		Model infoArretTermninus3_l7 = pl1.ajoute(anonPP_l7_n1, arret, Villejuif_Louis_Aragon);
		Model infoTerminusTrue_l7 = p_anonP_l7_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l7 = p_anonP_l7_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l7 = pl1.ajoute(anonPP_l7_n2, transport, ligne_metro7);
		Model infoArret1_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Fort_d_Aubervilliers);
		Model infoArret2_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Aubervilliers_Pantin_Quatre_Chemins);
		Model infoArret3_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Porte_de_la_Villette);
		Model infoArret4_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Corentin_Cariou);
		Model infoArret5_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Crimée);
		Model infoArret6_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Riquet);
		Model infoArret7_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Stalingrad);
		Model infoArret8_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Louis_Blanc);
		Model infoArret9_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Chateau_Landon);
		Model infoArret10_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Gare_de_l_Est);
		Model infoArret11_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Poissonnière);
		Model infoArret12_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Cadet);
		Model infoArret13_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Le_Peletier);
		Model infoArret14_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Chaussée_d_Antin_La_Fayette);
		Model infoArret15_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Opéra);
		Model infoArret16_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Pyramides);
		Model infoArret17_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Palais_Royal_Musée_du_Louvre);
		Model infoArret18_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Pont_Neuf);
		Model infoArret19_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Châtelet);
		Model infoArret20_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Pont_Marie);
		Model infoArret21_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Sully_Morland);
		Model infoArret22_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Jussieu);
		Model infoArret23_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Place_Monge);
		Model infoArret24_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Censier_Daubenton);
		Model infoArret25_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Les_Gobelins);
		Model infoArret26_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Place_d_Italie);
		Model infoArret27_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Tolbiac);
		Model infoArret28_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Maison_Blanche);
		Model infoArret29_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Porte_d_Italie);
		Model infoArret30_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Porte_de_Choisy);
		Model infoArret31_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Porte_d_Ivry);
		Model infoArret32_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Pierre_et_Marie_Curie);
		Model infoArret33_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Le_Kremelin_Bicêtre);
		Model infoArret34_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Villejuif_Léo_Lagrange);
		Model infoArret35_n2_l7 = pl1.ajoute(anonPP_l7_n2, arret, Villejuif_Paul_Vaillant_Courtier);

		//____ la ligne 7b, ses terminus et ses arrets
		Model infoTransport_n1_l7b = pl1.ajoute(anonPP_l7b_n1, transport, ligne_metro7b);
		Model infoArretTermninus1_l7b = pl1.ajoute(anonPP_l7b_n1, arret, Louis_Blanc);
		Model infoArretTermninus2_l7b = pl1.ajoute(anonPP_l7b_n1, arret, Pré_Saint_Gervais);
		Model infoTerminusTrue_l7b = p_anonP_l7b_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l7b = p_anonP_l7b_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l7b = pl1.ajoute(anonPP_l7b_n2, transport, ligne_metro7b);
		Model infoArret1_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Jaurès);
		Model infoArret2_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Bolivar);
		Model infoArret3_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Buttes_Chaumont);
		Model infoArret4_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Botzaris);
		Model infoArret5_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Danube);
		Model infoArret6_n2_l7b = pl1.ajoute(anonPP_l7b_n2, arret, Place_des_Fêtes);

		//____ la ligne 8, ses terminus et ses arrets
		Model infoTransport_n1_l8 = pl1.ajoute(anonPP_l8_n1, transport, ligne_metro8);
		Model infoArretTermninus1_l8 = pl1.ajoute(anonPP_l8_n1, arret, Balard);
		Model infoArretTermninus2_l8 = pl1.ajoute(anonPP_l8_n1, arret, Créteil_Pointe_du_Lac);
		Model infoTerminusTrue_l8 = p_anonP_l8_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l8 = p_anonP_l8_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l8 = pl1.ajoute(anonPP_l8_n2, transport, ligne_metro8);
		Model infoArret1_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Lourmet);
		Model infoArret2_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Boucicaut);
		Model infoArret3_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Felix_Faure);
		Model infoArret4_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Commerce);
		Model infoArret5_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, La_Motte_Picquet_Grenelle);
		Model infoArret6_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, École_Militaire);
		Model infoArret7_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, La_Tour_Maubourg);
		Model infoArret8_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Invalides);
		Model infoArret9_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Concorde);
		Model infoArret10_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Madeleine);
		Model infoArret11_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Opéra);
		Model infoArret12_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Richelieu_Drouot);
		Model infoArret13_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Grands_Boulevards);
		Model infoArret14_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Bonne_Nouvelle);
		Model infoArret15_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Strasbourg_Saint_Denis);
		Model infoArret16_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, République);
		Model infoArret17_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Filles_du_Calvaire);
		Model infoArret18_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Saint_Sébastien_Froissart);
		Model infoArret19_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Chemin_Vert);
		Model infoArret20_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Bastille);
		Model infoArret21_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Ledru_Rollin);
		Model infoArret22_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Faidherbe_Chaligny);
		Model infoArret23_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Reuilly_Diderot);
		Model infoArret24_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Montgallet);
		Model infoArret25_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Daumesnil);
		Model infoArret26_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Michel_Bizot);
		Model infoArret27_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Porte_Dorée);
		Model infoArret28_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Porte_de_Charenton);
		Model infoArret29_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Liberté);
		Model infoArret30_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Charenton_Écoles);
		Model infoArret31_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, École_Vétérinaire_de_Maisons_Alfort);
		Model infoArret32_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Maisons_Alfort_Stade);
		Model infoArret33_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Maisons_Alfort_Les_Juilliottes);
		Model infoArret34_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Créteil_L_Échat);
		Model infoArret35_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Créteil_Université);
		Model infoArret36_n2_l8 = pl1.ajoute(anonPP_l8_n2, arret, Créteil_Préfecture);

		//____ la ligne 9, ses terminus et ses arrets
		Model infoTransport_n1_l9 = pl1.ajoute(anonPP_l9_n1, transport, ligne_metro9);
		Model infoArretTermninus1_l9 = pl1.ajoute(anonPP_l9_n1, arret, Pont_de_Sèvres);
		Model infoArretTermninus2_l9 = pl1.ajoute(anonPP_l9_n1, arret, Mairie_de_Montreuil);
		Model infoTerminusTrue_l9 = p_anonP_l9_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l9 = p_anonP_l9_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l9 = pl1.ajoute(anonPP_l9_n2, transport, ligne_metro9);
		Model infoArret1_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Billancourt);
		Model infoArret2_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Marcel_Sembat);
		Model infoArret3_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Porte_de_Saint_Cloud);
		Model infoArret4_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Exelmans);
		Model infoArret5_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Michel_Ange_Molitor);
		Model infoArret6_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Michel_Ange_Auteuil);
		Model infoArret7_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Jasmin);
		Model infoArret8_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Ranelagh);
		Model infoArret9_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, La_Muette);
		Model infoArret10_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Rue_de_la_Pompe);
		Model infoArret11_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Trocadéro);
		Model infoArret12_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Iéna);
		Model infoArret13_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Alma_Marceau);
		Model infoArret14_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Franklin_D_Roosevelt);
		Model infoArret15_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Saint_Philippe_du_Roule);
		Model infoArret16_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Miromesnil);
		Model infoArret17_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Saint_Augustin);
		Model infoArret18_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Havre_Caumartin);
		Model infoArret19_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Chaussée_d_Antin_La_Fayette);
		Model infoArret20_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Richelieu_Drouot);
		Model infoArret21_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Grands_Boulevards);
		Model infoArret22_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Bonne_Nouvelle);
		Model infoArret23_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Strasbourg_Saint_Denis);
		Model infoArret24_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, République);
		Model infoArret25_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Oberkampf);
		Model infoArret26_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Saint_Ambroise);
		Model infoArret27_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Voltaire);
		Model infoArret28_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Charonne);
		Model infoArret29_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Rue_des_Boulets);
		Model infoArret30_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Nation);
		Model infoArret31_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Buzenval);
		Model infoArret32_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Maraîchers);
		Model infoArret33_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Porte_de_Montreuil);
		Model infoArret34_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Robespierre);
		Model infoArret35_n2_l9 = pl1.ajoute(anonPP_l9_n2, arret, Croix_de_Chavaux);

		//____ la ligne 10, ses terminus et ses arrets
		Model infoTransport_n1_l10 = pl1.ajoute(anonPP_l10_n1, transport, ligne_metro10);
		Model infoArretTermninus1_l10 = pl1.ajoute(anonPP_l10_n1, arret, Boulogne_Pont_de_Saint_Cloud);
		Model infoArretTermninus2_l10 = pl1.ajoute(anonPP_l10_n1, arret, Gare_d_Austerlitz);
		Model infoTerminusTrue_l10 = p_anonP_l10_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l10 = p_anonP_l10_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l10 = pl1.ajoute(anonPP_l10_n2, transport, ligne_metro10);
		Model infoArret1_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Boulogne_Jean_Jaurès);
		Model infoArret2_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Porte_d_Auteuil);
		Model infoArret3_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Michel_Ange_Molitor);
		Model infoArret4_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Michel_Ange_Auteuil);
		Model infoArret5_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Chardon_Lagache);
		Model infoArret6_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Église_d_Auteuil);
		Model infoArret7_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Mirabeau);
		Model infoArret8_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Javel_André_Citroën);
		Model infoArret9_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Charles_Michels);
		Model infoArret10_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Avenue_Émile_Zola);
		Model infoArret11_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, La_Motte_Picquet_Grenelle);
		Model infoArret12_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Ségur);
		Model infoArret13_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Duroc);
		Model infoArret14_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Vaneau);
		Model infoArret15_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Sèvres_Babylone);
		Model infoArret16_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Mabillon);
		Model infoArret17_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Odéon);
		Model infoArret18_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Cluny_La_Sorbonne);
		Model infoArret19_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Maubert_Mutualité);
		Model infoArret20_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Cardinal_Lemoine);
		Model infoArret21_n2_l10 = pl1.ajoute(anonPP_l10_n2, arret, Jussieu);

		//____ la ligne 11, ses terminus et ses arrets
		Model infoTransport_n1_l11 = pl1.ajoute(anonPP_l11_n1, transport, ligne_metro11);
		Model infoArretTermninus1_l11 = pl1.ajoute(anonPP_l11_n1, arret, Châtelet);
		Model infoArretTermninus2_l11 = pl1.ajoute(anonPP_l11_n1, arret, Mairie_des_Lilas);
		Model infoTerminusTrue_l11 = p_anonP_l11_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l11 = p_anonP_l11_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l11 = pl1.ajoute(anonPP_l11_n2, transport, ligne_metro11);
		Model infoArret1_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Hôtel_de_Ville);
		Model infoArret2_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Rambuteau);
		Model infoArret3_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Arts_et_Métiers);
		Model infoArret4_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, République);
		Model infoArret5_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Goncourt);
		Model infoArret6_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Belleville);
		Model infoArret7_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Pyrénées);
		Model infoArret8_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Jourdin);
		Model infoArret9_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Place_des_Fêtes);
		Model infoArret10_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Télégraphe);
		Model infoArret11_n2_l11 = pl1.ajoute(anonPP_l11_n2, arret, Porte_des_Lilas);

		//____ la ligne 12, ses terminus et ses arrets
		Model infoTransport_n1_l12 = pl1.ajoute(anonPP_l12_n1, transport, ligne_metro12);
		Model infoArretTermninus1_l12 = pl1.ajoute(anonPP_l12_n1, arret, Aubervilliers_Front_Populaire);
		Model infoArretTermninus2_l12 = pl1.ajoute(anonPP_l12_n1, arret, Mairie_d_Issy);
		Model infoTerminusTrue_l12 = p_anonP_l12_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l12 = p_anonP_l12_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l12 = pl1.ajoute(anonPP_l12_n2, transport, ligne_metro12);
		Model infoArret1_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Porte_de_la_Chapelle);
		Model infoArret2_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Marx_Dormoy);
		Model infoArret3_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Marcadet_Poissonniers);
		Model infoArret4_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Jules_Joffrin);
		Model infoArret5_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Lamarck_Caulaincourt);
		Model infoArret6_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Abbesses);
		Model infoArret7_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Pigalle);
		Model infoArret8_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Saint_Georges);
		Model infoArret9_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Notre_Dame_de_Lorette);
		Model infoArret10_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Trinité_d_Estienne_d_Orves);
		Model infoArret11_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Saint_Lazare);
		Model infoArret12_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Madeleine);
		Model infoArret13_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Concorde);
		Model infoArret14_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Assemblée_Nationale);
		Model infoArret15_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Solférino);
		Model infoArret16_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Rue_du_Bac);
		Model infoArret17_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Sèvres_Babylone);
		Model infoArret18_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Rennes);
		Model infoArret19_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Notre_Dame_des_Champs);
		Model infoArret20_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Montparnasse_Bienvenüe);
		Model infoArret21_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Falguière);
		Model infoArret22_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Pasteur);
		Model infoArret23_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Volontaires);
		Model infoArret24_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Vaugirard);
		Model infoArret25_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Convention);
		Model infoArret26_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Porte_de_Versailles);
		Model infoArret27_n2_l12 = pl1.ajoute(anonPP_l12_n2, arret, Corenti_Celton);

		//____ la ligne 13, ses terminus et ses arrets
		Model infoTransport_n1_l13 = pl1.ajoute(anonPP_l13_n1, transport, ligne_metro13);
		Model infoArretTermninus1_l13 = pl1.ajoute(anonPP_l13_n1, arret, Saint_Denis_Université);
		Model infoArretTermninus2_l13 = pl1.ajoute(anonPP_l13_n1, arret, Asnières_Gennevilliers_Les_Courtilles);
		Model infoArretTermninus3_l13 = pl1.ajoute(anonPP_l13_n1, arret, Châtillon_Montrouge);
		Model infoTerminusTrue_l13 = p_anonP_l13_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l13 = p_anonP_l13_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l13 = pl1.ajoute(anonPP_l13_n2, transport, ligne_metro13);
		Model infoArret1_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Basilique_de_Saint_Denis);
		Model infoArret2_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Saint_Denis_Porte_de_Paris);
		Model infoArret3_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Carrefour_Pleyel);
		Model infoArret4_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Mairie_de_Saint_Ouen);
		Model infoArret5_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Garibaldi);
		Model infoArret6_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Porte_de_Saint_Ouen);
		Model infoArret7_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Guy_Môquet);
		Model infoArret8_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Les_Agnettes);
		Model infoArret9_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Gabriel_Péri);
		Model infoArret10_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Mairie_de_Clichy);
		Model infoArret11_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Porte_de_Clichy);
		Model infoArret12_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Brochant);
		Model infoArret13_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, La_Fourche);
		Model infoArret14_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Place_de_Clichy);
		Model infoArret15_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Liège);
		Model infoArret16_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Saint_Lazare);
		Model infoArret17_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Miromesnil);
		Model infoArret18_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Champs_Élysées_Clemenceau);
		Model infoArret19_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Invalides);
		Model infoArret20_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Varenne);
		Model infoArret21_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Saint_François_Xavier);
		Model infoArret22_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Duroc);
		Model infoArret23_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Montparnasse_Bienvenüe);
		Model infoArret24_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Gaîté);
		Model infoArret25_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Pernety);
		Model infoArret26_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Plaisance);
		Model infoArret27_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Porte_de_Vanves);
		Model infoArret28_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Malakoff_Plateau_de_Vanves);
		Model infoArret29_n2_l13 = pl1.ajoute(anonPP_l13_n2, arret, Malakoff_Rue_Étienne_Dolet);

		//____ la ligne 14, ses terminus et ses arrets
		Model infoTransport_n1_l14 = pl1.ajoute(anonPP_l14_n1, transport, ligne_metro14);
		Model infoArretTermninus1_l14 = pl1.ajoute(anonPP_l14_n1, arret, Mairie_de_Saint_Ouen);
		Model infoArretTermninus2_l14 = pl1.ajoute(anonPP_l14_n1, arret, Olympiades);
		Model infoTerminusTrue_l14 = p_anonP_l14_n1.maProprieteLiteralBoolean(terminus, "True");

		Model infoTerminusFalse_l14 = p_anonP_l14_n2.maProprieteLiteralBoolean(terminus, "False");
		Model infoTransport2_n2_l14 = pl1.ajoute(anonPP_l14_n2, transport, ligne_metro14);
		Model infoArret1_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Saint_Ouen);
		Model infoArret2_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Porte_de_Clichy);
		Model infoArret3_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Pont_Cardinet);
		Model infoArret4_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Saint_Lazare);
		Model infoArret5_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Madeleine);
		Model infoArret6_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Pyramides);
		Model infoArret7_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Châtelet);
		Model infoArret8_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Gare_de_Lyon);
		Model infoArret9_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Bercy);
		Model infoArret10_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Cour_Saint_Émilion);
		Model infoArret11_n2_l14 = pl1.ajoute(anonPP_l14_n2, arret, Bibliothèque_François_Mitterrand);

		//-------------------------------------------------------------------------------------------------------------
		// ajout des informations sur les connexions sur les lignes
		//-------------------------------------------------------------------------------------------------------------
		//____ la ligne 1 direction "Chateau de Vincennes" (// !!! param distance et temps à modifier!)
		Connexion c1_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes); 	c1_l1.mesConnexions(ligne_metro1,La_Défense_Grande_Arche, Esplanade_de_la_defense,"M_1",300,120);
		Connexion c2_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c2_l1.mesConnexions(ligne_metro1,Esplanade_de_la_defense, Pont_de_Neuilly,"M_1",300,120);
		Connexion c3_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c3_l1.mesConnexions(ligne_metro1,Pont_de_Neuilly, Les_Sablons,"M_1",300,120);
		Connexion c4_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c4_l1.mesConnexions(ligne_metro1,Les_Sablons, Porte_Maillot,"M_1",300,120);
		Connexion c5_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c5_l1.mesConnexions(ligne_metro1,Porte_Maillot, Argentine,"M_1",300,120);
		Connexion c6_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes); 	c6_l1.mesConnexions(ligne_metro1,Argentine, Charles_de_Gaulle_Étoile,"M_1",300,120);
		Connexion c7_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c7_l1.mesConnexions(ligne_metro1,Charles_de_Gaulle_Étoile, George_V,"M_1",300,120);
		Connexion c8_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c8_l1.mesConnexions(ligne_metro1,George_V, Franklin_D_Roosevelt,"M_1",300,120);
		Connexion c9_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes); 	c9_l1.mesConnexions(ligne_metro1,Franklin_D_Roosevelt, Champs_Élysées_Clemenceau,"M_1",300,120);
		Connexion c10_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c10_l1.mesConnexions(ligne_metro1,Champs_Élysées_Clemenceau, Concorde,"M_1",300,120);
		Connexion c11_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c11_l1.mesConnexions(ligne_metro1,Concorde, Tuileries,"M_1",300,120);
		Connexion c12_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes); c12_l1.mesConnexions(ligne_metro1,Tuileries, Palais_Royal_Musée_du_Louvre,"M_1",300,120);
		Connexion c13_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c13_l1.mesConnexions(ligne_metro1,Palais_Royal_Musée_du_Louvre, Châtelet,"M_1",300,120);
		Connexion c14_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c14_l1.mesConnexions(ligne_metro1,Châtelet, Hôtel_de_Ville,"M_1",300,120);
		Connexion c15_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c15_l1.mesConnexions(ligne_metro1,Hôtel_de_Ville, Saint_Paul,"M_1",300,120);
		Connexion c16_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c16_l1.mesConnexions(ligne_metro1,Saint_Paul, Bastille,"M_1",300,120);
		Connexion c17_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c17_l1.mesConnexions(ligne_metro1,Bastille, Gare_de_Lyon,"M_1",300,120);
		Connexion c18_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c18_l1.mesConnexions(ligne_metro1,Gare_de_Lyon, Reuilly_Diderot,"M_1",300,120);
		Connexion c19_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c19_l1.mesConnexions(ligne_metro1,Reuilly_Diderot, Nation,"M_1",300,120);
		Connexion c20_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c20_l1.mesConnexions(ligne_metro1,Nation, Porte_de_Vincennes,"M_1",300,120);
		Connexion c21_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c21_l1.mesConnexions(ligne_metro1,Porte_de_Vincennes, Saint_Mandé,"M_1",300,120);
		Connexion c22_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c22_l1.mesConnexions(ligne_metro1,Saint_Mandé, Bérault,"M_1",300,120);
		Connexion c23_l1 = new Connexion(m,ns_modele,ligne_metro,Chateau_de_Vincennes);	c23_l1.mesConnexions(ligne_metro1,Bérault, Chateau_de_Vincennes,"M_1",300,120);

		//____ la ligne 2 direction "Nation"
		Connexion c1_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c1_l2.mesConnexions(ligne_metro2,Porte_Dauphine, Victor_Hugo,"M_2",300,120);
		Connexion c2_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c2_l2.mesConnexions(ligne_metro2,Victor_Hugo, Charles_de_Gaulle_Étoile,"M_2",300,120);
		Connexion c3_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c3_l2.mesConnexions(ligne_metro2,Charles_de_Gaulle_Étoile, Ternes,"M_2",300,120);
		Connexion c4_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c4_l2.mesConnexions(ligne_metro2,Ternes, Courcelles,"M_2",300,120);
		Connexion c5_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c5_l2.mesConnexions(ligne_metro2,Courcelles, Monceau,"M_2",300,120);
		Connexion c6_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c6_l2.mesConnexions(ligne_metro2,Monceau, Villiers,"M_2",300,120);
		Connexion c7_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c7_l2.mesConnexions(ligne_metro2,Villiers, Rome,"M_2",300,120);
		Connexion c8_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c8_l2.mesConnexions(ligne_metro2,Rome, Place_de_Clichy,"M_2",300,120);
		Connexion c9_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c9_l2.mesConnexions(ligne_metro2,Place_de_Clichy, Blanche,"M_2",300,120);
		Connexion c10_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c10_l2.mesConnexions(ligne_metro2,Blanche, Pigalle,"M_2",300,120);
		Connexion c11_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c11_l2.mesConnexions(ligne_metro2,Pigalle, Anvers,"M_2",300,120);
		Connexion c12_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c12_l2.mesConnexions(ligne_metro2,Anvers, Barbès_Rochechouart,"M_2",300,120);
		Connexion c13_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c13_l2.mesConnexions(ligne_metro2,Barbès_Rochechouart, La_Chapelle,"M_2",300,120);
		Connexion c14_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c14_l2.mesConnexions(ligne_metro2,La_Chapelle, Stalingrad,"M_2",300,120);
		Connexion c15_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c15_l2.mesConnexions(ligne_metro2,Stalingrad, Jaurès,"M_2",300,120);
		Connexion c16_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c16_l2.mesConnexions(ligne_metro2,Jaurès, Colonel_Fabien,"M_2",300,120);
		Connexion c17_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c17_l2.mesConnexions(ligne_metro2,Colonel_Fabien, Belleville,"M_2",300,120);
		Connexion c18_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c18_l2.mesConnexions(ligne_metro2,Belleville, Couronnes,"M_2",300,120);
		Connexion c19_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c19_l2.mesConnexions(ligne_metro2,Couronnes, Ménilmontant,"M_2",300,120);
		Connexion c20_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c20_l2.mesConnexions(ligne_metro2,Ménilmontant, Père_Lachaise,"M_2",300,120);
		Connexion c21_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c21_l2.mesConnexions(ligne_metro2,Père_Lachaise, Alexandre_Dumas,"M_2",300,120);
		Connexion c22_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c22_l2.mesConnexions(ligne_metro2,Alexandre_Dumas, Avron,"M_2",300,120);
		Connexion c23_l2 = new Connexion(m,ns_modele,ligne_metro,Nation); c23_l2.mesConnexions(ligne_metro2,Avron, Nation,"M_2",300,120);

		//____ la ligne 3 direction "Gallieni"
		Connexion c1_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c1_l3.mesConnexions(ligne_metro3,Pont_de_Levallois_Bécon, Anatole_France,"M_3",300,120);
		Connexion c2_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c2_l3.mesConnexions(ligne_metro3,Anatole_France, Louise_Michel,"M_3",300,120);
		Connexion c3_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c3_l3.mesConnexions(ligne_metro3,Louise_Michel, Porte_de_Champerret,"M_3",300,120);
		Connexion c4_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c4_l3.mesConnexions(ligne_metro3,Porte_de_Champerret, Pereire,"M_3",300,120);
		Connexion c5_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c5_l3.mesConnexions(ligne_metro3,Pereire, Wagram,"M_3",300,120);
		Connexion c6_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c6_l3.mesConnexions(ligne_metro3,Wagram, Malesherbes,"M_3",300,120);
		Connexion c7_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c7_l3.mesConnexions(ligne_metro3,Malesherbes, Villiers,"M_3",300,120);
		Connexion c8_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c8_l3.mesConnexions(ligne_metro3,Villiers, Europe,"M_3",300,120);
		Connexion c9_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c9_l3.mesConnexions(ligne_metro3,Europe, Saint_Lazare,"M_3",300,120);
		Connexion c10_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c10_l3.mesConnexions(ligne_metro3,Saint_Lazare, Havre_Caumartin,"M_3",300,120);
		Connexion c11_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c11_l3.mesConnexions(ligne_metro3,Havre_Caumartin, Opéra,"M_3",300,120);
		Connexion c12_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c12_l3.mesConnexions(ligne_metro3,Opéra, Quatre_Septembre,"M_3",300,120);
		Connexion c13_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c13_l3.mesConnexions(ligne_metro3,Quatre_Septembre, Bourse,"M_3",300,120);
		Connexion c14_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c14_l3.mesConnexions(ligne_metro3,Bourse, Sentier,"M_3",300,120);
		Connexion c15_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c15_l3.mesConnexions(ligne_metro3,Sentier, Réaumur_Sébastropol,"M_3",300,120);
		Connexion c16_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c16_l3.mesConnexions(ligne_metro3,Réaumur_Sébastropol, Arts_et_Métiers,"M_3",300,120);
		Connexion c17_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c17_l3.mesConnexions(ligne_metro3,Arts_et_Métiers, Temple,"M_3",300,120);
		Connexion c18_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c18_l3.mesConnexions(ligne_metro3,Temple, République,"M_3",300,120);
		Connexion c19_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c19_l3.mesConnexions(ligne_metro3,République, Parmentier,"M_3",300,120);
		Connexion c20_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c20_l3.mesConnexions(ligne_metro3,Parmentier, Rue_Saint_Maur,"M_3",300,120);
		Connexion c21_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c21_l3.mesConnexions(ligne_metro3,Rue_Saint_Maur, Père_Lachaise,"M_3",300,120);
		Connexion c22_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c22_l3.mesConnexions(ligne_metro3,Père_Lachaise, Gambetta,"M_3",300,120);
		Connexion c23_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c23_l3.mesConnexions(ligne_metro3,Gambetta, Porte_de_Bagnolet,"M_3",300,120);
		Connexion c24_l3 = new Connexion(m,ns_modele,ligne_metro,Gallieni); c24_l3.mesConnexions(ligne_metro3,Porte_de_Bagnolet, Gallieni,"M_3",300,120);

		//____ la ligne 3b direction "Gambetta"
		Connexion c1_l3b = new Connexion(m,ns_modele,ligne_metro,Gambetta); c1_l3b.mesConnexions(ligne_metro3b,Porte_des_Lilas, Saint_Fargeau,"M_3b",300,120);
		Connexion c2_l3b = new Connexion(m,ns_modele,ligne_metro,Gambetta); c2_l3b.mesConnexions(ligne_metro3b,Saint_Fargeau, Pelleport,"M_3b",300,120);
		Connexion c3_l3b = new Connexion(m,ns_modele,ligne_metro,Gambetta); c3_l3b.mesConnexions(ligne_metro3b,Pelleport, Gambetta,"M_3b",300,120);

		//____ la ligne 4 direction "Mairie_de_Montrouge"
		Connexion c1_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c1_l4.mesConnexions(ligne_metro4,Porte_de_Clignancourt, Simplon,"M_4",300,120);
		Connexion c2_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c2_l4.mesConnexions(ligne_metro4,Simplon, Marcadet_Poissonniers,"M_4",300,120);
		Connexion c3_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c3_l4.mesConnexions(ligne_metro4,Marcadet_Poissonniers, Chateau_Rouge,"M_4",300,120);
		Connexion c4_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c4_l4.mesConnexions(ligne_metro4,Chateau_Rouge, Barbès_Rochechouart,"M_4",300,120);
		Connexion c5_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c5_l4.mesConnexions(ligne_metro4,Barbès_Rochechouart, Gare_du_Nord,"M_4",300,120);
		Connexion c6_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c6_l4.mesConnexions(ligne_metro4,Gare_du_Nord, Gare_de_l_Est,"M_4",300,120);
		Connexion c7_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c7_l4.mesConnexions(ligne_metro4,Gare_de_l_Est, Chateau_d_eau,"M_4",300,120);
		Connexion c8_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c8_l4.mesConnexions(ligne_metro4,Chateau_d_eau, Strasbourg_Saint_Denis,"M_4",300,120);
		Connexion c9_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c9_l4.mesConnexions(ligne_metro4,Strasbourg_Saint_Denis, Réaumur_Sébastropol,"M_4",300,120);
		Connexion c10_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c10_l4.mesConnexions(ligne_metro4,Réaumur_Sébastropol, Étienne_Marcel,"M_4",300,120);
		Connexion c11_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c11_l4.mesConnexions(ligne_metro4,Étienne_Marcel, Les_Halles,"M_4",300,120);
		Connexion c12_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c12_l4.mesConnexions(ligne_metro4,Les_Halles, Châtelet,"M_4",300,120);
		Connexion c13_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c13_l4.mesConnexions(ligne_metro4,Châtelet, Cité,"M_4",300,120);
		Connexion c14_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c14_l4.mesConnexions(ligne_metro4,Cité, Saint_Michel,"M_4",300,120);
		Connexion c15_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c15_l4.mesConnexions(ligne_metro4,Saint_Michel, Odéon,"M_4",300,120);
		Connexion c16_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c16_l4.mesConnexions(ligne_metro4,Odéon, Saint_Germain_des_Prés,"M_4",300,120);
		Connexion c17_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c17_l4.mesConnexions(ligne_metro4,Saint_Germain_des_Prés, Saint_Sulpice,"M_4",300,120);
		Connexion c18_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c18_l4.mesConnexions(ligne_metro4,Saint_Sulpice, Saint_Placide,"M_4",300,120);
		Connexion c19_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c19_l4.mesConnexions(ligne_metro4,Saint_Placide, Montparnasse_Bienvenüe,"M_4",300,120);
		Connexion c20_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c20_l4.mesConnexions(ligne_metro4,Montparnasse_Bienvenüe, Vavin,"M_4",300,120);
		Connexion c21_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c21_l4.mesConnexions(ligne_metro4,Vavin, Raspail,"M_4",300,120);
		Connexion c22_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c22_l4.mesConnexions(ligne_metro4,Raspail, Denfert_Rochereau,"M_4",300,120);
		Connexion c23_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c23_l4.mesConnexions(ligne_metro4,Denfert_Rochereau, Mouton_Duvernet,"M_4",300,120);
		Connexion c24_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c24_l4.mesConnexions(ligne_metro4,Mouton_Duvernet, Alésia,"M_4",300,120);
		Connexion c25_l4 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montrouge); c25_l4.mesConnexions(ligne_metro4,Alésia, Mairie_de_Montrouge,"M_4",300,120);
		
		//____ la ligne 5 direction "Place_d_Italie"
		Connexion c1_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c1_l5.mesConnexions(ligne_metro5,Bobigny_Pablo_Picasso, Bobigny_Pantin_Raymond_Queneau,"M_5",300,120);
		Connexion c2_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c2_l5.mesConnexions(ligne_metro5,Bobigny_Pantin_Raymond_Queneau, Église_de_Pantin,"M_5",300,120);
		Connexion c3_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c3_l5.mesConnexions(ligne_metro5,Église_de_Pantin, Hoche,"M_5",300,120);
		Connexion c4_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c4_l5.mesConnexions(ligne_metro5,Hoche, Porte_de_Pantin,"M_5",300,120);
		Connexion c5_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c5_l5.mesConnexions(ligne_metro5,Porte_de_Pantin, Ourcq,"M_5",300,120);
		Connexion c6_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c6_l5.mesConnexions(ligne_metro5,Ourcq, Laumière,"M_5",300,120);
		Connexion c7_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c7_l5.mesConnexions(ligne_metro5,Laumière, Jaurès,"M_5",300,120);
		Connexion c8_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c8_l5.mesConnexions(ligne_metro5,Jaurès, Stalingrad,"M_5",300,120);
		Connexion c9_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c9_l5.mesConnexions(ligne_metro5,Stalingrad, Gare_du_Nord,"M_5",300,120);
		Connexion c10_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c10_l5.mesConnexions(ligne_metro5,Gare_du_Nord, Gare_de_l_Est,"M_5",300,120);
		Connexion c11_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c11_l5.mesConnexions(ligne_metro5,Gare_de_l_Est, Jacques_Bonsergent,"M_5",300,120);
		Connexion c12_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c12_l5.mesConnexions(ligne_metro5,Jacques_Bonsergent, République,"M_5",300,120);
		Connexion c13_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c13_l5.mesConnexions(ligne_metro5,République, Oberkampf,"M_5",300,120);
		Connexion c14_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c14_l5.mesConnexions(ligne_metro5,Oberkampf, Richard_Lenoir,"M_5",300,120);
		Connexion c15_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c15_l5.mesConnexions(ligne_metro5,Richard_Lenoir, Bréguet_Sabin,"M_5",300,120);
		Connexion c16_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c16_l5.mesConnexions(ligne_metro5,Bréguet_Sabin, Bastille,"M_5",300,120);
		Connexion c17_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c17_l5.mesConnexions(ligne_metro5,Bastille, Quai_de_la_Rapée,"M_5",300,120);
		Connexion c18_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c18_l5.mesConnexions(ligne_metro5,Quai_de_la_Rapée, Gare_d_Austerlitz,"M_5",300,120);
		Connexion c19_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c19_l5.mesConnexions(ligne_metro5,Gare_d_Austerlitz, Saint_Marcel,"M_5",300,120);
		Connexion c20_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c20_l5.mesConnexions(ligne_metro5,Saint_Marcel, Campo_Formio,"M_5",300,120);
		Connexion c21_l5 = new Connexion(m,ns_modele,ligne_metro,Place_d_Italie); c21_l5.mesConnexions(ligne_metro5,Campo_Formio, Place_d_Italie,"M_5",300,120);

		//____ la ligne 6 direction "Nation"
		Connexion c1_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c1_l6.mesConnexions(ligne_metro6,Charles_de_Gaulle_Étoile, Kléber,"M_6",300,120);
		Connexion c2_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c2_l6.mesConnexions(ligne_metro6,Kléber, Boissière,"M_6",300,120);
		Connexion c3_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c3_l6.mesConnexions(ligne_metro6,Boissière, Trocadéro,"M_6",300,120);
		Connexion c4_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c4_l6.mesConnexions(ligne_metro6,Trocadéro, Passy,"M_6",300,120);
		Connexion c5_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c5_l6.mesConnexions(ligne_metro6,Passy, Bir_Hakeim,"M_6",300,120);
		Connexion c6_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c6_l6.mesConnexions(ligne_metro6,Bir_Hakeim, Dupleix,"M_6",300,120);
		Connexion c7_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c7_l6.mesConnexions(ligne_metro6,Dupleix, La_Motte_Picquet_Grenelle,"M_6",300,120);
		Connexion c8_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c8_l6.mesConnexions(ligne_metro6,La_Motte_Picquet_Grenelle, Cambronne,"M_6",300,120);
		Connexion c9_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c9_l6.mesConnexions(ligne_metro6,Cambronne, Sèvres_Lecourbe,"M_6",300,120);
		Connexion c10_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c10_l6.mesConnexions(ligne_metro6,Sèvres_Lecourbe, Pasteur,"M_6",300,120);
		Connexion c11_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c11_l6.mesConnexions(ligne_metro6,Pasteur, Montparnasse_Bienvenüe,"M_6",300,120);
		Connexion c12_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c12_l6.mesConnexions(ligne_metro6,Montparnasse_Bienvenüe, Edgar_Quinet,"M_6",300,120);
		Connexion c13_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c13_l6.mesConnexions(ligne_metro6,Edgar_Quinet, Raspail,"M_6",300,120);
		Connexion c14_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c14_l6.mesConnexions(ligne_metro6,Raspail, Denfert_Rochereau,"M_6",300,120);
		Connexion c15_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c15_l6.mesConnexions(ligne_metro6,Denfert_Rochereau, Saint_Jacques,"M_6",300,120);
		Connexion c16_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c16_l6.mesConnexions(ligne_metro6,Saint_Jacques, Glacière,"M_6",300,120);
		Connexion c17_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c17_l6.mesConnexions(ligne_metro6,Glacière, Corvisart,"M_6",300,120);
		Connexion c18_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c18_l6.mesConnexions(ligne_metro6,Corvisart, Place_d_Italie,"M_6",300,120);
		Connexion c19_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c19_l6.mesConnexions(ligne_metro6,Place_d_Italie, Nationale,"M_6",300,120);
		Connexion c20_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c20_l6.mesConnexions(ligne_metro6,Nationale, Chevaleret,"M_6",300,120);
		Connexion c21_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c21_l6.mesConnexions(ligne_metro6,Chevaleret, Quai_de_la_Gare,"M_6",300,120);
		Connexion c22_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c22_l6.mesConnexions(ligne_metro6,Quai_de_la_Gare,Bercy, "M_6",300,120);
		Connexion c23_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c23_l6.mesConnexions(ligne_metro6,Bercy,Dugommier, "M_6",300,120);
		Connexion c24_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c24_l6.mesConnexions(ligne_metro6,Dugommier, Daumesnil, "M_6",300,120);
		Connexion c25_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c25_l6.mesConnexions(ligne_metro6,Daumesnil, Bel_Air, "M_6",300,120);
		Connexion c26_l6 = new Connexion(m,ns_modele,ligne_metro,Nation); c26_l6.mesConnexions(ligne_metro6,Bel_Air, Picpus, "M_6",300,120);


		//____ la ligne 7 direction "Mairie_d_Ivry"		
		Connexion c1_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c1_l7.mesConnexions(ligne_metro7,La_Courneuve_8_Mai_1945, Fort_d_Aubervilliers,"M_7",300,120);
		Connexion c2_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c2_l7.mesConnexions(ligne_metro7,Fort_d_Aubervilliers, Aubervilliers_Pantin_Quatre_Chemins,"M_7",300,120);
		Connexion c3_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c3_l7.mesConnexions(ligne_metro7,Aubervilliers_Pantin_Quatre_Chemins, Porte_de_la_Villette,"M_7",300,120);
		Connexion c4_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c4_l7.mesConnexions(ligne_metro7,Porte_de_la_Villette, Corentin_Cariou,"M_7",300,120);
		Connexion c5_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c5_l7.mesConnexions(ligne_metro7,Corentin_Cariou, Crimée,"M_7",300,120);
		Connexion c6_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c6_l7.mesConnexions(ligne_metro7,Crimée, Riquet,"M_7",300,120);
		Connexion c7_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c7_l7.mesConnexions(ligne_metro7,Riquet, Stalingrad,"M_7",300,120);
		Connexion c8_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c8_l7.mesConnexions(ligne_metro7,Stalingrad, Louis_Blanc,"M_7",300,120);
		Connexion c9_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c9_l7.mesConnexions(ligne_metro7,Louis_Blanc, Chateau_Landon,"M_7",300,120);
		Connexion c10_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c10_l7.mesConnexions(ligne_metro7,Chateau_Landon, Gare_de_l_Est,"M_7",300,120);
		Connexion c11_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c11_l7.mesConnexions(ligne_metro7,Gare_de_l_Est, Poissonnière,"M_7",300,120);
		Connexion c12_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c12_l7.mesConnexions(ligne_metro7,Poissonnière, Cadet,"M_7",300,120);
		Connexion c13_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c13_l7.mesConnexions(ligne_metro7,Cadet, Le_Peletier,"M_7",300,120);
		Connexion c14_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c14_l7.mesConnexions(ligne_metro7,Le_Peletier, Chaussée_d_Antin_La_Fayette,"M_7",300,120);
		Connexion c15_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c15_l7.mesConnexions(ligne_metro7,Chaussée_d_Antin_La_Fayette, Opéra,"M_7",300,120);
		Connexion c16_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c16_l7.mesConnexions(ligne_metro7,Opéra, Pyramides,"M_7",300,120);
		Connexion c17_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c17_l7.mesConnexions(ligne_metro7,Pyramides, Palais_Royal_Musée_du_Louvre,"M_7",300,120);
		Connexion c18_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c18_l7.mesConnexions(ligne_metro7,Palais_Royal_Musée_du_Louvre, Pont_Neuf,"M_7",300,120);
		Connexion c19_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c19_l7.mesConnexions(ligne_metro7,Pont_Neuf, Châtelet,"M_7",300,120);
		Connexion c20_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c20_l7.mesConnexions(ligne_metro7,Châtelet, Pont_Marie,"M_7",300,120);
		Connexion c21_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c21_l7.mesConnexions(ligne_metro7,Pont_Marie, Sully_Morland,"M_7",300,120);
		Connexion c22_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c22_l7.mesConnexions(ligne_metro7,Sully_Morland,Jussieu, "M_7",300,120);
		Connexion c23_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c23_l7.mesConnexions(ligne_metro7,Jussieu, Place_Monge, "M_7",300,120);
		Connexion c24_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c24_l7.mesConnexions(ligne_metro7,Place_Monge, Censier_Daubenton, "M_7",300,120);
		Connexion c25_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c25_l7.mesConnexions(ligne_metro7,Censier_Daubenton, Les_Gobelins, "M_7",300,120);
		Connexion c26_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c26_l7.mesConnexions(ligne_metro7,Les_Gobelins, Place_d_Italie, "M_7",300,120);
		Connexion c27_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c27_l7.mesConnexions(ligne_metro7,Place_d_Italie, Tolbiac, "M_7",300,120);
		Connexion c28_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c28_l7.mesConnexions(ligne_metro7,Tolbiac, Maison_Blanche, "M_7",300,120);
		Connexion c29_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c29_l7.mesConnexions(ligne_metro7,Maison_Blanche, Porte_d_Italie, "M_7",300,120);

		Connexion c30_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c30_l7.mesConnexions(ligne_metro7,Porte_d_Italie, Porte_de_Choisy, "M_7",300,120);
		Connexion c31_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c31_l7.mesConnexions(ligne_metro7,Porte_de_Choisy, Porte_d_Ivry, "M_7",300,120);
		Connexion c32_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c32_l7.mesConnexions(ligne_metro7,Porte_d_Ivry, Pierre_et_Marie_Curie, "M_7",300,120);
		Connexion c33_l7 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Ivry); c33_l7.mesConnexions(ligne_metro7,Pierre_et_Marie_Curie, Mairie_d_Ivry, "M_7",300,120);

		//____ la ligne 7 direction "Villejuif_Louis_Aragon"		
		Connexion c01_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c01_l7.mesConnexions(ligne_metro7,La_Courneuve_8_Mai_1945, Fort_d_Aubervilliers,"M_7",300,120);
		Connexion c02_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c02_l7.mesConnexions(ligne_metro7,Fort_d_Aubervilliers, Aubervilliers_Pantin_Quatre_Chemins,"M_7",300,120);
		Connexion c03_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c03_l7.mesConnexions(ligne_metro7,Aubervilliers_Pantin_Quatre_Chemins, Porte_de_la_Villette,"M_7",300,120);
		Connexion c04_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c04_l7.mesConnexions(ligne_metro7,Porte_de_la_Villette, Corentin_Cariou,"M_7",300,120);
		Connexion c05_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c05_l7.mesConnexions(ligne_metro7,Corentin_Cariou, Crimée,"M_7",300,120);
		Connexion c06_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c06_l7.mesConnexions(ligne_metro7,Crimée, Riquet,"M_7",300,120);
		Connexion c07_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c07_l7.mesConnexions(ligne_metro7,Riquet, Stalingrad,"M_7",300,120);
		Connexion c08_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c08_l7.mesConnexions(ligne_metro7,Stalingrad, Louis_Blanc,"M_7",300,120);
		Connexion c09_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c09_l7.mesConnexions(ligne_metro7,Louis_Blanc, Chateau_Landon,"M_7",300,120);
		Connexion c010_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c010_l7.mesConnexions(ligne_metro7,Chateau_Landon, Gare_de_l_Est,"M_7",300,120);
		Connexion c011_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c011_l7.mesConnexions(ligne_metro7,Gare_de_l_Est, Poissonnière,"M_7",300,120);
		Connexion c012_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c012_l7.mesConnexions(ligne_metro7,Poissonnière, Cadet,"M_7",300,120);
		Connexion c013_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c013_l7.mesConnexions(ligne_metro7,Cadet, Le_Peletier,"M_7",300,120);
		Connexion c014_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c014_l7.mesConnexions(ligne_metro7,Le_Peletier, Chaussée_d_Antin_La_Fayette,"M_7",300,120);
		Connexion c015_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c015_l7.mesConnexions(ligne_metro7,Chaussée_d_Antin_La_Fayette, Opéra,"M_7",300,120);
		Connexion c016_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c016_l7.mesConnexions(ligne_metro7,Opéra, Pyramides,"M_7",300,120);
		Connexion c017_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c017_l7.mesConnexions(ligne_metro7,Pyramides, Palais_Royal_Musée_du_Louvre,"M_7",300,120);
		Connexion c018_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c018_l7.mesConnexions(ligne_metro7,Palais_Royal_Musée_du_Louvre, Pont_Neuf,"M_7",300,120);
		Connexion c019_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c019_l7.mesConnexions(ligne_metro7,Pont_Neuf, Châtelet,"M_7",300,120);
		Connexion c020_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c020_l7.mesConnexions(ligne_metro7,Châtelet, Pont_Marie,"M_7",300,120);
		Connexion c021_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c021_l7.mesConnexions(ligne_metro7,Pont_Marie, Sully_Morland,"M_7",300,120);
		Connexion c022_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c022_l7.mesConnexions(ligne_metro7,Sully_Morland,Jussieu, "M_7",300,120);
		Connexion c023_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c023_l7.mesConnexions(ligne_metro7,Jussieu, Place_Monge, "M_7",300,120);
		Connexion c024_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c024_l7.mesConnexions(ligne_metro7,Place_Monge, Censier_Daubenton, "M_7",300,120);
		Connexion c025_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c025_l7.mesConnexions(ligne_metro7,Censier_Daubenton, Les_Gobelins, "M_7",300,120);
		Connexion c026_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c026_l7.mesConnexions(ligne_metro7,Les_Gobelins, Place_d_Italie, "M_7",300,120);
		Connexion c027_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c027_l7.mesConnexions(ligne_metro7,Place_d_Italie, Tolbiac, "M_7",300,120);
		Connexion c028_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c028_l7.mesConnexions(ligne_metro7,Tolbiac, Maison_Blanche, "M_7",300,120);
		Connexion c029_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c029_l7.mesConnexions(ligne_metro7,Maison_Blanche, Le_Kremelin_Bicêtre, "M_7",300,120);

		Connexion c030_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c030_l7.mesConnexions(ligne_metro7,Le_Kremelin_Bicêtre, Villejuif_Léo_Lagrange, "M_7",300,120);
		Connexion c031_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c031_l7.mesConnexions(ligne_metro7,Villejuif_Léo_Lagrange, Villejuif_Paul_Vaillant_Courtier, "M_7",300,120);
		Connexion c032_l7 = new Connexion(m,ns_modele,ligne_metro,Villejuif_Louis_Aragon); c032_l7.mesConnexions(ligne_metro7,Villejuif_Paul_Vaillant_Courtier, Villejuif_Louis_Aragon, "M_7",300,120);


		//____ la ligne 7bis direction "Pré_Saint_Gervais"
		Connexion c1_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c1_l7b.mesConnexions(ligne_metro7b,Louis_Blanc, Jaurès,"M_7b",300,120);
		Connexion c2_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c2_l7b.mesConnexions(ligne_metro7b,Jaurès, Bolivar,"M_7b",300,120);
		Connexion c3_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c3_l7b.mesConnexions(ligne_metro7b,Bolivar, Buttes_Chaumont,"M_7b",300,120);
		Connexion c4_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c4_l7b.mesConnexions(ligne_metro7b,Buttes_Chaumont, Botzaris,"M_7b",300,120);
		Connexion c5_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c5_l7b.mesConnexions(ligne_metro7b,Botzaris, Place_des_Fêtes,"M_7b",300,120);
		Connexion c6_l7b = new Connexion(m,ns_modele,ligne_metro,Pré_Saint_Gervais); c6_l7b.mesConnexions(ligne_metro7b,Place_des_Fêtes, Pré_Saint_Gervais,"M_7b",300,120);

		//____ la ligne 8 direction "Créteil_Pointe_du_Lac"
		Connexion c1_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c1_l8.mesConnexions(ligne_metro8,Balard, Lourmet,"M_8",300,120);
		Connexion c2_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c2_l8.mesConnexions(ligne_metro8,Lourmet, Boucicaut,"M_8",300,120);
		Connexion c3_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c3_l8.mesConnexions(ligne_metro8,Boucicaut, Felix_Faure,"M_8",300,120);
		Connexion c4_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c4_l8.mesConnexions(ligne_metro8,Felix_Faure, Commerce,"M_8",300,120);
		Connexion c5_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c5_l8.mesConnexions(ligne_metro8,Commerce, La_Motte_Picquet_Grenelle,"M_8",300,120);
		Connexion c6_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c6_l8.mesConnexions(ligne_metro8,La_Motte_Picquet_Grenelle, École_Militaire,"M_8",300,120);
		Connexion c7_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c7_l8.mesConnexions(ligne_metro8,École_Militaire, La_Tour_Maubourg,"M_8",300,120);
		Connexion c8_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c8_l8.mesConnexions(ligne_metro8,La_Tour_Maubourg, Invalides,"M_8",300,120);
		Connexion c9_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c9_l8.mesConnexions(ligne_metro8,Invalides, Concorde,"M_8",300,120);
		Connexion c10_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c10_l8.mesConnexions(ligne_metro8,Concorde, Madeleine,"M_8",300,120);
		Connexion c11_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c11_l8.mesConnexions(ligne_metro8,Madeleine, Opéra,"M_8",300,120);
		Connexion c12_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c12_l8.mesConnexions(ligne_metro8,Opéra, Richelieu_Drouot,"M_8",300,120);
		Connexion c13_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c13_l8.mesConnexions(ligne_metro8,Richelieu_Drouot, Grands_Boulevards,"M_8",300,120);
		Connexion c14_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c14_l8.mesConnexions(ligne_metro8,Grands_Boulevards, Bonne_Nouvelle,"M_8",300,120);
		Connexion c15_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c15_l8.mesConnexions(ligne_metro8,Bonne_Nouvelle, Strasbourg_Saint_Denis,"M_8",300,120);
		Connexion c16_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c16_l8.mesConnexions(ligne_metro8,Strasbourg_Saint_Denis, République,"M_8",300,120);
		Connexion c17_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c17_l8.mesConnexions(ligne_metro8,République, Filles_du_Calvaire,"M_8",300,120);
		Connexion c18_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c18_l8.mesConnexions(ligne_metro8,Filles_du_Calvaire, Saint_Sébastien_Froissart,"M_8",300,120);
		Connexion c19_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c19_l8.mesConnexions(ligne_metro8,Saint_Sébastien_Froissart, Chemin_Vert,"M_8",300,120);
		Connexion c20_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c20_l8.mesConnexions(ligne_metro8,Chemin_Vert, Bastille,"M_8",300,120);
		Connexion c21_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c21_l8.mesConnexions(ligne_metro8,Bastille, Ledru_Rollin,"M_8",300,120);
		Connexion c22_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c22_l8.mesConnexions(ligne_metro8,Ledru_Rollin, Faidherbe_Chaligny, "M_8",300,120);
		Connexion c23_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c23_l8.mesConnexions(ligne_metro8,Faidherbe_Chaligny, Reuilly_Diderot, "M_8",300,120);
		Connexion c24_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c24_l8.mesConnexions(ligne_metro8,Reuilly_Diderot, Montgallet, "M_8",300,120);
		Connexion c25_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c25_l8.mesConnexions(ligne_metro8,Montgallet, Daumesnil, "M_8",300,120);
		Connexion c26_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c26_l8.mesConnexions(ligne_metro8,Daumesnil, Michel_Bizot, "M_8",300,120);
		Connexion c27_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c27_l8.mesConnexions(ligne_metro8,Michel_Bizot, Porte_Dorée, "M_8",300,120);
		Connexion c28_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c28_l8.mesConnexions(ligne_metro8,Porte_Dorée, Porte_de_Charenton, "M_8",300,120);
		Connexion c29_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c29_l8.mesConnexions(ligne_metro8,Porte_de_Charenton, Liberté, "M_8",300,120);
		Connexion c30_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c30_l8.mesConnexions(ligne_metro8,Liberté, Charenton_Écoles, "M_8",300,120);
		Connexion c31_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c31_l8.mesConnexions(ligne_metro8,Charenton_Écoles, École_Vétérinaire_de_Maisons_Alfort, "M_8",300,120);
		Connexion c32_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c32_l8.mesConnexions(ligne_metro8,École_Vétérinaire_de_Maisons_Alfort, Maisons_Alfort_Stade, "M_8",300,120);
		Connexion c33_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c33_l8.mesConnexions(ligne_metro8,Maisons_Alfort_Stade, Maisons_Alfort_Les_Juilliottes, "M_8",300,120);
		Connexion c34_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c34_l8.mesConnexions(ligne_metro8,Maisons_Alfort_Les_Juilliottes, Créteil_L_Échat, "M_8",300,120);
		Connexion c35_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c35_l8.mesConnexions(ligne_metro8,Créteil_L_Échat, Créteil_Université, "M_8",300,120);
		Connexion c36_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c36_l8.mesConnexions(ligne_metro8,Créteil_Université, Créteil_Préfecture, "M_8",300,120);
		Connexion c37_l8 = new Connexion(m,ns_modele,ligne_metro,Créteil_Pointe_du_Lac); c37_l8.mesConnexions(ligne_metro8,Créteil_Préfecture, Créteil_Pointe_du_Lac, "M_8",300,120);

		//____ la ligne 9 direction "Mairie_de_Montreuil"
		Connexion c1_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c1_l9.mesConnexions(ligne_metro9,Pont_de_Sèvres, Billancourt,"M_9",300,120);
		Connexion c2_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c2_l9.mesConnexions(ligne_metro9,Billancourt, Marcel_Sembat,"M_9",300,120);
		Connexion c3_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c3_l9.mesConnexions(ligne_metro9,Marcel_Sembat, Porte_de_Saint_Cloud,"M_9",300,120);
		Connexion c4_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c4_l9.mesConnexions(ligne_metro9,Porte_de_Saint_Cloud, Exelmans,"M_9",300,120);
		Connexion c5_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c5_l9.mesConnexions(ligne_metro9,Exelmans, Michel_Ange_Molitor,"M_9",300,120);
		Connexion c6_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c6_l9.mesConnexions(ligne_metro9,Michel_Ange_Molitor, Michel_Ange_Auteuil,"M_9",300,120);
		Connexion c7_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c7_l9.mesConnexions(ligne_metro9,Michel_Ange_Auteuil, Jasmin,"M_9",300,120);
		Connexion c8_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c8_l9.mesConnexions(ligne_metro9,Jasmin, Ranelagh,"M_9",300,120);
		Connexion c9_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c9_l9.mesConnexions(ligne_metro9,Ranelagh, La_Muette,"M_9",300,120);
		Connexion c10_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c10_l9.mesConnexions(ligne_metro9,La_Muette, Rue_de_la_Pompe,"M_9",300,120);
		Connexion c11_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c11_l9.mesConnexions(ligne_metro9,Rue_de_la_Pompe, Trocadéro,"M_9",300,120);
		Connexion c12_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c12_l9.mesConnexions(ligne_metro9,Trocadéro, Iéna,"M_9",300,120);
		Connexion c13_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c13_l9.mesConnexions(ligne_metro9,Iéna, Alma_Marceau,"M_9",300,120);
		Connexion c14_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c14_l9.mesConnexions(ligne_metro9,Alma_Marceau, Franklin_D_Roosevelt,"M_9",300,120);
		Connexion c15_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c15_l9.mesConnexions(ligne_metro9,Franklin_D_Roosevelt, Saint_Philippe_du_Roule,"M_9",300,120);
		Connexion c16_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c16_l9.mesConnexions(ligne_metro9,Saint_Philippe_du_Roule, Miromesnil,"M_9",300,120);
		Connexion c17_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c17_l9.mesConnexions(ligne_metro9,Miromesnil, Saint_Augustin,"M_9",300,120);
		Connexion c18_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c18_l9.mesConnexions(ligne_metro9,Saint_Augustin, Havre_Caumartin,"M_9",300,120);
		Connexion c19_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c19_l9.mesConnexions(ligne_metro9,Havre_Caumartin, Chaussée_d_Antin_La_Fayette,"M_9",300,120);
		Connexion c20_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c20_l9.mesConnexions(ligne_metro9,Chaussée_d_Antin_La_Fayette, Richelieu_Drouot,"M_9",300,120);
		Connexion c21_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c21_l9.mesConnexions(ligne_metro9,Richelieu_Drouot, Grands_Boulevards,"M_9",300,120);
		Connexion c22_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c22_l9.mesConnexions(ligne_metro9,Grands_Boulevards, Bonne_Nouvelle, "M_9",300,120);
		Connexion c23_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c23_l9.mesConnexions(ligne_metro9,Bonne_Nouvelle, Strasbourg_Saint_Denis, "M_9",300,120);
		Connexion c24_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c24_l9.mesConnexions(ligne_metro9,Strasbourg_Saint_Denis, République, "M_9",300,120);
		Connexion c25_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c25_l9.mesConnexions(ligne_metro9,République, Oberkampf, "M_9",300,120);
		Connexion c26_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c26_l9.mesConnexions(ligne_metro9,Oberkampf, Saint_Ambroise, "M_9",300,120);
		Connexion c27_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c27_l9.mesConnexions(ligne_metro9,Saint_Ambroise, Voltaire, "M_9",300,120);
		Connexion c28_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c28_l9.mesConnexions(ligne_metro9,Voltaire, Charonne, "M_9",300,120);
		Connexion c29_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c29_l9.mesConnexions(ligne_metro9,Charonne, Rue_des_Boulets, "M_9",300,120);
		Connexion c30_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c30_l9.mesConnexions(ligne_metro9,Rue_des_Boulets, Nation, "M_9",300,120);
		Connexion c31_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c31_l9.mesConnexions(ligne_metro9,Nation, Buzenval, "M_9",300,120);
		Connexion c32_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c32_l9.mesConnexions(ligne_metro9,Buzenval, Maraîchers, "M_9",300,120);
		Connexion c33_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c33_l9.mesConnexions(ligne_metro9,Maraîchers, Porte_de_Montreuil, "M_9",300,120);
		Connexion c34_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c34_l9.mesConnexions(ligne_metro9,Porte_de_Montreuil, Robespierre, "M_9",300,120);
		Connexion c35_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c35_l9.mesConnexions(ligne_metro9,Robespierre, Croix_de_Chavaux, "M_9",300,120);
		Connexion c36_l9 = new Connexion(m,ns_modele,ligne_metro,Mairie_de_Montreuil); c36_l9.mesConnexions(ligne_metro9,Croix_de_Chavaux, Mairie_de_Montreuil, "M_9",300,120);

		//____ la ligne 10 direction "Gare_d_Austerlitz"  !! attention sens retour différent!!
		Connexion c1_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c1_l10.mesConnexions(ligne_metro10,Boulogne_Pont_de_Saint_Cloud, Boulogne_Jean_Jaurès,"M_10",300,120);
		Connexion c2_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c2_l10.mesConnexions(ligne_metro10,Boulogne_Jean_Jaurès, Michel_Ange_Molitor,"M_10",300,120);
		Connexion c3_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c3_l10.mesConnexions(ligne_metro10,Michel_Ange_Molitor, Chardon_Lagache,"M_10",300,120);
		Connexion c4_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c4_l10.mesConnexions(ligne_metro10,Chardon_Lagache, Mirabeau,"M_10",300,120);

		Connexion c5_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c5_l10.mesConnexions(ligne_metro10,Mirabeau, Javel_André_Citroën,"M_10",300,120);
		Connexion c6_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c6_l10.mesConnexions(ligne_metro10,Javel_André_Citroën, Charles_Michels,"M_10",300,120);
		Connexion c7_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c7_l10.mesConnexions(ligne_metro10,Charles_Michels, Avenue_Émile_Zola,"M_10",300,120);
		Connexion c8_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c8_l10.mesConnexions(ligne_metro10,Avenue_Émile_Zola, La_Motte_Picquet_Grenelle,"M_10",300,120);
		Connexion c9_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c9_l10.mesConnexions(ligne_metro10,La_Motte_Picquet_Grenelle, Ségur,"M_10",300,120);
		Connexion c10_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c10_l10.mesConnexions(ligne_metro10,Ségur, Duroc,"M_10",300,120);
		Connexion c11_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c11_l10.mesConnexions(ligne_metro10,Duroc, Vaneau,"M_10",300,120);
		Connexion c12_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c12_l10.mesConnexions(ligne_metro10,Vaneau, Cadet,"M_10",300,120);
		Connexion c13_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c13_l10.mesConnexions(ligne_metro10,Cadet, Sèvres_Babylone,"M_10",300,120);
		Connexion c14_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c14_l10.mesConnexions(ligne_metro10,Sèvres_Babylone, Mabillon,"M_10",300,120);
		Connexion c15_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c15_l10.mesConnexions(ligne_metro10,Mabillon, Odéon,"M_10",300,120);
		Connexion c16_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c16_l10.mesConnexions(ligne_metro10,Odéon, Cluny_La_Sorbonne,"M_10",300,120);
		Connexion c17_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c17_l10.mesConnexions(ligne_metro10,Cluny_La_Sorbonne, Maubert_Mutualité,"M_10",300,120);
		Connexion c110_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c110_l10.mesConnexions(ligne_metro10,Maubert_Mutualité, Cardinal_Lemoine,"M_10",300,120);
		Connexion c19_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c19_l10.mesConnexions(ligne_metro10,Cardinal_Lemoine, Jussieu,"M_10",300,120);
		Connexion c20_l10 = new Connexion(m,ns_modele,ligne_metro,Gare_d_Austerlitz); c20_l10.mesConnexions(ligne_metro10,Jussieu, Gare_d_Austerlitz,"M_10",300,120);

		//____ la ligne 11 direction "Mairie_des_Lilas"
		Connexion c1_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c1_l11.mesConnexions(ligne_metro11,Châtelet, Hôtel_de_Ville,"M_11",300,120);
		Connexion c2_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c2_l11.mesConnexions(ligne_metro11,Hôtel_de_Ville, Rambuteau,"M_11",300,120);
		Connexion c3_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c3_l11.mesConnexions(ligne_metro11,Rambuteau, Arts_et_Métiers,"M_11",300,120);
		Connexion c4_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c4_l11.mesConnexions(ligne_metro11,Arts_et_Métiers, République,"M_11",300,120);
		Connexion c5_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c5_l11.mesConnexions(ligne_metro11,République, Goncourt,"M_11",300,120);
		Connexion c6_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c6_l11.mesConnexions(ligne_metro11,Goncourt, Belleville,"M_11",300,120);
		Connexion c7_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c7_l11.mesConnexions(ligne_metro11,Belleville, Pyrénées,"M_11",300,120);
		Connexion c8_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c8_l11.mesConnexions(ligne_metro11,Pyrénées, Jourdin,"M_11",300,120);
		Connexion c9_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c9_l11.mesConnexions(ligne_metro11,Jourdin, Place_des_Fêtes,"M_11",300,120);
		Connexion c10_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c10_l11.mesConnexions(ligne_metro11,Place_des_Fêtes, Porte_des_Lilas,"M_11",300,120);
		Connexion c11_l11 = new Connexion(m,ns_modele,ligne_metro,Mairie_des_Lilas); c11_l11.mesConnexions(ligne_metro11,Porte_des_Lilas, Mairie_des_Lilas,"M_11",300,120);


		//____ la ligne 12 direction "Mairie_d_Issy"
		Connexion c1_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c1_l12.mesConnexions(ligne_metro12,Aubervilliers_Front_Populaire, Porte_de_la_Chapelle,"M_12",300,120);
		Connexion c2_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c2_l12.mesConnexions(ligne_metro12,Porte_de_la_Chapelle, Marx_Dormoy,"M_12",300,120);
		Connexion c3_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c3_l12.mesConnexions(ligne_metro12,Marx_Dormoy, Marcadet_Poissonniers,"M_12",300,120);
		Connexion c4_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c4_l12.mesConnexions(ligne_metro12,Marcadet_Poissonniers, Jules_Joffrin,"M_12",300,120);
		Connexion c5_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c5_l12.mesConnexions(ligne_metro12,Jules_Joffrin, Lamarck_Caulaincourt,"M_12",300,120);
		Connexion c6_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c6_l12.mesConnexions(ligne_metro12,Lamarck_Caulaincourt, Abbesses,"M_12",300,120);
		Connexion c7_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c7_l12.mesConnexions(ligne_metro12,Abbesses, Pigalle,"M_12",300,120);
		Connexion c8_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c8_l12.mesConnexions(ligne_metro12,Pigalle, Saint_Georges,"M_12",300,120);
		Connexion c9_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c9_l12.mesConnexions(ligne_metro12,Saint_Georges, Notre_Dame_de_Lorette,"M_12",300,120);
		Connexion c10_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c10_l12.mesConnexions(ligne_metro12,Notre_Dame_de_Lorette, Trinité_d_Estienne_d_Orves,"M_12",300,120);
		Connexion c11_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c11_l12.mesConnexions(ligne_metro12,Trinité_d_Estienne_d_Orves, Saint_Lazare,"M_12",300,120);
		Connexion c12_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c12_l12.mesConnexions(ligne_metro12,Saint_Lazare, Madeleine,"M_12",300,120);
		Connexion c13_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c13_l12.mesConnexions(ligne_metro12,Madeleine, Concorde,"M_12",300,120);
		Connexion c14_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c14_l12.mesConnexions(ligne_metro12,Concorde, Assemblée_Nationale,"M_12",300,120);
		Connexion c15_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c15_l12.mesConnexions(ligne_metro12,Assemblée_Nationale, Solférino,"M_12",300,120);
		Connexion c16_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c16_l12.mesConnexions(ligne_metro12,Solférino, Rue_du_Bac,"M_12",300,120);
		Connexion c17_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c17_l12.mesConnexions(ligne_metro12,Rue_du_Bac, Sèvres_Babylone,"M_12",300,120);
		Connexion c18_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c18_l12.mesConnexions(ligne_metro12,Sèvres_Babylone, Rennes,"M_12",300,120);
		Connexion c19_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c19_l12.mesConnexions(ligne_metro12,Rennes, Notre_Dame_des_Champs,"M_12",300,120);
		Connexion c20_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c20_l12.mesConnexions(ligne_metro12,Notre_Dame_des_Champs, Montparnasse_Bienvenüe,"M_12",300,120);
		Connexion c21_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c21_l12.mesConnexions(ligne_metro12,Montparnasse_Bienvenüe, Falguière,"M_12",300,120);
		Connexion c22_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c22_l12.mesConnexions(ligne_metro12,Falguière, Pasteur, "M_12",300,120);
		Connexion c23_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c23_l12.mesConnexions(ligne_metro12,Pasteur, Volontaires, "M_12",300,120);
		Connexion c24_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c24_l12.mesConnexions(ligne_metro12,Volontaires, Vaugirard, "M_12",300,120);
		Connexion c25_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c25_l12.mesConnexions(ligne_metro12,Vaugirard, Convention, "M_12",300,120);
		Connexion c26_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c26_l12.mesConnexions(ligne_metro12,Convention, Porte_de_Versailles, "M_12",300,120);
		Connexion c27_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c27_l12.mesConnexions(ligne_metro12,Porte_de_Versailles, Corenti_Celton, "M_12",300,120);
		Connexion c28_l12 = new Connexion(m,ns_modele,ligne_metro,Mairie_d_Issy); c28_l12.mesConnexions(ligne_metro12,Corenti_Celton, Mairie_d_Issy, "M_12",300,120);


		//____ la ligne 13 direction "Châtillon_Montrouge"
		Connexion c1_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c1_l13.mesConnexions(ligne_metro13,Saint_Denis_Université, Basilique_de_Saint_Denis,"M_13",300,120);
		Connexion c2_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c2_l13.mesConnexions(ligne_metro13,Basilique_de_Saint_Denis, Saint_Denis_Porte_de_Paris,"M_13",300,120);
		Connexion c3_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c3_l13.mesConnexions(ligne_metro13,Saint_Denis_Porte_de_Paris, Carrefour_Pleyel,"M_13",300,120);
		Connexion c4_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c4_l13.mesConnexions(ligne_metro13,Carrefour_Pleyel, Mairie_de_Saint_Ouen,"M_13",300,120);
		Connexion c5_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c5_l13.mesConnexions(ligne_metro13,Mairie_de_Saint_Ouen, Garibaldi,"M_13",300,120);
		Connexion c6_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c6_l13.mesConnexions(ligne_metro13,Garibaldi, Porte_de_Saint_Ouen,"M_13",300,120);
		Connexion c7_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c7_l13.mesConnexions(ligne_metro13,Porte_de_Saint_Ouen, Guy_Môquet,"M_13",300,120);

		Connexion c01_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c01_l13.mesConnexions(ligne_metro13,Asnières_Gennevilliers_Les_Courtilles, Les_Agnettes,"M_13",300,120);
		Connexion c02_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c02_l13.mesConnexions(ligne_metro13,Les_Agnettes, Gabriel_Péri,"M_13",300,120);
		Connexion c03_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c03_l13.mesConnexions(ligne_metro13,Gabriel_Péri, Mairie_de_Clichy,"M_13",300,120);
		Connexion c04_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c04_l13.mesConnexions(ligne_metro13,Mairie_de_Clichy, Porte_de_Clichy,"M_13",300,120);
		Connexion c05_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c05_l13.mesConnexions(ligne_metro13,Porte_de_Clichy, Brochant,"M_13",300,120);

		Connexion c8_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c8_l13.mesConnexions(ligne_metro13,Guy_Môquet, La_Fourche,"M_13",300,120);
		Connexion c08_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c08_l13.mesConnexions(ligne_metro13,Brochant, La_Fourche,"M_13",300,120);
		
		Connexion c9_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c9_l13.mesConnexions(ligne_metro13,La_Fourche, Place_de_Clichy,"M_13",300,120);
		Connexion c10_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c10_l13.mesConnexions(ligne_metro13,Place_de_Clichy, Liège,"M_13",300,120);
		Connexion c11_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c11_l13.mesConnexions(ligne_metro13,Liège, Saint_Lazare,"M_13",300,120);
		Connexion c12_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c12_l13.mesConnexions(ligne_metro13,Saint_Lazare, Miromesnil,"M_13",300,120);
		Connexion c13_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c13_l13.mesConnexions(ligne_metro13,Miromesnil, Champs_Élysées_Clemenceau,"M_13",300,120);
		Connexion c14_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c14_l13.mesConnexions(ligne_metro13,Champs_Élysées_Clemenceau, Invalides,"M_13",300,120);
		Connexion c15_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c15_l13.mesConnexions(ligne_metro13,Invalides, Varenne,"M_13",300,120);
		Connexion c16_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c16_l13.mesConnexions(ligne_metro13,Varenne, Saint_François_Xavier,"M_13",300,120);
		Connexion c17_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c17_l13.mesConnexions(ligne_metro13,Saint_François_Xavier, Duroc,"M_13",300,120);
		Connexion c18_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c18_l13.mesConnexions(ligne_metro13,Duroc, Montparnasse_Bienvenüe,"M_13",300,120);
		Connexion c19_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c19_l13.mesConnexions(ligne_metro13,Montparnasse_Bienvenüe, Gaîté,"M_13",300,120);
		Connexion c20_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c20_l13.mesConnexions(ligne_metro13,Gaîté, Pernety,"M_13",300,120);
		Connexion c21_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c21_l13.mesConnexions(ligne_metro13,Pernety, Plaisance,"M_13",300,120);
		Connexion c22_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c22_l13.mesConnexions(ligne_metro13,Plaisance, Porte_de_Vanves, "M_13",300,120);
		Connexion c23_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c23_l13.mesConnexions(ligne_metro13,Porte_de_Vanves, Malakoff_Plateau_de_Vanves, "M_13",300,120);
		Connexion c24_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c24_l13.mesConnexions(ligne_metro13,Malakoff_Plateau_de_Vanves, Malakoff_Rue_Étienne_Dolet, "M_13",300,120);
		Connexion c25_l13 = new Connexion(m,ns_modele,ligne_metro,Châtillon_Montrouge); c25_l13.mesConnexions(ligne_metro13,Malakoff_Rue_Étienne_Dolet, Châtillon_Montrouge, "M_13",300,120);

		//____ la ligne 14 direction Olympiades"
		Connexion c1_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c1_l14.mesConnexions(ligne_metro14,Mairie_de_Saint_Ouen, Saint_Ouen,"M_14",300,120);
		Connexion c2_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c2_l14.mesConnexions(ligne_metro14,Saint_Ouen, Porte_de_Clichy,"M_14",300,120);
		Connexion c3_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c3_l14.mesConnexions(ligne_metro14,Porte_de_Clichy, Pont_Cardinet,"M_14",300,120);
		Connexion c4_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c4_l14.mesConnexions(ligne_metro14,Pont_Cardinet, Saint_Lazare,"M_14",300,120);
		Connexion c5_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c5_l14.mesConnexions(ligne_metro14,Saint_Lazare, Madeleine,"M_14",300,120);
		Connexion c6_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c6_l14.mesConnexions(ligne_metro14,Madeleine, Pyramides,"M_14",300,120);
		Connexion c7_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c7_l14.mesConnexions(ligne_metro14,Pyramides, Châtelet,"M_14",300,120);
		Connexion c8_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c8_l14.mesConnexions(ligne_metro14,Châtelet, Gare_de_Lyon,"M_14",300,120);
		Connexion c9_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c9_l14.mesConnexions(ligne_metro14,Gare_de_Lyon, Bercy,"M_14",300,120);
		Connexion c10_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c10_l14.mesConnexions(ligne_metro14,Bercy, Cour_Saint_Émilion,"M_14",300,120);
		Connexion c11_l14 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c11_l14.mesConnexions(ligne_metro14,Cour_Saint_Émilion, Bibliothèque_François_Mitterrand,"M_14",300,120);
		Connexion c11_l15 = new Connexion(m,ns_modele,ligne_metro,Olympiades); c11_l15.mesConnexions(ligne_metro14,Bibliothèque_François_Mitterrand,Olympiades,"M_14",300,120);



		return m;




	}
}
