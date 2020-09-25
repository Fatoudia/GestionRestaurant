package objet;

import java.util.Scanner;

public class Poulet{
  
  public Poulet (/*String accomPoulet, String boissonPoulet*/){

     //this.accomPoulet = accomPoulet;
     //this.boissonPoulet = boissonPoulet;
  } 

   public void menuPoulet(){
     String accomPoulet;
     String boissonPoulet;
     Scanner scan = new Scanner(System.in);
    int reponse;
    boolean verif = true;
     do {
       ChoixAccompagnement accompagnement = new ChoixAccompagnement();
     
       accompagnement.choixAccompagne();

       ChoixBoisson boissons = new ChoixBoisson();
       boissons.choixBoisson(); 
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
  



 
