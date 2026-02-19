import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {

    public int compare(Etudiant e1, Etudiant e2) {
        return Float.compare(e1.getValue(), e2.getValue());
    }
}
