import java.util.Scanner;

public class Eleve {
	
	private String nom,prenom;
	private double math,physique,francais,histoiregeo,anglais,sport, moyenne ;
	private Eleve (String n,String p,double ma,double ph,double f,double hg,double a,double s ) {
		this.nom = n;
		this.prenom = p;
		this.math=ma;
		this.physique=ph;
		this .francais=f;
		this.histoiregeo=hg;
		this.anglais=a;
		this.sport=s;
		
	}
   private double calcul() {
	   double cal=(math+physique+francais+histoiregeo+anglais+sport)/6;
	   return cal;
   }
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		//Eleve el =new Eleve("Remy","He",19,20);
//		System.out.println(el.nom + " "+el.prenom);
//		double monRes=el.calcul();
//		System.out.println(monRes);
//		afficher(monRes);
		
		
		System.out.println("Donner le nombre des eleves");
		int nbEleve=sc.nextInt();
		Eleve [] tableauEleve = new Eleve[nbEleve];
		for(int i=0;i<nbEleve;i++) {
			System.out.println("Donner le nom de l'eleve "+i);
			String nomEleve=sc.next();
			System.out.println("Donner le prenom de l'eleve "+i);
			String prenomEleve=sc.next();
			System.out.println("Donner la note de la mati�re Math  de l'eleve "+i);
			double mathEleve =sc.nextDouble();
			System.out.println("Donner la note de la mati�re physique  de l'eleve "+i);
			double physiqueEleve =sc.nextDouble();
			System.out.println("Donner la note de la mati�re francais  de l'eleve "+i);
			double francaisEleve =sc.nextDouble();
			System.out.println("Donner la note de la mati�re sport  de l'eleve "+i);
			double sportEleve =sc.nextDouble();
			System.out.println("Donner la note de la mati�re HistoirGEO  de l'eleve "+i);
			double histgeoEleve =sc.nextDouble();
			System.out.println("Donner la note de la mati�re Anglais  de l'eleve "+i);
			double anglaisEleve =sc.nextDouble();
			
			 Eleve ev=new Eleve(nomEleve, prenomEleve, mathEleve, physiqueEleve, francaisEleve, sportEleve, histgeoEleve, anglaisEleve);
			 ev.moyenne= ev.calcul();
			 
			 tableauEleve[i]=ev ;
		}
		
		for ( int i=0; i<tableauEleve.length; i++){
			System.out.println("*****Les notes de  l'�l�ve "+ tableauEleve[i].prenom +" "+ tableauEleve[i].nom +" sont: ****");
			System.out.println("Note de la mati�re Math  est  "+ tableauEleve[i].math);
			System.out.println("Note de la mati�re physique  est  "+ tableauEleve[i].physique);
			System.out.println("Note de la mati�re francais  est  "+ tableauEleve[i].francais);
			System.out.println("Note de la mati�re Histoire/Geo  est  "+ tableauEleve[i].histoiregeo);
			System.out.println("Note de la mati�re Sport  est  "+ tableauEleve[i].sport);
			System.out.println("Note de la mati�re Anglais  est  "+ tableauEleve[i].anglais);
			System.out.println(" la moyenne de  l'�l�ve "+ tableauEleve[i].prenom +" "+ tableauEleve[i].nom +" est  : "+ tableauEleve[i].moyenne);
		}
		
	}

}
