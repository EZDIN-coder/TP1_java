import java.util.Scanner;

/**
 * 
 */

/**
 * @author saada
 *
 */
public class machinecafé {

	public static int calcPrix(String boisson, int sucre, int lait)
	{
	int prix = 0;
	if (boisson.equals("CAF"))
	{
	prix = 40;
	}
	else if (boisson.equals("CHO"))
	{
	prix = 60;
	}
	else
	{
	prix = 40;
	}
	return (prix + sucre * 5 + lait * 15);
	}
	/**
	Phrase décrivant la boisson
	@param[in] boisson - code de la boisson: {"CAF","CHO","CAF3"}
	@param[in] sucre - nombre de doses de sucre (dans [0..2])
	@param[in] lait - nombre de supplément de lait (dans [0..1])
	@return la phrase décrivant la boisson commandée
	*/
	public static String calcPhrase(String boisson, int sucre, int lait) {
		{
			String phrase = "Votre ";
			if (boisson.equals("CAF"))
			{
			phrase += "cafe ";
			}
			else if (boisson.equals("CHO"))
			{
			phrase += "chocolat ";
			}
			else
			{
			phrase += "CAF3 ";
			}
			switch (sucre)
			{
			case 0:
			phrase += "non ";
			break;
			case 1:
			phrase += "";
			break;
			
			case 2:
			phrase += "tres ";
			break;
			}
			phrase += "sucre ";
			phrase += (lait == 0 ? "sans " : "avec ");
			phrase += "lait est pret";
					return phrase;
					}
		
	}
	public static void afficherResultats(int prix, String phrase)
	{
	System.out.println("------");
	System.out.println("Vous devez payer " + prix + " centimes");
	System.out.println(phrase);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String boisson;
		System.out.print("Choix de la boisson (CAF, THE ou CHO)? ");
		boisson = input.next();
		int sucre;
		System.out.print("Nombre de doses de sucre (dans [0..2])? ");
		sucre = input.nextInt();
		int lait;
		System.out.print("Supplement de lait (dans [0..1])? ");
		lait = input.nextInt();
		int prix = calcPrix(boisson,sucre,lait);
		String phrase = calcPhrase(boisson,sucre,lait);
		afficherResultats(prix,phrase);

	}

}
