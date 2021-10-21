package full_projetHMIN218;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

public abstract class RequeteSPARQL {
	
	
	// attributs
	static Model m = ModelFactory.createDefaultModel();
	private static final String NL = System.getProperty("line.separator");
	private String file_projet;
	private String directory;
	
	// ---- espaces de noms
	private static final String gare = "http://www.ex.fr/gare_ferroviaire#" ;
	private static final String individus = "http://www.ex.fr/individus#" ;
	private static final String prolog1 = "PREFIX rdf: <"+RDF.getURI()+">" ;
	private static final String prolog2 = "PREFIX rdfs: <"+RDFS.getURI()+">" ;
	private static final String prolog3 = "PREFIX gare: <"+gare+">" ;
	private static final String prolog4 = "PREFIX ex: <"+individus+">" ;
	private static final String prolog5 = "PREFIX int: <http://www.w3.org/2001/XMLSchema#int>";
	private static final String prolog6 = "PREFIX boolean: <http://www.w3.org/2001/XMLSchema#Boolean>";
	
	// accesseurs
	public String getFile_projet() {
		return file_projet;
	}
	public void setFile_projet(String file) {
		this.file_projet = file;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public static String getNl() {
		return NL;
	}
	public static String getProlog1() {
		return prolog1;
	}
	public static String getProlog2() {
		return prolog2;
	}
	public static String getProlog3() {
		return prolog3;
	}
	public static String getProlog4() {
		return prolog4;
	}
	public static String getProlog5() {
		return prolog5;
	}
	public static String getProlog6() {
		return prolog6;
	}

	// constructeurs
	public RequeteSPARQL() {}
	
	public RequeteSPARQL(String filename) {this.setFile_projet(filename);}
	
	public RequeteSPARQL(String filename, String dirname) {
		this.setFile_projet(filename);
		this.setDirectory(dirname);}


}
