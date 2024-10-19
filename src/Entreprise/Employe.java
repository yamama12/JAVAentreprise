package Entreprise;

public class Employe extends Slaire {
	private double Hsupp;
	private double PHsupp;
	
	public Employe(int mat, String n, int rec, double Hsupp,double PHsupp) {
		super(mat, n, rec);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
		// TODO Auto-generated constructor stub
	}

	public double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}

	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	
	public void Affiche () {
		System.out.println("c'est un employé");
		super.Affiche();
		System.out.println(this.Hsupp+this.PHsupp);
	}
	
	double Salaire() {
		double s=super.Salaire();
		return (s+(this.Hsupp*this.PHsupp));
	}
	
}
