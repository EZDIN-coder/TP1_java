import java.util.Scanner;

public class RacineCarr� {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i ;
	double x;
	double racx;
	int NFOIS =15;
	System.out.println("Bonjour");
	System.out.println("Donner un nombre ,je vais vous calculer la racine carr�e:");
	
	for (i=0;i< NFOIS;i++)
	{
		System.out.println("Donner un nombre :");
		Scanner sc = new Scanner(System.in);
		 x =sc.nextDouble();
		
		if (x< 0.0)
		System.out.println(x+ "ne possede pas de racine carr�e");
		else
		{racx = Math.sqrt(x);
		System.out.println(x+"a pour racine carr�e :"+ racx);
		
		}	
	}
	
	

	}

}
