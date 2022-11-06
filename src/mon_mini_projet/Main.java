package mon_mini_projet;
import java.util.Scanner;
public class Main {

		    public static void main(String[] args) {
				String name;
				String matricule;
				int indiceSalarial;

				Scanner Clavier= new Scanner(System.in);
				System.out.println("Enregistrer un Commercial");

				System.out.println("Matricule");
				matricule=Clavier.nextLine();

				System.out.println("Nom");
				name=Clavier.nextLine();

				System.out.println("Indice Salarial");
				indiceSalarial=Clavier.nextInt();

				// Création d'une instance de la classe Commerciaux
		        Commerciaux commerciaux1 = new Commerciaux(matricule, name, indiceSalarial, (float) 4.2);

		        // Enregistrement du Commercial 1
		        Commerciaux.EnregistrerComerciaux(commerciaux1);

		        // Création d'une instance de la classe Cadre
				System.out.println("");
				System.out.println("Enregistrer un Cadre");
				System.out.println("Matricule");

				matricule=Clavier.nextLine();
				System.out.println("Nom");
				name=Clavier.nextLine();
				System.out.println("Indice Salarial");
				indiceSalarial=Clavier.nextInt();

		        Cadre cadre1 = new Cadre(matricule, name, indiceSalarial);
		        // Enregistrement du cadre 1
		        Cadre.enregistrerCadre(cadre1);

		        // Affichage du commerciaux1
		        System.out.println(commerciaux1);
		        // Affichage du Cadre1
		        System.out.println(cadre1);

		        // Calcul du total des salaire à verser pour touts les employés
		        int salaireTotal = Personnel.CalculDesSalaire(500);

		        // Affichage de la valeur du salaire
		        System.out.println(salaireTotal);

		        // Création d'une instance de la classe Cadre
				System.out.println("Enregistrer un Cadre");
				System.out.println("Matricule");
				matricule=Clavier.nextLine();
				System.out.println("Nom");
				name=Clavier.nextLine();
				System.out.println("Indice Salarial");
				indiceSalarial=Clavier.nextInt();

		        Cadre cadre2 = new Cadre(matricule, name, indiceSalarial);
		        // Enregistrement du cadre 2
		        Cadre.enregistrerCadre(cadre2);
		        // Affichage du cadre 2
		        System.out.println(cadre2);

		        // Création d'une instance de la classe Commmerciaux
				System.out.println("Enregistrer un Commercial");
				System.out.println("Matricule");
				matricule=Clavier.nextLine();
				System.out.println("Nom");
				name=Clavier.nextLine();
				System.out.println("Indice Salarial");
				indiceSalarial=Clavier.nextInt();

		        Commerciaux commerciaux2 = new Commerciaux(matricule, name, indiceSalarial, (float) 4.3);
		        // Enregistrement du commercial 2

		        // Enregistrement des subalternes d'un cadre
		        Cadre.EnregistrerSubalternes(cadre2, commerciaux1);
		        Cadre.EnregistrerSubalternes(cadre1, commerciaux2);

		        // afficher les Subalternes d'un cadre
		        Cadre.afficherSubAlternes();

		    }
		

	}


