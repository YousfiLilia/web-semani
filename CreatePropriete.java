package full_projetHMIN218;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;

public class CreatePropriete {


	// attributs
	private Model m;
	private Resource res;
	private Resource res2;
	private String espace_nom;
	private String nomPropriete;
	private String nomLabel;

	// accesseurs
	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	};

	public Resource getRes() {
		return res;
	}

	public void setRes(Resource res) {
		this.res = res;
	}

	public Resource getRes2() {
		return res2;
	}

	public void setRes2(Resource res2) {
		this.res2 = res2;
	}


	public String getEspace_nom() {
		return espace_nom;
	}

	public void setEspace_nom(String espace_nom) {
		this.espace_nom = espace_nom;
	}

	public String getNomPropriete() {
		return nomPropriete;
	}

	public void setNomPropriete(String nomPropriete) {
		this.nomPropriete = nomPropriete;
	}

	public String getNomLabel() {
		return nomLabel;
	}

	public void setNomLabel(String nomLabel) {
		this.nomLabel = nomLabel;
	}

	// constructeurs
	public CreatePropriete() {};

	public CreatePropriete(Model m, Resource res) {
		this.setM(m); this.setRes(res);
	}

	public CreatePropriete(Model m, Resource res, String nom) {
		this.setM(m); this.setRes(res); this.setNomLabel(nom);
	}

	public CreatePropriete(Model m, Resource res, Resource res2) {
		this.setM(m); this.setRes(res); this.setRes2(res2);
	}

	public CreatePropriete(Model m, Resource res, Resource res2, String nom) {
		this.setM(m); this.setRes(res); this.setRes2(res2); this.setNomLabel(nom);
	}

	public CreatePropriete(Model m, String espace, String nom) {
		this.setM(m); this.setEspace_nom(espace); this.setNomPropriete(nom);
	}


	// methodes
	public Property maPropriete() {

		Property p = m.createProperty(this.espace_nom, this.nomPropriete);

		return p;

	}

	public Model maProprieteSousClasseDeClass() {

		m.add(this.res,RDFS.subClassOf,RDFS.Class);

		return m;

	}

	public Model maProprieteSousClasseDeRessource() {

		m.add(this.res,RDFS.subClassOf,this.res2);

		return m;

	}

	public Model maProprieteType() {

		m.add(this.res,RDF.type,this.res2);

		return m;

	}

	public Model maProprieteLabel() {

		m.add(this.res,RDFS.label,this.nomLabel);

		return m;

	}

	public Model maProprieteLiteralInt(Property p, int valInt) {

		m.add(this.res,p,m.createTypedLiteral(valInt, XSD.getURI() + "int") );

		return m;

	}

	public Model maProprieteLiteralStr(Property p, String str, String lang) {

		m.add(this.res,p,m.createLiteral(str, lang) );

		return m;

	}

	public Model maProprieteLiteralBoolean(Property p, String valBool) {

		m.add(this.res,p,m.createTypedLiteral(valBool, XSD.getURI() + "Boolean") );

		return m;

	}

	public Model maProprieteDomain() {

		m.add(this.res,RDFS.domain,this.res2);

		return m;

	}

	public Model maProprieteRange() {

		m.add(this.res,RDFS.range,this.res2);

		return m;

	}


	public Model ajoute(Resource r1, Property p, Resource r2) {

		m.add(r1,p,r2);

		return m;

	}


}
