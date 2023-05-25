package  models.compte;
import java.util.*;

public class FindHomeTest{

    public static void main(String[] args){

        int choix;
        String rep;

    do{

    System.out.println("-------------------Bienvenue sur FindHome-------------------");
    do{
    System.out.println("1- Creer un compte ");
    System.out.println("2- Voir catalogue");
    System.out.println("3- Reserver une visite des lieux");

    System.out.println(" Bonjour , quelle operation voulez vous effectuer?");

    choix = Integer.parseInt(Util.getScanner().nextLine());

} while (choix >3 && choix < 1);

switch (choix){

    case 1:
       ajouterClient();
       break;
    case 2:
        listeLieux();
        break;
    case 3:
        reserverVisite();
        break;
    default:
        System.out.println("Veuillez saisir une option valide");
        break;

}

System.out.println("Voulez-vous continuer? (oui/ non)");

rep = Util.getScanner().nextLine();

//scanner.nextLine(); 
//String rep = scanner.nextLine();
}while(rep == " OUI");
}

public void ajouterClient(){
    System.out.println("Veuillez saisir le votre nom s'il vous plait:");
    String nom = Util.getScanner().nextLine();
    System.out.println("Veuillez saisir votre prenom: ");
    String prenom = Util.getScanner().nextLine();
    System.out.println("Veuillez saisir votre numéro de téléphone :");
    String telephone = Util.getScanner().nextLine();
    System.out.println("Veuillez saisir votre adresse Email:");
    String mail = Util.getScanner().nextLine();
    System.out.println("Veuillez saisir votre date de naissance (aaaa-mm-jj):");
    DateTime dateNaissance =DateTime.parse( Util.getScanner().nextLine());

    Client clt = new Client(nom.toString(), prenom.toString(), telephone, mail, dateNaissance);

    ClientRepository.Listdesclients.add(clt);

    System.out.println("Votre compte a bien été ajouté");
}
}