import java.util.Scanner;


public class Calculatrice {
	private   double resultat=0.0;
	private   double resultatMultiplication=1.0;
	private   double resultatDivision=1.0;
	
	
	
	public double readValeur() {		
		 Scanner sc =new Scanner(System.in);
		 double resultatt=sc.nextDouble();
		 return resultatt;
		
	}
	
	public String readStringValeur() {		
		 Scanner sc =new Scanner(System.in);
		 String resultatt=sc.next();
		 return resultatt;
		
	}
	
		public double additionner (double nombres) {
		
		  resultat+=nombres;
	
			return resultat; 
	}
		public double multiplier (double nombres) {
			
			resultatMultiplication*= nombres;
		System.out.println("****multiplier***"+resultatMultiplication);
				return resultatMultiplication; 
		}
		
		public double diviser (double nombres) {
			
			  resultat/=nombres;
		
				return resultat; 
		}
		
	public void AffichMenu() {
		
		System.out.println("===================================================================================================");
		System.out.println("=       1) Tapez 1 pour  une op�ration d'addition        -------------------------------------------=");
		System.out.println("=       2) Tapez 2 pour une op�ration de multiplication -  -------------------------------------------=");
		System.out.println("=       3) Tapez 3 pour une op�ration de DIVISION  ----------------------------------------------=");
		System.out.println("=       0) Tapez ESC pour quitter                      ---------------------------------------------=");
		System.out.println("--------------------------------------------------------------------------------------------------=");
		System.out.println("===================================================================================================");
	}
	
	public double getResultat() {
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculatrice calculatrice = new Calculatrice();
		 int choixOperation;
		 boolean quit= false;
	      calculatrice.AffichMenu();
		  Scanner sc =new Scanner(System.in);	
		  String y ="STOP";
		 
		 do {
			   System.out.println("Veuillez choisir le code de l' op�ration" );
			   choixOperation=sc.nextInt();
			  // System.out.println("choixOperation" +choixOperation);
			  switch (choixOperation) {
			  
			  case 1:
				  System.out.println("Cette Op�ration choisie est l'addition/soustraction ");
			          
			          double x=0.00;
			          
			          String saisie=calculatrice.readStringValeur();
			          
			          while(! saisie.equals("STOP")) {
			        	  System.out.println("Enter une valeur � additionner ou taper 0 pour afficher le r�sultat final ");
			        	  //if (String.valueOf(x) !="ESC") quit=true;
			        	//  x = calculatrice.readValeur();
			        	  x=Double.parseDouble(saisie);
			        	  calculatrice.resultat=calculatrice.additionner(x);
			            // System.out.println("X == "+x);
			              System.out.println(" R�sulat = "+calculatrice.resultat); 
			            
			          }
//			          do
//			          {
//			        	  System.out.println("Enter une valeur � additionner ou taper 0 pour afficher le r�sultat final ");
//			        	  //if (String.valueOf(x) !="ESC") quit=true;
//			        	//  x = calculatrice.readValeur();
//			        	  x=Double.valueOf(calculatrice.readStringValeur());
//			        	  calculatrice.resultat=calculatrice.additionner(x);
//			            // System.out.println("X == "+x);
//			              System.out.println(" R�sulat = "+calculatrice.resultat);
//			          }while(String.valueOf(x) !="ESC");
			         // }while(x !=0);
			          //System.out.println("veullier saisir un nombre");
			          System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultat);
			          quit=true;
			      break;
			      
			  case 2:
				  System.out.println("L Op�ration choisie est la Multiplication  ");
				  
				  double m =1.00;
		          //String y ="STOP";
		          do
		          {
		        	  System.out.println("Enter une valeur � multiplier ou taper 0 pour afficher le r�sultat final ");
		        	  m = calculatrice.readValeur();        	    
		        	  calculatrice.resultatMultiplication=calculatrice.multiplier(m);
		             System.out.println("M== "+m);
		              System.out.println(" R�sulat = "+calculatrice.resultatMultiplication);
		          }while(m!=0);
		          //System.out.println("veullier saisir un nombre");
		          System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultatMultiplication);
				  quit=true;
				 break;
				  
			  case 3:
				  System.out.println("L Op�ration chosie est la division  ");
				  double d =1.00;
		          //String y ="STOP";
		          do
		          {
		        	  System.out.println("Enter une valeur � diviser ou taper 0 pour afficher le r�sultat final ");
		        	 d = calculatrice.readValeur();        	    
		        	  calculatrice.resultatDivision=calculatrice.diviser(d);
		            // System.out.println("X == "+x);
		              System.out.println(" R�sulat = "+calculatrice.resultatDivision);
		          }while(d!=0);
		          //System.out.println("veullier saisir un nombre");
		          System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultatDivision);
				  quit=true;
				 break;
				  
			  case 0:
				 // System.out.print("Au revoir");
				  quit=true;
				  break;
				  
			default:
				  System.out.println("choix non reconnu veuillez resaisir UNE OPERATION VALIDE SINON TAPEZ 0 pour sortir");
//				  System.out.println("bonjjjjjjjjjjjjj");
////				  calculatrice.AffichMenu();
  				   // choixOperation=sc.nextInt();
  				 
			  }				  
			//  choixOperation=sc.nextLine(); 
			// break;
		 }while(!quit);		  
		  System.out.println("----Fin des op�artion Au revoir-----");
      
}
}
