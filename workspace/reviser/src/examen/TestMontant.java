package examen;

//Q1: L'enumeration Monnaie
enum Monnaie{
	euro, dollar;
}

//Q2: Declaration de la classe Montant
class Montant {
	double somme;
	Monnaie monnaie;
	
	void setsomme(double s){
		somme=s;
	}
	
	void setmonnaie(Monnaie m){
		monnaie=m;
	}
	
	//Q3: Les methodes retournent respectivement la somme et la monnaie
	double doubleValue(){
		return somme;
	}
	
	Monnaie monnaie(){
		return monnaie;
	}
	
	//Q4: Initialisation (test)
	void Initial(){
		somme=0;
		monnaie=Monnaie.euro;
	}
	
	//Q5: Conversion en chaine de caractere??? (test)
	void ConversionCaractere(){
		if(monnaie==Monnaie.euro){
			monnaie=Monnaie.dollar;
			System.out.println(somme+" dollar");
		}
		if(monnaie==Monnaie.dollar){
			monnaie=Monnaie.euro;
			System.out.println(somme+" euro");
		}
	}
	
	//Q6: Conversion d'un montant (test)
	double ConversionMontant(){
		if(monnaie==Monnaie.euro){
			somme=0.87*somme;
		}
		if(monnaie==Monnaie.dollar){
			somme=1.13*somme;
		}
		return somme;
	}
}

public class TestMontant {

	public static void main(String[] args) {
		Montant montant1=new Montant();
		Montant montant2=new Montant();
		montant1.setsomme(100);
		montant2.setsomme(100);
		montant1.setmonnaie(Monnaie.euro);
		montant2.setmonnaie(Monnaie.dollar);
		
		//Q7: Test d'egalite entre deux montants (test)
		if(montant1.monnaie!=montant2.monnaie){
			if(montant1.somme==montant2.ConversionMontant()){
				System.out.println("Ils sont egales");
			}
			else{
				System.out.println("Ils ne sont pas egales");
			}		
		}
		else{
			if(montant1.somme==montant2.somme){
				System.out.println("Ils sont egales");
			}
			else{
				System.out.println("Ils ne sont pas egales");
			}
		}
		
		//Q8: Comparaison selon l'ordre naturel sur meme monnaie (test)
		if(montant1.monnaie!=montant2.monnaie){
			montant1.ConversionMontant();
			if(montant1.somme==montant2.somme){
				System.out.println("montant1 = montant2");
			}
			else if(montant1.somme>montant2.somme){
				System.out.println("montant1 > montant2");
			}
			else{
				System.out.println("montant1 < montant2");
			}
		}
		else{
			if(montant1.somme==montant2.somme){
				System.out.println("montant1 = montant2");
			}
			else if(montant1.somme>montant2.somme){
				System.out.println("montant1 > montant2");
			}
			else{
				System.out.println("montant1 < montant2");
			}
		}

	}

}
