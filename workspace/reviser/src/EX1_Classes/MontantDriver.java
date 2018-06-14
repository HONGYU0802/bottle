package EX1_Classes;

public class MontantDriver {

	public static void main(String[] args) {
		Montant montant1=new Montant();
		Montant montant2=new Montant();
		montant1.Initial();
		montant2.Initial();
		montant1.setsomme(100);
		montant2.setsomme(100);
		montant2.setmonnaie(Monnaie.dollar);
		System.out.println(montant1.ConversionCaractere());
		System.out.println(montant1.egale(montant2));
		System.out.println(montant1.Comparaison(montant2));
		System.out.println(montant1.ConversionMontant());
	}

}
