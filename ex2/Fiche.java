public class Fiche{
    private String nom;
    private int num;
    private String adresse;

   
    public Fiche(String nom, int num, String adresse) {
        this.nom = nom;
        this.num = num;
        this.adresse = adresse;
     }

    public String toString() {
        return "Nom: " + nom + " | Tel: " + num + " | Adresse: " + adresse;
    }

    public String getNom() {
        return nom;
    }

    public int getNum() {
        return num;
    }

    public String getAdresse() {
        return adresse;
    }

}