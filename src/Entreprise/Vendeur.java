package Entreprise;

public class Vendeur extends Slaire {
	private double vente ;
	private double pourcentage ;
	
	
	public Vendeur(int mat, String n, int rec, double vente,double pourcentage) {
		super(mat, n, rec);
		// TODO Auto-generated constructor stub
		this.vente=vente;
		this.pourcentage=pourcentage;
	}


	public double getVente() {
		return vente;
	}


	public void setVente(double vente) {
		this.vente = vente;
	}


	public double getPourcentage() {
		return pourcentage;
	}


	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	public void Affiche () {
		System.out.println("C'est un vendeur : ");
		super.Affiche();
		System.out.println(this.vente+this.pourcentage);
	}
	
	double Salaire () {
		double s=super.Salaire();
		return (s+(this.vente+this.pourcentage));
	}

}
