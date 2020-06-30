
public class Student {
    private String nom;
    private String prenom;
    
    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student myStudent= new Student();
 
   myStudent.setNom("ADAM");
   myStudent.setPrenom("SAADAOUI");
   
   System.out.println("nom student : "+myStudent.getNom());
   System.out.println("nom student : "+myStudent.getPrenom());

   //myStudent.setNom("Rym");
	}

}
