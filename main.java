package objet;
import java.util.Scanner;
public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Poulet poulet = new Poulet();
        Boeuf  boeuf = new Boeuf();

		 Scanner scan = new Scanner(System.in);
	      boolean verif = true;
	      int menu;
 
	       do {
	           
	           String choixMenu = "";
	                choixMenu = "1 : Poulet \n";
	                choixMenu += "2 : Boeuf \n";
	                choixMenu += "3 : Vegetarien";
	  	          System.out.println("Quel menu voulez vous? \n " + choixMenu);
	             
	     	     menu = scan.nextInt();

	         if (menu == 1 || menu == 2 || menu == 3) 
	           {

	        switch (menu) 
	               {
	          case 1:
	         System.out.println("Vous avez choisi le menu poulet \n"); 

	         poulet.menuPoulet();

	            break;
	          case 2:
	         System.out.println("Vous avez choisi le menu boeuf \n  Ce menu ne contient pas de boisson sauf si vous le prenez en suppliment \n"); 
	         boeuf.menuBoeuf();
	            break;
	            
	          case 3:
	 	         System.out.println("Vous avez choisi le menu végétarien \n  Ce menu  contient  de la boisson et vous pouvez ajouter du riz \n"); 
	 	         boeuf.menuBoeuf();
	 	            break;
	 	            
	                 }
	            scan.close();
	        
	            }  else 
	            
	            {
		           System.out.println("Choix non disponible");
		           verif = false;
		  
             	}
	         
	         } while (!verif); 

                                 }
                  	}

