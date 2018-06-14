package EX1_Classes;

public class MontantDriver {

	public static void main(String[] args) {
		Montant montant1=new Montant();
		Montant montant2=new Montant();
		montant1.setsomme(100);
		montant2.setsomme(100);
		montant1.setmonnaie(Monnaie.euro);
		montant2.setmonnaie(Monnaie.dollar);
		montant1.egale(montant2);
		montant1.Comparaison(montant2);
	}

}
