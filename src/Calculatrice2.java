import java.util.Scanner;


public class Calculatrice2 {
	private   double resultat=0.0;
	private   double resultatMultiplication=1.0;
	private   double resultatDivision;
	
	
	public double readDoubleValeur() {		
		 Scanner sc =new Scanner(System.in);
		 return sc.nextDouble();
		 		
	}
	
	public String readStringValeur() {		
		 Scanner sc =new Scanner(System.in);
		 return sc.next();
		 		
	}
	
		public double additionner (double nombres) {
		
		  resultat+=nombres;
	
			return resultat; 
	}
		public double multiplier (double nombres) {
			
			resultatMultiplication*= nombres;
		//System.out.println("****multiplier***"+resultatMultiplication);
				return resultatMultiplication; 
		}
		
		public double diviser (double nombre1,double nombre2) {
			
			  resultatDivision=nombre1/nombre2;
			 // System.out.println("****diviser***"+resultatDivision);
				return resultatDivision; 
		}
		
	public void AffichMenu() {
		
		System.out.println("===================================================================================================");
		System.out.println("=       1) Tapez 1 pour  une op�ration d'addition        ----------------------------------------=");
		System.out.println("=       2) Tapez 2 pour une op�ration de multiplication -----------------------------------------=");
		System.out.println("=       3) Tapez 3 pour une op�ration de DIVISION  ----------------------------------------------=");
		System.out.println("=       0) Tapez 0 pour quitter le programme        ---------------------------------------------=");
		System.out.println("-------------------------------------------------------------------------------------------------=");
		System.out.println("==================================================================================================");
	}
	
	public double getResultat() {
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculatrice2 calculatrice = new Calculatrice2();
		 int choixOperation;
		 boolean quit= false;
	      calculatrice.AffichMenu();
		  Scanner sc =new Scanner(System.in);	
		  
		 
		 do {
			   
			  System.out.println("Veuillez choisir le code de l' op�ration" );
			  choixOperation=sc.nextInt();
			  
 			  switch (choixOperation) {
			  
			  case 1:
				      System.out.println("Cette Op�ration choisie est l'addition/soustraction ");			          
			          double x=0.00;			          
			          String saisie=calculatrice.readStringValeur();			          
			          while(!(saisie.equals("AC") || saisie.equals("C"))) {
			        	  System.out.println("Enter une valeur � additionner ou taper C ou AC pour quitter ");    
			        	  x=Double.parseDouble(saisie);
			        	  calculatrice.resultat=calculatrice.additionner(x);
			              System.out.println(" R�sulat = "+calculatrice.resultat); 
			              saisie=calculatrice.readStringValeur();
			          }
			          System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultat);
			          quit=true;
			           break;
			      
			  case 2:
				  System.out.println("L'op�ration choisie est la Multiplication  ");				  
				  double m=1.00 ;
				  String saisie1=calculatrice.readStringValeur();			          
		          while(!(saisie1.equals("AC") || saisie1.equals("C"))) {
		        	  System.out.println("Enter une valeur � multiplier ou taper C ou AC pour quitter ");
		        	  //m = calculatrice.readDoubleValeur(); 
		        	  m=Double.parseDouble(saisie1);
		        	  calculatrice.resultatMultiplication=calculatrice.multiplier(m);
		              System.out.println("M== "+m);
		              System.out.println(" R�sulat = "+calculatrice.resultatMultiplication);
		              saisie1=calculatrice.readStringValeur();
		          }
		          
		          System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultatMultiplication);
				  quit=true;
				 break;
				  
			  case 3:
				  System.out.println("L Op�ration chosie est la division  ");
				  double d,d1;
				  System.out.println("Veuiller saisir le premier nombre");
				  String saisie2=calculatrice.readStringValeur();
				  System.out.println("Veuiller saisir le second nombre");
				  String saisie3=calculatrice.readStringValeur();
				  while(!(saisie2.equals("AC") || saisie2.equals("C")||saisie3.equals("AC") || saisie3.equals("C"))) {
		        	  //System.out.println("Enter une valeur � diviser ou taper C ou AC pour quitter ");
		        	   
		        	  d=Double.parseDouble(saisie2);
		        	  d1=Double.parseDouble(saisie3);
		        	  if(d1!=0) {
		        		  calculatrice.resultatDivision=calculatrice.diviser(d,d1);
		        		  //System.out.println("D== "+d);
			              System.out.println(" R�sulat de l'op�ration de division de "+saisie2 +" / " +saisie3 +" est = "+calculatrice.resultatDivision);
		        	  }else {
		        		  System.out.println("La division par 0 est non conforme");
		        	  }
		        	 
		        	  System.out.println("Veuiller saisir le premier nombre de la division sinon tapez AC ou C pour quitter");
		              saisie2=calculatrice.readStringValeur();
		              System.out.println("Veuiller saisir le deuxi�me nombre de la division sinon tapez AC ou C pour quitter");
					  saisie3=calculatrice.readStringValeur();
		          }
		          
				  //System.out.println("Le r�sultat Finale  de l'op�ration est => "+calculatrice.resultatDivision);
				  quit=true;
				 break;
				  
			  case 0:
				 
				  quit=true;
				  break;
				  
			default:
				  System.out.println(" Le choix effectu� est incorrecte , merci d'effectuer un choix correcte , sinon tapez 0 pour quitter");

  				 
			  }				  
			
		 }while(!quit);		  
		  System.out.println("----Au revoir � bient�t-----");
      
}
}
