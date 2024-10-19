package Entreprise;

public class Slaire {
	protected int matricule ;
	protected String nom ;
	protected int recrutement ;
	
	public Slaire(int mat , String n,int rec) {
		this.matricule=mat;
		this.nom=n;
		this.recrutement=rec;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getRecrutement() {
		return recrutement;
	}

	public void setRecrutement(int recrutement) {
		this.recrutement = recrutement;
	}

	@Override
	public String toString() {
		return "Slaire [matricule=" + matricule + ", nom=" + nom + ", recrutement=" + recrutement + "]";
	}
	
	public void Affiche () {
		System.out.println(toString());
	}
	
	double Salaire () {
		if (this.recrutement<2005) {
			return (400.00);
		}
		else {
			return (280.00);
		}
		
	}

}


