package personne;

public class Patient extends Personne {
	
	// variable
	int noChambre;

	// getters and setters
	public int getNoChambre() {
		return noChambre;
	}

	public void setNoChambre(int noChambre) {
		this.noChambre = noChambre;
	}
	
	
	public static void etrelibere(String nom, int noChambre) {
		
		System.out.println(nom + " chambre n° " + noChambre + " est libéré");
		
	}

	public String toString() {
	
		return nom + " " + prenom;
	
}
	
	
}
