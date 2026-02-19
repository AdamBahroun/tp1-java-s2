public class Note implements Statisticable, Comparable<Note>{
    private String intitule;
    private float valeur;
    public Note(String intitule, float valeur) {
        this.intitule = intitule;
        this.valeur = valeur;
    }
    public String getIntitule() {
        return intitule;
    }
    public float getValue() {
        return valeur;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
    public int compareTo(Note n){
        if(this.valeur>n.valeur){
            return 1;
        }
        else if(this.valeur<n.valeur){
            return -1;
        }
        else{
            return 0;
        }

    }
    public String toString() {
    return intitule + " : " + valeur;
}
}