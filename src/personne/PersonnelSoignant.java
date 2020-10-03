package personne;

public class PersonnelSoignant extends Personne {
	
	//variables
	String service;
	String specialite;
	
	//getters and setters
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public static void soigner(String nom) {
		
		System.out.println(nom + " soigne (Méthode issue de la Classe PersonnelSoignant)");
		
	}


}
