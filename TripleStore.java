package full_projetHMIN218;

import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;


public class TripleStore {

	// attributs
	private String file_projet;
	private String directory;

	// accesseurs
	public String getFile_projet() {
		return file_projet;
	}
	public void setFile_projet(String file_projet) {
		this.file_projet = file_projet;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	// constructeurs
	public TripleStore() {};
	public TripleStore(String filename, String dirname) {
		this.setFile_projet(filename);this.setDirectory(dirname);
	}

	// methodes
	public void defineTripleStore() {
		Dataset ds = TDBFactory.createDataset(directory);
		Model model = ds.getDefaultModel();
		model.read(file_projet);
		ds.close();
	}


	public void sizeTripleStore() {
		Dataset ds = TDBFactory.createDataset(directory) ;
		Model model = ds.getDefaultModel() ;
		System.out.println("nombre de triplets pour le triplestore associé au fichier "+ this.file_projet+" : "+model.size());
		ds.close();
	}
	


}
