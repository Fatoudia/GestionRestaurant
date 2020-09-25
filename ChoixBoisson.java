package objet;

import java.util.Scanner;

public class ChoixBoisson {
    
    public void choixBoisson(){
      Scanner scan = new Scanner(System.in);
      boolean verif = true;
        String menuBoissonPoulet = "1 : Eau plate \n";
          menuBoissonPoulet += "2 : Eau gazeuse \n";
          menuBoissonPoulet += "3 : Soda";
           String afficheBoisson = "";
           int choixBoisson;
        do {
          System.out.println("Quelle boisson voulez vous? \n" + menuBoissonPoulet);

          String choixChaineB = scan.nextLine();
          char    choixCaracB = choixChaineB.charAt(0);
          choixBoisson = (int) choixCaracB;
         
          if (choixBoisson == 49 || choixBoisson == 50 || choixBoisson == 51) {
            verif = false;
          } else {
           System.out.println("Le choix n'est pas disponible"); 

          }
          switch (choixBoisson) {
           case 49:
             afficheBoisson = "Vous avez choisi de l'eau plate ";
             System.out.println(afficheBoisson);
               
               break;
             case 50:
             afficheBoisson = "Vous avez choisi de l'eau gazeuse ";
             System.out.println(afficheBoisson);
             
             break;

             case 51:
             afficheBoisson = "Vous avez choisi du soda ";
             System.out.println(afficheBoisson);
            
               break;
       
           default:
           System.out.println("Choix non disponible");  

               break;
       }
        } while (verif);
    }   
}