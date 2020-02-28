package td1.SRP;

public class Employe {
private final String nom="AA";
private final String adresse="BB";
private double salaire;
	
	public Employe(double salaire) {
		this.salaire=salaire;

        } 
        public double calculSalaire() {return salaire*12;}
	public void AfficheCordonnes()              {       Instance.printer.AfficherCoordone(nom+","+adresse);}
public void AfficheSalaire(){       Instance.printer.AfficherSalaire(calculSalaire());}
}                   



 
