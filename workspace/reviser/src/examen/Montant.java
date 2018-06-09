package examen;

//Q2: Declaration de la classe Montant
public class Montant {
	private double somme;
	private Monnaie monnaie;
	
	void setsomme(double s){
		this.somme=s;
	}
	
	void setmonnaie(Monnaie m){
		this.monnaie=m;
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
	
	//Q5: Conversion en chaine de caractere????? (test)
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
	
	//Q7: Test d'egalite entre deux montants (test)
	void egale(Montant montant2){
			if(this.monnaie!=montant2.monnaie()){
				if(this.doubleValue()==montant2.ConversionMontant()){
					System.out.println("Ils sont egales");
				}
				else{
					System.out.println("Ils ne sont pas egales");
				}		
			}
			else{
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("Ils sont egales");
				}
				else{
					System.out.println("Ils ne sont pas egales");
				}
			}
	}
	
	//Q8: Comparaison selon l'ordre naturel sur meme monnaie (test)
	void Comparaison(Montant montant2){
			if(this.monnaie()!=montant2.monnaie()){
				this.ConversionMontant();
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("montant1 = montant2");
				}
				else if(this.doubleValue()>montant2.doubleValue()){
					System.out.println("montant1 > montant2");
				}
				else{
					System.out.println("montant1 < montant2");
				}
			}
			else{
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("montant1 = montant2");
				}
				else if(this.doubleValue()>montant2.doubleValue()){
					System.out.println("montant1 > montant2");
				}
				else{
					System.out.println("montant1 < montant2");
				}
			}
	}
}
