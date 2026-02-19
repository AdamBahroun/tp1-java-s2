import java.util.*;

public class Main {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(1, "Alice Martin");
        e1.addNote(new Note("Mathematiques", 15));
        e1.addNote(new Note("Informatique", 18));
        e1.addNote(new Note("Anglais", 12));

        Etudiant e2 = new Etudiant(2, "Bob Dupont");
        e2.addNote(new Note("Mathematiques", 10));
        e2.addNote(new Note("Informatique", 14));
        e2.addNote(new Note("Anglais", 8));

        Etudiant e3 = new Etudiant(3, "Clara Benali");
        e3.addNote(new Note("Mathematiques", 17));
        e3.addNote(new Note("Informatique", 16));
        e3.addNote(new Note("Anglais", 19));

        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(e1);
        etudiants.add(e2);
        etudiants.add(e3);

        Stats stats = new Stats();

        System.out.println("=== STATISTIQUES INDIVIDUELLES ===");
        for (Etudiant e : etudiants) {
            System.out.println("\n" + e.getNom());
            System.out.println("  Moyenne          : " + stats.moyenne(e));
            System.out.println("  Meilleure note   : " + stats.meuillerNote(e).getValue());
            System.out.println("  Moins bonne note : " + stats.moinsNote(e).getValue());
        }

        System.out.println("\n=== STATISTIQUES DU GROUPE ===");
        System.out.println("Moyenne du groupe  : " + stats.moy(etudiants));
        System.out.println("Meilleur etudiant  : " + stats.meilleurEtudiant(etudiants).getNom());
        System.out.println("Moins bon etudiant : " + stats.moinsEtudiant(etudiants).getNom());

        System.out.println("\n=== TRI PAR MATRICULE ===");
        Collections.sort(etudiants);
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        System.out.println("\n=== TRI PAR MOYENNE ===");
        Collections.sort(etudiants, new CompareMoyenne());
        for (Etudiant e : etudiants) {
            System.out.println(e.getNom() + " -> " + e.getValue());
        }

        System.out.println("\n=== TRI PAR NOM ===");
        Collections.sort(etudiants, new CompareNom());
        for (Etudiant e : etudiants) {
            System.out.println(e.getNom());
        }
    }
}