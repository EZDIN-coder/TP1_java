import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) throws SalaireSalarieException,CategorieSalarieException {
		// TODO Auto-generated method stub

		int mycategoris;
		int service;
		String nom;
		double salaire;
		int matricule;
		Salarie mySalarie;
		Scanner sc= new Scanner(System.in);	
		try {
			System.out.println(" Etape 1: Saisie d'un salarie avec la gestion de l'exception categorie et salaire");
			// saisie des valeurs du salarie;
			System.out.println("Saisir le matricule ");
			matricule = sc.nextInt();			
			System.out.println("Saisir le nom ");
			nom = sc.next();
			System.out.println("Saisir la Categorie ");
			mycategoris = sc.nextInt();
			System.out.println("Saisir le service ");
			service = sc.nextInt();
			System.out.println("Saisir le salaire ");
			salaire = sc.nextDouble();			
			// Instantiation de l'objet de la classe salarie  avec les valeurs saisies et la gestion des exceptions			
			mySalarie = new Salarie(matricule, mycategoris, service, nom, salaire);			
			// Affcihage des valeurs des attributs de l'objet instancié
			System.out.println("le nom est "+mySalarie.getM_strNom());
			System.out.println(" Categorie est "+mySalarie.getM_nCategorie());
			System.out.println(" Service est  "+mySalarie.getM_nService());
			System.out.println(" la matricule est  "+mySalarie.getM_nMatricule());
			System.out.println(" le salaire est  "+mySalarie.getM_dSalaire());
			
			// Affichage du nombre des objet instanciés par la classe salarie
			System.out.println("le nombre d'instance est "+mySalarie.nbInstance);
			
		  } catch (SalaireSalarieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }	catch (CategorieSalarieException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  }	
		
			// instantiation des objets de la classe
			Salarie salarie1= new Salarie(123,15,1,"adam",10000);
			Salarie salarie2= new Salarie(123,15,1,"adouma",2588888);
			Salarie salarie3= new Salarie(123,16,1,"adouma",2588888);
			
			// Affichage du nombre des objet instanciés par la classe salarie
			System.out.println("Test 2 : le nombre de Salarié instancié est égale ="+Salarie.nbInstance);
			
			// Test de l'egalité des objets de la classe en utilsiant la methode equals
			System.out.println(" Test3 : Est ce que les salariés 1 et 2 sont les mêmes  => " +salarie1.equals(salarie2));
			System.out.println(" Test3 : Est ce que les salariés 2 et 3 sont les mêmes  => " +salarie2.equals(salarie3));			
			// Appel a la methode toString
			System.out.println(salarie1.toString());
			System.out.println(salarie2.toString());
			System.out.println(salarie3.toString());			
			Commercial commercial = new Commercial(123, 12, 2, "rrrrr", 2500, 50000, 500);
			//System.out.println(" tessss"+commercial.toString());
			System.out.println("Test 4: Le salaire du Commercial est =="+commercial.calculSalaire(commercial.getM_pcCommission()));
			
			// Ulisattion de Hashtable			
			Hashtable<Integer , Salarie> listSalarie = new Hashtable <Integer,Salarie>();
			Salarie mysalarie1= new Salarie(123,15,1,"adam",2588888);
			Salarie mysalarie2= new Salarie(458,15,1,"RYM",2588888);
			Salarie mysalarie3= new Salarie(256,15,1,"EZZ",2588888);
			Salarie mysalarie4= new Salarie(888,15,1,"LINA",2588888);
			Salarie mysalarie5= new Salarie(333,15,1,"CHARLOTTE",2588888);
			Commercial commercial1 = new Commercial(444, 15, 1, "commercial1", 4000, 20000, 5000);
			Commercial commercial2 = new Commercial(666, 15, 1, "commercial1", 5000, 20000, 5000);
			listSalarie.put(123, mysalarie1);
			listSalarie.put(458, mysalarie2);
			listSalarie.put(256, mysalarie3);
			listSalarie.put(888, mysalarie4);
			listSalarie.put(333, mysalarie5);
			listSalarie.put(444, commercial1);
			listSalarie.put(666, commercial2);
			// Affichage des salaries depuis le dictionnaire
			
			//System.out.println(" listSalarie == "+ listSalarie.toString());
			System.out.println("Test 5: Affichage du doctionnaire des salarie");
			Set<Integer> keys = listSalarie.keySet();
			
			Iterator<Integer> itr = keys.iterator();
			 while (itr.hasNext()) { 
				Integer  str = itr.next();
				 System.out.println("Le salarié avec Cin: "+str+" & Salarie: "+listSalarie.get(str));
				 //polymorphisme use with salarie and Commercial
				 listSalarie.get(str).calculSalaire();
			 }
					
	

		}
}
