
public class Commercial extends Salarie {
	
	private double m_dChiffreAffaire;
	private int m_pcCommission ;
	
	

	public double getM_dChiffreAffaire() {
		return m_dChiffreAffaire;
	}

	public void setM_dChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}

	public int getM_pcCommission() {
		return m_pcCommission;
	}

	public void setM_pcCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}

	public Commercial(int matricules, int categoris, int service, String nom, double salaire, double m_dChiffreAffaire,
			int m_pcCommission)  throws SalaireSalarieException,CategorieSalarieException{
		super(matricules, categoris, service, nom, salaire);
		this.m_dChiffreAffaire = m_dChiffreAffaire;
		this.m_pcCommission = m_pcCommission;
	}

	public Commercial(int matricules, int categoris, int service, String nom, double salaire) throws SalaireSalarieException,CategorieSalarieException{
		super(matricules, categoris, service, nom, salaire);
		// TODO Auto-generated constructor stub
	}

	public Commercial() {
		// TODO Auto-generated constructor stub
	}
	
  // surcharge de la méthode calculSalair
	public double calculSalaire(int commission) {
		// TODO Auto-generated method stub
		//super.calculSalaire();
		return getM_dSalaire()+ commission;
	}
	
	@Override
    public void  calculSalaire() {
		 double salaire=getM_dSalaire()+getM_pcCommission();
		System.out.println("Le salaire de  "+getM_strNom()+" est de "+salaire);
		
		
		
   }
	@Override
	public String toString() {
		
		return "Salarie [ " + getM_nMatricule() +"," + getM_nCategorie()+
				 ","  + getM_nService() + "," + getM_strNom() + ","	+ getM_dSalaire() + ","+getM_pcCommission()+ ","+getM_dChiffreAffaire()+"]";
	}
	

}
