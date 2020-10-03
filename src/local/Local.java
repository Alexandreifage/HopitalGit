package local;

public class Local {
	
	
	//variables
	 int no;
	  String nom;
	  String genre;
	  int noImmeuble;
	  int etage;
	  int nbrFenetre;
	  int nbrTable;
	  int taille;
	  
	  
	//getters and setters
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNoImmeuble() {
		return noImmeuble;
	}
	public void setNoImmeuble(int noImmeuble) {
		this.noImmeuble = noImmeuble;
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public int getNbrFenetre() {
		return nbrFenetre;
	}
	public void setNbrFenetre(int nbrFenetre) {
		this.nbrFenetre = nbrFenetre;
	}
	public int getNbrTable() {
		return nbrTable;
	}
	public void setNbrTable(int nbrTable) {
		this.nbrTable = nbrTable;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	  
	
public static void reserver() {
		
		System.out.println("reservere (Méthode issue de la Classe Local)");
	}
	  

}
