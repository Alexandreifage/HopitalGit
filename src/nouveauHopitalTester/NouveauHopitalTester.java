package nouveauHopitalTester;

import divers.Medicament;
import personne.Infirmier;
import personne.Medecin;
import personne.Patient;
import personne.PersonnelSoignant;

public class NouveauHopitalTester {

	public static void main(String[] args) {
		
		System.out.println("Hôpital");
		System.out.println("=======");
		
		Medecin medecin1 = new Medecin();		
		medecin1.setNom("Smith");
		medecin1.setPrenom("Jules");
		medecin1.setSpecialite("Cardiologue");
		
		Patient patient1 = new Patient();		
		patient1.setNom("Dumont");
		patient1.setPrenom("Louis");
		patient1.setNoChambre(34);
		
		Patient patient2 = new Patient();		
		patient2.setNom("Desbiolles");
		patient2.setPrenom("Nathalie");
		patient2.setNoChambre(5);
		
		Medicament medicament1 = new Medicament();		
		medicament1.setNom("Decamestroquil");
		medicament1.setComposition("plein de trus chimiques");
		medicament1.setEffetSecondaire("somnolence");
		
		
		
		System.out.print(medecin1.getPrenom() + " ");
		System.out.print(medecin1.getNom() + " ");
		System.out.println(": " + medecin1.getSpecialite() + "  ");
		
		System.out.print(patient1.getPrenom() + " ");
		System.out.print(patient1.getNom() + " ");
		System.out.println(": Chambre n° " + patient1.getNoChambre() + "  ");
		
		Medecin.liberer("Smith");
		Patient.etrelibere("Dumont", 34);
		Medecin.soigner("Smith");
		PersonnelSoignant.soigner("Smith");
		System.out.println("le patient opéré est: " + patient1.getNom());
		medecin1.operer(patient1);
		medecin1.soigner(patient2, medicament1);
		
		System.out.println(medecin1 + " opère " + patient1);
		
		
		
		Infirmier.creerInfirmier();
		
		
	}

}
