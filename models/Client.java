import FINDHOME.models.Compte;


public class Client{
    String nom;
    String prenom;
    String Telephone;
    String mail;
    DateTime dateNaissance;
    
    
    public Client(String nom, String prenom, String Telephone, String mail, DateTime dateNaissance, Compte compte){
        this.nom = nom;
        this.prenom = prenom;
        this.Telephone = Telephone;
        this.mail =  mail;
        this.dateNaissance = dateNaissance;
        this.compte = compte;
    }
    /*@override
    String toString(){
        return nom+" "+prenom+" "+Telephone+" ";//+Compte.indentifiant+" "+compte.motDepasse;
    }*/
}