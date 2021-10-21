package full_projetHMIN218;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.TransitiveProperty;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.ValidityReport;
import org.apache.jena.util.PrintUtil;
import org.apache.jena.vocabulary.XSD;

public class Ontologie {

	// attributs
	private OntModel om;


	//accesseurs
	public OntModel getOm() {
		return om;
	}
	public void setOm(OntModel om) {
		this.om = om;
	}

	// constructeurs
	public Ontologie() {}
	public Ontologie(OntModel Ontmodel) {
		this.setOm(Ontmodel);
	}


	// methodes
	// method to apply reasoner and create inference model --> a reasoner derive additional truths about the concepts
	public InfModel owlReasoner() {

		Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
	//	Reasoner reasoner = ReasonerRegistry.getOWLMiniReasoner() ;//getRDFSReasoner(); //getTransitiveReasoner(); //getRDFSSimpleReasoner();
		
		reasoner = reasoner.bindSchema(this.om);
		InfModel infmodel = ModelFactory.createInfModel(reasoner, om);
		return infmodel;
	}

	// method to check inconsistency and validate inferred model
	public void owlValidite(InfModel infmodel) {

		ValidityReport validity = infmodel.validate();
		if (validity.isValid()) {
			System.out.println("Modele valide!");
		} else {
			System.out.println("Conflicts");
			for (Iterator i = validity.getReports(); i.hasNext(); ) {
				ValidityReport.Report report = (ValidityReport.Report)i.next();
				System.out.println(" - " + report);
			}
		}

	}


