package full_projetHMIN218;

import java.io.FileOutputStream;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;

public class Save {

	// attributs
	private Model m;
	private OntModel om;
	private InfModel im;
	private String file;

	// accesseurs
	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	}

	public OntModel getOm() {
		return om;
	}

	public void setOm(OntModel om) {
		this.om = om;
	}

	public InfModel getIm() {
		return im;
	}

	public void setIm(InfModel im) {
		this.im = im;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}


	// constructeurs
	public Save() {}
	public Save(Model m, String filename) {
		this.setM(m); this.setFile(filename);
	}
	public Save(OntModel om, String filename) {
		this.setOm(om); this.setFile(filename);
	}
	public Save(InfModel im, String filename) {
		this.setIm(im); this.setFile(filename);
	}


	// methodes
	public void saveN3File() {

		{
			try { 
				FileOutputStream outStream = new FileOutputStream(this.file); 
				this.m.write(outStream, "N3");
				outStream.close(); 
				System.out.println("Sauvegarde du fichier " + this.file + " réussie!");

			} 

			catch (Exception e) {
				System.out.println("failure" + e);
			}


		}
	}


	public void saveN3FileOntModel() {

		{
			try { 
				FileOutputStream outStream = new FileOutputStream(this.file); 
				this.om.write(outStream, "N3");
				outStream.close(); 
				System.out.println("Sauvegarde du fichier " + this.file + " réussie!");

			} 

			catch (Exception e) {
				System.out.println("failure" + e);
			}
		}
	}

	
	public void saveN3FileInfModel() {

		{
			try { 
				FileOutputStream outStream = new FileOutputStream(this.file); 
				this.im.write(outStream, "N3");
				outStream.close(); 
				System.out.println("Sauvegarde du fichier " + this.file + " réussie!");

			} 

			catch (Exception e) {
				System.out.println("failure" + e);
			}
		}
	}
}

