package test;
import java.util.Scanner;
import entities.*;
public class Test {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Capacite de la bibliotheque (minimum 2) : ");
        int n = Integer.parseInt(sc.nextLine());

        if (n < 2) {
            System.out.println("La capacite doit etre au moins 2.");
            sc.close();
            return;
        }

        Bibliotheque b = new Bibliotheque(n);

        b.ajouter(new Livre("Les Miserables", "Victor Hugo"));
        b.ajouter(new Revue("National Geographic", 78));
        int choix;

        do {
            System.out.println("\n  MENU  ");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Rechercher un document");
            System.out.println("5. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = Integer.parseInt(sc.nextLine());

            switch (choix) {
                case 1:
                    System.out.print("Titre : ");
                    String titre = sc.nextLine();

                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();

                    Livre livre = new Livre(titre, auteur);

                    if (b.ajouter(livre)) {
                        System.out.println("Livre ajoute.");
                    } else {
                        System.out.println("Bibliotheque pleine.");
                    }
                    break;

                case 2:
                    b.afficherDocuments();
                    break;

                case 3:
                    System.out.print("Numero du document a supprimer : ");
                    int numSup = Integer.parseInt(sc.nextLine());

                    Document docSup = b.document(numSup);

                    if (docSup != null && b.supprimer(docSup)) {
                        System.out.println("Document supprime.");
                    } else {
                        System.out.println("Document introuvable.");
                    }
                    break;

                case 4:
                    System.out.print("Numero du document : ");
                    int num = Integer.parseInt(sc.nextLine());

                    Document doc = b.document(num);

                    if (doc != null) {
                        System.out.println(doc);
                    } else {
                        System.out.println("Document introuvable.");
                    }
                    break;

                case 5:
                    b.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}
