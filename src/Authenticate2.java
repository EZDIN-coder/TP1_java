import java.util.Scanner;

/**
 * 
 */

/**
 * @author saada
 *
 */
public class Authenticate2 {

	public static final String USER1LOGIN="Ezdin";
	public static final String PASSWORD1="Tuan";
	public static final String USER2LOGIN="Adam";
	public static final String PASSWORD2="Adam1";
	public static final String USER3LOGIN="Anochka";
	public static final String PASSWORD3="Remy";
	
 public static String readUSERINFO() {
		 
		 Scanner sc = new Scanner(System.in);
		  String code=sc.next();
		 return code;
 }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login;
		String password;
		System.out.println("Veuiller saisir votre Login");
		login=readUSERINFO();
		System.out.println("Veuiller saisir votre Mot de passe");
		password=readUSERINFO();
		System.out.println("Votre Login est : "+login+"  Votre mot de passe est : "+password);
		
		if(login.equals(USER1LOGIN) ||login.equals(USER2LOGIN)||login.equals(USER3LOGIN)) {
			switch(login) {
			case USER1LOGIN:
				if(password.equals(PASSWORD1)) {
					System.out.println("Utilisateur authentifié");
					break;
				}else {
					System.out.println("Votre mot de passe est incorrect");
					break;
				}
			case USER2LOGIN:
				if(password.equals(PASSWORD2)) {
					System.out.println("Utilisateur authentifié");
					break;
				}else {
					System.out.println("Votre mot de passe est incorrect");
					break;
				}
				
			case USER3LOGIN:
				if(password.equals(PASSWORD3)) {
					System.out.println("Utilisateur authentifié");
					break;
				}else {
					System.out.println("Votre mot de passe est incorrect");
					break;
				}
			}		
		}else {
			System.out.println("Utilisateur non trouvé");
		}
	}

}
