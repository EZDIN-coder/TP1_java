import java.util.Scanner;

/**
 * 
 */

/**
 * @author saada
 *
 */
public class nombrePair {

	private int n;
	private int i;
	public boolean ispair(int n) {
		double reste = Math.IEEEremainder(n,2);
		if (reste==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		nombrePair x1=new nombrePair();
		System.out.println("Donner un entier n ");
		Scanner sc= new Scanner(System.in);
		int x2 =sc.nextInt();
		System.out.println("Les nombres pairs entre 0 et "+x2+" sont :");
		 for(int i =0;i<=x2;i++) {
			 boolean m=x1.ispair(i);
			 
			 if(m) {
				 System.out.println(i);
				 // TODO Auto-generated method stub
			 }
		 
			
		 }
	}

}
