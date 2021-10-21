package full_projetHMIN218;

public class EspaceDeNom {
	
		// attributs
		private String modele;
		private String prefix_espaceM;
		
		// accesseurs
		public String getModele() {
			return modele;
		}

		public void setModele(String modele) {
			this.modele = modele;
		}
		
		public String getPrefix_espaceM() {
			return prefix_espaceM;
		}


		public void setPrefix_espaceM(String prefix_espaceM) {
			this.prefix_espaceM = prefix_espaceM;
		}
		
		// constructeurs	
		
		public EspaceDeNom(String espace_modele){
			this.setModele(espace_modele);
		}
		public EspaceDeNom(String espace_modele, String prefixe_espace){
			this.setModele(espace_modele);
			this.setPrefix_espaceM(prefixe_espace);
		}
		
		// méthodes	
		public String toString() {
				return " Espace de nom: "+ this.modele +
						" - prefixe associé: "+ this.prefix_espaceM; 
			}



}
