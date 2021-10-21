package full_projetHMIN218;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;

public class RequeteDescribeSPARQL extends RequeteSPARQL {



	// constructeurs
	public RequeteDescribeSPARQL() {};
	public RequeteDescribeSPARQL(String filename) {super(filename);}
	public RequeteDescribeSPARQL(String filename, String dirname) {super(filename,dirname);}

	// methodes	
	public void exec(Query query, QueryExecution qexec) {
		// affichage et execution de la requete		
		query.serialize(new IndentedWriter(System.out,true));
		try {
			Model results = qexec.execDescribe();
			results.write(System.out, "N3");
			System.out.println();
		}
		finally {qexec.close();
		}
	}


	public void rqDescribeSPARQLType1(String subject, String predicate1, String object1) {

		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"DESCRIBE "
				+ subject
				+" WHERE { "
				+ subject + " " + predicate1 + " " + object1 + " . } ";

		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType1 sur le fichier " + super.getFile_projet());
			System.out.println();
			// lecture du modèle
			m.read(super.getFile_projet());

			QueryExecution qexec = QueryExecutionFactory.create(query, m);

			// execution de la requete
			exec(query,qexec);
		}

		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType1 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}


	}


	public void rqDescribeSPARQLType2(String subject, String predicate1, String object1, String predicate2, String object2) {

		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"DESCRIBE "
				+ subject
				+" WHERE { "
				+ subject + " " + predicate1 + " " + object1 + " . "
				+ subject + " " + predicate2 + "\""+ object2 + "\" . } ";

		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType2 sur le fichier " + super.getFile_projet());
			System.out.println();
			// lecture du modèle
			m.read(super.getFile_projet());

			QueryExecution qexec = QueryExecutionFactory.create(query, m);

			// execution de la requete
			exec(query,qexec);
		}

		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType2 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}


	}

	public void rqDescribeSPARQLType3(String subject, String predicate1, String object1) {

		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"DESCRIBE " +subject+" "+object1
				+ " WHERE { "
				+ subject+" "+predicate1+" "+object1
				+ " FILTER (" + object1
				+")"
				+ "} "	;
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType3 sur le fichier " + super.getFile_projet());
			System.out.println();
			// lecture du modèle
			m.read(super.getFile_projet());

			QueryExecution qexec = QueryExecutionFactory.create(query, m);

			// execution de la requete
			exec(query,qexec);
		}

		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**rqDescribeSPARQLType3 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}


	}


}
