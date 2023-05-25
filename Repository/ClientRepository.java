import models.Client;
import models.Compte;

public class ClientRepository{
    public static List<Client> Listedesclients = [];

    public static void ajouterClient(Client client){
        Listedesclients.add(client);
    }
   public static bool supprimerClient(Client client) {
    return Listdesclients.remove(client);
  }

   public static void afficherClient() {
    System.out.println("Nom ");
    System.out.println("Prenom ");
    System.out.println(" Telephone ");
    System.out.println("Email");
   // System.out.println("");

     Listdesclients.forEach((client) {
      System.out.println(client.toString());
     })
     }
}
