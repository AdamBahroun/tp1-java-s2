import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Scanner sc = new Scanner(System.in);

        System.out.println("Commandes : +nom | ?nom | ! | .");

        while (sc.hasNextLine()) {
            String commande = sc.nextLine().trim();

            if (commande.equals(".")) {
                System.out.println("Au revoir !");
                break;

            } else if (commande.equals("!")) {
                annuaire.afficherTout();

            } else if (commande.startsWith("+")) {
                String nom = commande.substring(1);
                System.out.print("Numéro de téléphone : ");
                int numero = Integer.parseInt(sc.nextLine().trim());
                System.out.print("Adresse : ");
                String adresse = sc.nextLine().trim();
                annuaire.ajouter(new Fiche(nom, numero, adresse));
                System.out.println("Fiche ajoutée pour : " + nom);

            } else if (commande.startsWith("?")) {
                String nom = commande.substring(1);
                Fiche f = annuaire.rechercher(nom);
                if (f != null) {
                    System.out.println(f);
                } else {
                    System.out.println("Aucune fiche trouvée pour : " + nom);
                }

            } else {
                System.out.println("Commande inconnue.");
            }
        }

        sc.close();
    }
}