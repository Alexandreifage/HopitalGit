package soin;

public class Soin {
	
		//variables
	  	int no;
	  	String dateSoin;
	  	String genre;
	  	int noPatient;
	  	int duree;
	  	
	  	//getters and setters
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getDateSoin() {
			return dateSoin;
		}
		public void setDateSoin(String dateSoin) {
			this.dateSoin = dateSoin;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getNoPatient() {
			return noPatient;
		}
		public void setNoPatient(int noPatient) {
			this.noPatient = noPatient;
		}
		public int getDuree() {
			return duree;
		}
		public void setDuree(int duree) {
			this.duree = duree;
		}
		
		public static void soigner(String nom) {
			
			System.out.println(nom + " soigne (Méthode issue de la Classe Soin)");
			
		}

	  	
}
