import java.util.*;
public class Stats {
    public float moyenne(Etudiant e){
        return e.getValue();
    }
    public float moy(ArrayList<Etudiant> L){
        float s=0;
        for(int i=0;i<L.size();i++){
            s+=L.get(i).getValue();
        }
        return s/L.size();
    }
    public Note meuillerNote(Etudiant e){
        return Collections.max(e.notes);
    }
    public Note moinsNote(Etudiant e){
        return Collections.min(e.notes); 
    }

    public Etudiant meilleurEtudiant(ArrayList<Etudiant> e){
        return Collections.max(e);
    }
    public Etudiant moinsEtudiant(ArrayList<Etudiant> e){
        return Collections.min(e);
    }
    

}