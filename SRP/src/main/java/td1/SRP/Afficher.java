package td1.SRP;

public class Afficher {

	public void   AfficherCoordone(String message) {
	System.out.println(message);
    
	}	
	public void   AfficherSalaire(double salaire) {
	System.out.println(salaire);
    
	}	

	}
	public double calculSalaire() {return salaire*12;}
	public void AfficheCordonnes() { Instance.printer.AfficherCoordone(nom+","+adresse);}
	public void AfficheSalaire() { Instance.printer.AfficherSalaire(calculSalaire());}
}


}
