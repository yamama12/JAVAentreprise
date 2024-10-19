package Entreprise;

public record Test() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Slaire tabSalaire [] =new Slaire [5];
		
		tabSalaire[0]=new Employe(12345,"Walid",2002,15,4);
		tabSalaire[1]=new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalaire[2]=new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalaire[3]=new Employe(87698,"Aymen",2003,19,4);
		tabSalaire[4]=new Employe(12345,"Khaled",2008,7,4);
		System.out.println("Liste des employés : ");
		for (int i=0;i<5;i++) {
			if (tabSalaire[i] instanceof Employe) {
				tabSalaire[i].Affiche();
			}
		}
		System.out.println();
		System.out.println("Liste des vendeurs : ");
		for (int j=0;j<5;j++) {
			if (tabSalaire[j] instanceof Vendeur) {
				tabSalaire[j].Affiche();
			}
		}
		
		System.out.println();
		System.out.println("Le nom du salarié le plus ancien : ");
		Slaire Ancien = tabSalaire[0]; 
		for (int i=0 ;i<5;i++) {
			if (tabSalaire[i] instanceof Vendeur) {
				if (tabSalaire[i].getRecrutement()<Ancien.getRecrutement()) {
					tabSalaire[i].Affiche();
				}
			}
		}
		
		System.out.println();
		System.out.println("Le matricule du vendeur qui a le plus grand salaire : ");
		Slaire MaxVendeur = null ;
		for (Slaire s :tabSalaire) {
				if (s instanceof Vendeur) {
					if (MaxVendeur==null) {
						MaxVendeur=s;
						}
					else {
						if (s.Salaire()>MaxVendeur.Salaire()) {
							MaxVendeur=s;
						}
						MaxVendeur.Affiche();
					}
				}
		}

	}

}
