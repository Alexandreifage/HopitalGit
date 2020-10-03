package personne;

import java.util.Scanner;

public class Infirmier extends PersonnelSoignant {
	
	public static void creerInfirmier() {
		
			Scanner variableNo = new Scanner(System.in);
			System.out.print("Saisir numéro: ");
			// int input
			int no = variableNo.nextInt();	
			
			Scanner variablePrenom = new Scanner(System.in);
			System.out.print("Saisir prénom: ");
			// String input
			String prenom = variablePrenom.nextLine();
			
			Scanner variableNom = new Scanner(System.in);
			System.out.print("Saisir nom de famille: ");
			// String input
			String nom = variableNom.nextLine();
			
			Scanner variableAdresse = new Scanner(System.in);
			System.out.print("Saisir l'adresse: ");
			// String input
			String adresse = variableAdresse.nextLine();
			
			Scanner variableDateNaissance = new Scanner(System.in);
			System.out.print("Saisir la date de naissance: ");
			// String input
			String dateNaissance = variableDateNaissance.nextLine();
			
			Scanner variableTelephone = new Scanner(System.in);
			System.out.print("Saisir lnuméro de téléphone: ");
			// String input
			String telephone = variableTelephone.nextLine();
			
			Scanner variableEmail = new Scanner(System.in);
			System.out.print("Saisir la date de naissance: ");
			// String input
			String email = variableEmail.nextLine();
			
			Scanner variableService = new Scanner(System.in);
			System.out.print("Saisir le servicee: ");
			// String input
			String service = variableService.nextLine();
			
			Scanner variableSpecialite = new Scanner(System.in);
			System.out.print("Saisir la spécialité: ");
			// String input
			String specialite = variableSpecialite.nextLine();
	

		    // Output input by user
		    System.out.println( no );
		    System.out.println( prenom );
		    System.out.println( nom );
		    System.out.println( adresse );
		    System.out.println( dateNaissance );
		    System.out.println( telephone );
		    System.out.println( email );
		    System.out.println( service );
		    System.out.println( specialite );
		    
		   
		  }
			
	
}
