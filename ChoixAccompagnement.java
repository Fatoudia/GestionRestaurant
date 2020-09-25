package objet;

import java.util.Scanner;
public class ChoixAccompagnement {

  
    public  void choixAccompagne(){
      Scanner scan = new Scanner(System.in);
      String menuAccom = "";
           menuAccom = "1 : Legume frais \n";
           menuAccom += "2 : Frites \n";
           menuAccom += "3 : Riz";
           String accompagnement;

      
    String affiche = "";
    boolean verif = true;
    int choixAccomp;
    int reponse;
    do {
      System.out.println("Quel est vrotre choix Pour accompagner votre poulet : \n"+ menuAccom);  
 
      String choixChaine = scan.nextLine();
      char choixCarac = choixChaine.charAt(0);
           choixAccomp = (int)choixCarac;
     if (choixAccomp == 49 || choixAccomp == 50 || choixAccomp == 51) {
       verif = false;
     } else {
      System.out.println("Le choix n'est pas disponible"); 

     }
    switch (choixAccomp) {
        case 49:
          affiche = "Vous avez choisi des legume frais " ;
          System.out.println(affiche); 
          break;
          case 50:
          affiche = "Vous avez choisi des frites " ;
          System.out.println(affiche); 
          break;

          case 51:
          affiche = "Vous avez choisi du riz " ;
          System.out.println(affiche);  

            break;
    
        default:
        System.out.println("Choix non disponible");  

            break;
    }
  } while (verif); 
    }
  }
