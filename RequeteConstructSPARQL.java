package full_projetHMIN218;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;


public class RequeteConstructSPARQL extends RequeteSPARQL {

	// constructeurs
	public RequeteConstructSPARQL() {};
	public RequeteConstructSPARQL(String filename) {super(filename);}
	public RequeteConstructSPARQL(String filename, String dirname) {super(filename,dirname);}


	// methodes
	public void requeteConstructType1(String predicate1, String object1, String predicate2, String object2, String outfile) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("**requeteConstructType1 sur le fichier " + super.getFile_projet());
		System.out.println();

		// lecture du modèle
		m.read(super.getFile_projet());

		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"CONSTRUCT WHERE { "
				+ " ?s "+ predicate1 + " " + object1 + " ."
				+ " ?s "+ predicate2 + " " + object2 + " .} "; 

		Query query = QueryFactory.create(rdq);
		QueryExecution qexec = QueryExecutionFactory.create(query, m);
		query.serialize(new IndentedWriter(System.out,true)) ;
		Model results = qexec.execConstruct();
		try {
			FileOutputStream ost = new FileOutputStream(outfile);
			results.write(ost, "N3" ); }
		catch (FileNotFoundException e) {
			System.out.println("pb de fichier");
		}
		qexec.close();
	}



}
