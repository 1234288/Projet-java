public class Compte{
    String indentifiant;
    String motDepasse;
    DateTime dateCreation;

    public Compte(String indentifiant, String motDepasse , DateTime dateCreation){
        this.indentifiant = indentifiant;
        this.motDepasse = motDepasse;
        this.dateCreation = dateCreation;
    }
}