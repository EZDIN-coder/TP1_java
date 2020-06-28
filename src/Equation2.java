import java.util.Scanner;

public class Equation2 {
	
	
	
   public  double Delta(double a,double b, double c)  {
    	
    	return (b*b-4*a*c)/2*b ;
    }



	public static void main(String[] args) {
		
		Equation2  equation= new  Equation2();
		// TODO Auto-generated method stub
   System.out.println("Donner a");
    double a= equation.readDouble();
     System.out.println("Donner b");
     double b= equation.readDouble();
     System.out.println("Donner c");
    double c=equation.readDouble();
     
    double d = equation.Delta(a, b, c);
    System.out.println("la valeur de delta est: "+d);
    
    if (d>0) {
    	System.out.println("l'equation admet deux racines réels");
    	    }else if(d==0){
    	    	System.out.println("l'équation admet une racine double");
    	    	
    	    }else {
    	    	System.out.println("l'équation n'admet pas de solutions réels");
    	    }
    
    	
	}



	public double readDouble() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		return sc.nextDouble();
		
		
	}

}
