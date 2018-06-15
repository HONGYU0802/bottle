package EX1_Classes;

public class MontantDriver {

	public static void main(String[] args) {
		Montant montant1=new Montant(100);
		Montant montant2=new Montant(100, Monnaie.dollar);
		System.out.println(montant1.toString());
		System.out.println(montant1.equals(montant2));
		System.out.println(montant1.compareTo(montant2));
		System.out.println(montant1.ConversionMontant());
	}

}
