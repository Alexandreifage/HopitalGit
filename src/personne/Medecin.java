package personne;

import divers.Medicament;

public class Medecin extends PersonnelSoignant {

	public void operer(Patient patient) {
		
		System.out.println(nom + " opère " + patient.getNom());
		
	}
	
	public static void liberer(String nom) {
		
		System.out.println(nom + " libère ");
		
	}
	
	
	public  void soigner(Patient patient, Medicament medicament) {
		
		System.out.println(nom + " soigne " + patient.getNom() + " avec du " + medicament.getNom());
		
	}
	
	public String toString() {
		
		return nom + " " + prenom + " " + specialite;
		
	}
	
		
}
