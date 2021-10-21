package full_projetHMIN218;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.tdb.TDBFactory;

public class RequeteSelectSPARQL extends RequeteSPARQL {
	
	// constructeurs
	public RequeteSelectSPARQL() {};
	public RequeteSelectSPARQL(String filename) {super(filename);}
	public RequeteSelectSPARQL(String filename, String dirname) {super(filename,dirname);}
	
	// methodes	
	public void exec(Query query, QueryExecution qexec) {
		// affichage et execution de la requete
		query.serialize(new IndentedWriter(System.out,true));
		System.out.println();
		try {
			ResultSet rs = qexec.execSelect() ;
			ResultSetFormatter.out(System.out, rs, query);		  
		}
		finally {qexec.close();}
	}


	public void rqSelectSPARQLType1(String subject, String object, String predicate, int lim) {

		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"SELECT "
				+subject+" "+predicate+" "+object
				+" WHERE { "
				+subject+" "+predicate+" "+object
				+ "}"
				+ "ORDER BY ("
				+ subject
				+ ")"
				+ "LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType1 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType1 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}


	public void rqSelectSPARQLType2(String subject, String object, String predicate, int lim) {
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"SELECT DISTINCT"+subject+" WHERE { "
				+subject+" "+predicate+" "+object
				+ "}"
				+ "ORDER BY ("
				+subject
				+ ")"
				+ "LIMIT " + lim; 


		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType2 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType2 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}

	public void rqSelectSPARQLType3(String subject, String object, String predicate, int int_filter, int lim) {
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				super.getProlog5() + super.getNl() +
				"SELECT DISTINCT"+subject+" "+object
				+ " WHERE { "
				+ subject+" "+predicate+" "+object
				+ " FILTER ("
				+ object
				+ " = "+ int_filter+")"
				+ "} "	
				+ "ORDER BY ("
				+ subject
				+ ") "
				+ "LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType3 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType3 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}

	public void rqSelectSPARQLType4(String subject, String object, String predicate1, String predicate2, int lim) {
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + super.getProlog3() + 
				super.getNl() + super.getProlog4() + super.getNl() +
				super.getProlog5() + super.getNl() + super.getProlog6() + super.getNl() +
				"SELECT DISTINCT"+subject+" "+object
				+ " WHERE { "
				+ "?s" + " " + predicate1 + " " + subject + "."
				+ "?s" + " " + predicate2 + " " + object + "."
				+ "} "	
				+ "ORDER BY ("
				+ subject
				+ ") "
				+ "LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType4 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType4 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}

	public void rqSelectSPARQLType5(String subject, String object, String name_count, String predicate1, String predicate2, int lim) {
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + super.getProlog3() 
				+ super.getNl() + super.getProlog4() + super.getNl() +
				"SELECT "+subject+" (COUNT ("+ object+") as " + name_count + ")"
				+ " WHERE { "
				+ "?s" + " " + predicate1 + " " + subject + ". "
				+ "?s" + " " + predicate2 + " " + object + ". "
				+ "} "
				+ "GROUP BY "+ subject
				+ " LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType5 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType5 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}


	public void rqSelectSPARQLType6(String subject, String object, String name_count, String cond, String predicate1, String predicate2, int lim) {
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				"SELECT "+subject+" (COUNT(DISTINCT "+object+") as " + name_count + ")"
				+ " WHERE { "
				+ "?s" + " " + predicate1 + " " + subject + "."
				+ "?s" + " " + predicate2 + " " + object + ". "
				+ "} "
				+ "GROUP BY "+ subject+ " HAVING (" + name_count + " " + cond + ")"	
				+ "ORDER BY ("
				+ subject
				+ ") "
				+ "LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType6 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType6 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}

	public void rqSelectSPARQLType7(String object1, String object2, String object3, String object4, 
			String predicate1, String predicate2, String predicate3, String predicate4, int lim)
	{
		// requete
		String rdq = super.getProlog1() + super.getNl() + super.getProlog2() + super.getNl() + 
				super.getProlog3() + super.getNl() + super.getProlog4() + super.getNl() +
				super.getProlog5() + super.getNl() + super.getProlog6() + super.getNl() +
				"SELECT DISTINCT"+object1+" "+object2+" "+object3+" "+object4
				+ " WHERE { "
				+ "?s" + " " + predicate1 + " " + object1 + "."
				+ "?s" + " " + predicate2 + " " + object2 + "."
				+ "?s" + " " + predicate3 + " " + object3 + "."
				+ "?s" + " " + predicate4 + " " + object4 + "."
				+ "} "	
				+ "ORDER BY ("
				+ object1
				+ ") "
				+ "LIMIT " + lim; 

		// creer requete SPARQL à partir de la variable pré-définie
		Query query = QueryFactory.create(rdq);

		if (super.getDirectory() == null ||super.getDirectory().length() == 0){
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType7 sur le fichier " + super.getFile_projet());
			System.out.println();
			m.read(super.getFile_projet());
			// execution de la requete
			QueryExecution qexec = QueryExecutionFactory.create(query, m);
			// execution de la requete
			exec(query,qexec);
		}
		else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("**requeteSelectSPARQLType7 pour le triplestore " +super.getDirectory());
			System.out.println();
			Dataset dataset = TDBFactory.createDataset(super.getDirectory());
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			// execution de la requete
			exec(query,qexec);
		}
	}






}
