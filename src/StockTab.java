
import java.util.Scanner;

public class StockTab {
	
	
	public boolean exist(int tab[],int val) {
		boolean trouve=false;
		for (int i=0 ; i<tab.length;i++) {
			if(tab[i]==val) {
				trouve= true;
				}
		}
		return trouve ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		 
		 StockTab st=new StockTab();
		 
		 
		 
		int [] tab = new int[6];
		 

		 for(int i=0; i<tab.length; i++) {

			   System.out.println("Donner le  nombre"+i);
			 
			  tab[i] = sc.nextInt();

			  

		 }								  
								   
		   for(int j=0; j<tab.length; j++) {

		   System.out.println(" la valeur tab["+j+"] = "+tab[j]);
		   }
								   
			System.out.println("Donner une valeur")	;
			int valeur=sc.nextInt();
			boolean found=st.exist(tab, valeur);
			if(found) {
				System.out.println("la valeur est trouvé dans le tableau");
			}else {
				System.out.println("la valeur n'existe pas dans le tableau");
			}
					
					
		   }
	

}
