
public class Salarie {

	private int m_nMatricule ;
	private int m_nCategorie;
	private int m_nService;
	private String m_strNom;
	private double m_dSalaire;
	static int nbInstance=0 ;
	
	protected int getM_nMatricule() {
		return m_nMatricule;
	}

	protected void setM_nMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}

	protected int getM_nCategorie() {
		return m_nCategorie;
	}

	protected void setM_nCategorie(int m_nCategorie) throws CategorieSalarieException{
		if (m_nCategorie == 1 || m_nCategorie == 2 || m_nCategorie == 3)       	
			this.m_nCategorie = m_nCategorie;
		else  throw new CategorieSalarieException("****La categorie du salarie est inconnue");
	}

	protected int getM_nService() {
		return m_nService;
	}

	protected void setM_nService(int m_nService) {
		this.m_nService = m_nService;
	}

	protected String getM_strNom() {
		return m_strNom;
	}

	protected void setM_strNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}

	protected double getM_dSalaire() {
		return m_dSalaire;
	}

	protected void setM_dSalaire(double m_dSalaire) throws SalaireSalarieException {
		if (m_dSalaire > 0)
		this.m_dSalaire = m_dSalaire;
		else 
			throw new SalaireSalarieException("le salaire doit être strictement positif");
		}
	
	
	

	public Salarie(int matricules,int categorie,int service,String nom,double salaire) throws SalaireSalarieException, CategorieSalarieException  {
		    
			       			
		    if (salaire  >0 && (categorie == 1 || categorie == 2 ||categorie == 3 )){
		    	  this.m_nMatricule= matricules ;
					this. m_nCategorie = categorie;
					this. m_nService = service;
					this . m_strNom = nom;
					this.m_dSalaire= salaire;
					
					nbInstance++;
					System.out.println("le salarié est instancié");
		    }
		    if (salaire <= 0) {
				// System.out.println("le salaire est "+salaire);
			    	throw new SalaireSalarieException(" le salaire doit etre  positif");
			    }
			
			    if (categorie == 1 || categorie == 2 || categorie == 3) {
					//System.out.println("le categorie est "+categorie);
			    }else {
						 throw new CategorieSalarieException("****La categorie du salarie est inconnue");
					}

		  
		 
		
	}
	
	
  public Salarie() {
		// TODO Auto-generated constructor stub
	  nbInstance++;
	}

public void  calculSalaire() {
		
		System.out.println("Le salaire de  "+getM_strNom()+" est de "+getM_dSalaire());
		
		
		
}
	


@Override
public boolean equals(Object obj) {
	//Salarie salar= (Salarie) obj;
	if (this.getM_nMatricule() == ((Salarie) obj).getM_nMatricule() && this.getM_strNom()== ((Salarie) obj).getM_strNom() ) {
		System.out.println(" les objets sont égaux");
		return true; 
	} else {
	System.out.println(" les objets ne sont pas égaux");
	return false;
	}
}

@Override
public String toString() {
	return "Salarie [ " + getM_nMatricule() +"," + getM_nCategorie()+
			 ","  + getM_nService() + "," + getM_strNom() + ","	+ getM_dSalaire() + "]";
}

	
	
	
	
	
	   

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
