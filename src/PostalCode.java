import java.util.Scanner;

public class PostalCode {

	public PostalCode() {
		// TODO Auto-generated constructor stub
	}
	
	/***
	 * 
	 * @param code 
	 * @return lengh
	 */
	public static int calculateLenghtCode (String code) {
		return code.length();
		
	}
	
	 public static String readPostalCode() {
		 
		 Scanner sc = new Scanner(System.in);
		  String code=sc.next();
		 return code;
	 }
	
	
		
		public static void main(String[] args) {
			System.out.println("Veuillez saisir votre code postal >>>");
//		
			int code=calculateLenghtCode(readPostalCode());
		while(code !=5 ) {
			 System.out.println("Votre code postale :"+code);

			 
			 if (code > 5) {
				 
				 System.out.println("Votre code postale est trop long , veuillez resaisir votre code postale");
				  code=calculateLenghtCode(readPostalCode());
		 }else {
				 System.out.println("Votre code postale est trop court  , veuillez resaisir votre code postale");
				  code=calculateLenghtCode(readPostalCode());
			 }
		}
		
			
			
				 System.out.println("Good , Votre code postale est bon");

			 
			 }
			
		}


