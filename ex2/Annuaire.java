import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Annuaire {
    Map<String, Fiche> table;

    public Annuaire() {
        table = new HashMap<>();
    }

    public void ajouter(Fiche f) {
        table.put(f.getNom(), f);
    }

    public Fiche rechercher(String nom) {
        return table.get(nom);
    }

    public void afficherTout() {
        if (table.isEmpty()) {
            System.out.println("L'annuaire est vide.");
        } else {
            for (Fiche f : table.values()) {
                System.out.println(f);
            }
        }
    }

    public void trier() {
        table = new TreeMap<>(table);
    }
}