	// method to create classes based on classes in rdf/rdfs model
	public void owlClass(Model model_rdf, String ns) {

		// list the statements in the Model
		StmtIterator iter = model_rdf.listStatements();

		while (iter.hasNext()) {
			Statement stmt = iter.nextStatement(); // get next statement
			Resource subject = stmt.getSubject(); // get the subject

			String tmp = subject.toString();

			Pattern pattern = Pattern.compile(ns, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(tmp);

			boolean matchFound = matcher.find();
			if(matchFound) {

				if(tmp.equals(ns+"Ligne") || tmp.equals(ns+"LigneMetro")) {

					OntClass  ligne = this.om.createClass(ns + "Ligne");
					OntClass  lignemetro = this.om.createClass(ns + "LigneMetro");
					lignemetro.addSuperClass(ligne);
				}	
				else {
					OntClass ma_classe = this.om.createClass(tmp);
				}
			} 

		}
	}

	// method to create properties based on properties in rdf/rdfs model
	public void owlProperty(Model model_rdf, String ns) {

		// list the statements in the Model
		StmtIterator iter = model_rdf.listStatements();

		while (iter.hasNext()) {
			Statement stmt = iter.nextStatement(); // get next statement
			Property predicate = stmt.getPredicate(); // get the predicate

			String tmp = predicate.toString();

			Pattern pattern = Pattern.compile(ns, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(tmp);

			boolean matchFound = matcher.find();
			if(matchFound) {
				if(tmp.equals(ns+"Zone")) {
					DatatypeProperty  zone = this.om.createDatatypeProperty(ns + "Zone");
				}
				if(tmp.equals(ns+"Terminus")) {
					DatatypeProperty  terminus = this.om.createDatatypeProperty(ns + "Terminus");
				}
				if(tmp.equals(ns+"Distance")) {
					DatatypeProperty  distance = this.om.createDatatypeProperty(ns + "Distance");
					distance.addRange(XSD.nonNegativeInteger);
				}
				if(tmp.equals(ns+"Temps")) {
					DatatypeProperty  temps = this.om.createDatatypeProperty(ns + "Temps");
					temps.addRange(XSD.nonNegativeInteger);
				}
				else {
					ObjectProperty ma_propriete = this.om.createObjectProperty(tmp);
				} 
			}

		}
	}
	
	// method to create individuals based on resources in rdf/rdfs model
	public void owlIndividual(Model model_rdf, String ns_individus, String ns_model) {

		// list the statements in the Model
		StmtIterator iter = model_rdf.listStatements();

		while (iter.hasNext()) {
			Statement stmt = iter.nextStatement(); // get next statement
			Resource subject = stmt.getSubject(); // get the subject
			RDFNode object = stmt.getObject(); // get the object
			Property predicate = stmt.getPredicate(); // get the predicate


			// pour les noeuds anonymes
			if(subject.isAnon()) { 

				this.om.add(subject,predicate,object);
			}

			// pour le reste 
			String tmp_s = subject.toString();

			Pattern pattern = Pattern.compile(ns_individus, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(tmp_s);

			boolean matchFound = matcher.find();
			if(matchFound) {
				
				this.om.add(subject,predicate,object);

			}
		}
	}	

	// method to create property Domain 
	public void owlDomain(String ns, String propriete, String classe) {

		ObjectProperty op = this.om.getObjectProperty(ns+propriete);
		OntClass oc = this.om.getOntClass(ns+classe);		

		op.setDomain(oc);

	}

	// method to create property Range 
	public void owlRange(String ns, String propriete, String classe) {

		ObjectProperty op = this.om.getObjectProperty(ns+propriete);
		OntClass oc = this.om.getOntClass(ns+classe);		

		op.setRange(oc);

	}

	// method to create property InverseOf 
	public void owlInverseOf(String ns, String propriete1, String propriete2) {

		ObjectProperty op1 = this.om.getObjectProperty(ns+propriete1);
		ObjectProperty op2 = this.om.getObjectProperty(ns+propriete2);

		op1.addInverseOf(op2);
	}

	// method to create transitivite properties
	public void owlTransitivity(String ns, String propriete1, String propriete2) {
		
		if(propriete2 == null) {
		TransitiveProperty tp1 = this.om.createTransitiveProperty(ns+propriete1);
		}
		else
		{
			TransitiveProperty tp1 = this.om.createTransitiveProperty(ns+propriete1);
			TransitiveProperty tp2 = this.om.createTransitiveProperty(ns+propriete2);

			tp1.addInverseOf(tp2);
		}

	}
	
	// method domain for transitive propterty
	public void owlDomainTransitivity(String ns, String propriete, String classe) {

		TransitiveProperty tp = this.om.getTransitiveProperty(ns+propriete);
		OntClass oc = this.om.getOntClass(ns+classe);		

		tp.setDomain(oc);

	}
	
	// method range for transitive propterty 
	public void owlRangeTransitivity(String ns, String propriete, String classe) {

		TransitiveProperty tp = this.om.getTransitiveProperty(ns+propriete);
		OntClass oc = this.om.getOntClass(ns+classe);		

		tp.setRange(oc);

	}
	
	// exemple transitivité
	public void owlExampleStationEstAvant(String ns_model, String ns_individus,  String propriete1, String propriete2) {

		TransitiveProperty op1 = this.om.getTransitiveProperty(ns_model+propriete1);
		TransitiveProperty op2 = this.om.getTransitiveProperty(ns_model+propriete2);
		ObjectProperty direction = this.om.getObjectProperty(ns_model+"Direction");

		Individual esplanade_la_defense = this.om.getIndividual(ns_individus+"Esplanade_de_la_Défense");
		Individual la_defense = this.om.getIndividual(ns_individus+"La_Défense_Grande_Arche");
		Individual pont_de_neuilly = this.om.getIndividual(ns_individus+"Pont_de_Neuilly");
		Individual chateau_de_vincennes = this.om.getIndividual(ns_individus+"Chateau_de_Vincennes");

		this.om.add(esplanade_la_defense.addProperty(op2, la_defense),direction,chateau_de_vincennes);
		this.om.add(la_defense.addProperty(op2, esplanade_la_defense),direction,chateau_de_vincennes);
		this.om.add(esplanade_la_defense.addProperty(op1, pont_de_neuilly),direction,chateau_de_vincennes);

	}
	// requete ontologie 
	public void rqOntologie(Model m, String ns_model, String ns_individus, String res, String propriete, Resource o) {

		Individual s = this.om.getIndividual(ns_individus+res);
		TransitiveProperty p = this.om.getTransitiveProperty(ns_model+propriete);
				
		for (StmtIterator i = m.listStatements(s,p,o); i.hasNext(); ) {
			Statement stmt = i.nextStatement();
			System.out.println(" - " + PrintUtil.print(stmt));
		}
		System.out.println();

	}

	
}
