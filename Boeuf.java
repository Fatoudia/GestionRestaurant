package objet;

import java.util.Scanner;

public class Boeuf {
   
   public void menuBoeuf(){
    String accomBoeuf;
    String boissonOption;
    Scanner scan = new Scanner(System.in);
    int reponse;
    boolean verif = true;
    ChoixBoisson boissons = new ChoixBoisson();

    do {
        ChoixAccompagnement accompagnement = new ChoixAccompagnement();
      
        accompagnement.choixAccompagne();

        String choixSupplem = "";
        choixSupplem = "1 : Oui \n";
        choixSupplem += "2 : Non \n";
        System.out.println("Voulez vous une boisson en supplement? \n " + choixSupplem);
        String suplemChaine = scan.nextLine();
       char suplemCarac = suplemChaine.charAt(0);
        int supplement = (int) suplemCarac;

        if (supplement == 49) {
          boissons.choixBoisson(); 
        } else {
          System.out.println("Aucun boisson n'a été ajouté \n");
  
        }
        String choixReponse = "1 : Oui \n";
               choixReponse += "2 : Non ";
        System.out.println("Valider vous votre commande? \n" + choixReponse);
        String reponChaine = scan.nextLine();
        char reponseCarac = reponChaine.charAt(0);
              reponse = (int) reponseCarac;

        if (reponse == 49) {
         System.out.println("Choix valider avec success!!"); 
        } else  if(reponse == 50){
          System.out.println("Commande annuler"); 
          verif = false;
        }


      } while (verif);  
   }
    
}