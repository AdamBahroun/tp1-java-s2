import java.util.*;

public class Etudiant implements Comparable <Etudiant>,Statisticable{
    private int matricule;
    private String nom;
    ArrayList <Note> notes;
    public Etudiant(int matricule, String nom){
        this.matricule=matricule;
        this.nom=nom;
        notes=new ArrayList<Note>();
    }
    public int getMatricule() {
        return matricule;
    }
    public String getNom() {
        return nom;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void addNote(Note n){
        notes.add(n);
    }
    public float getValue(){
        float s=0;
        for(int i=0;i<notes.size();i++){
            s+=notes.get(i).getValue();
        }
        return s/notes.size();
    }
    public int compareTo(Etudiant e){
       return this.matricule - e.matricule;
    }
    public String toString() {
        return "Etudiant{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", notes=" + notes +
                '}';
    }
    

}