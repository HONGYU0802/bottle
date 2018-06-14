package EX1_Classes;



//Q2: Declaration de la classe Montant
public class Montant {
	
	public static int flag=0;
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
		this.somme=0;
		this.monnaie=Monnaie.euro;
	}
	
	//Q5: Conversion en chaine de caractere????? (test)
	void ConversionCaractere(){
		if(monnaie==Monnaie.euro){
			this.monnaie=Monnaie.dollar;
			System.out.println(somme+" dollar");
		}
		else if(monnaie==Monnaie.dollar){
			this.monnaie=Monnaie.euro;
			System.out.println(somme+" euro");
		}
	}
	
	//Q6: Conversion d'un montant (test)
	double ConversionMontant(){
		if(monnaie==Monnaie.euro){
			this.somme*=1.16;
		}
		if(monnaie==Monnaie.dollar){
			this.somme*=0.84;
		}
		return somme;
	}
	
	//Q7: Test d'egalite entre deux montants (test)
	boolean egale(Montant montant2){
			if(this.monnaie!=montant2.monnaie()){
				if(this.doubleValue()==montant2.ConversionMontant()){
					System.out.println("ILs sont egales");
					return true;
				}
				else{
					System.out.println("ILs ne sont pas egales");
					return false;
				}		
			}
			else{
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("ILs sont egales");
					return true;
				}
				else{
					System.out.println("ILs ne sont pas egales");
					return false;
				}
			}
	}
	
	//Q8: Comparaison selon l'ordre naturel sur meme monnaie (test)
	void Comparaison(Montant montant2){
			if(this.monnaie()!=montant2.monnaie()){
				this.ConversionMontant();
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("montant1 = montant2");
					flag=1;
					return;
				}
				else if(this.doubleValue()>montant2.doubleValue()){
					System.out.println("montant1 > montant2");
					flag=2;
					return;
				}
				else{
					System.out.println("montant1 < montant2");
					flag=3;
					return;
				}
			}
			else{
				if(this.doubleValue()==montant2.doubleValue()){
					System.out.println("montant1 = montant2");
					flag=4;
					return;
				}
				else if(this.doubleValue()>montant2.doubleValue()){
					System.out.println("montant1 > montant2");
					flag=5;
					return;
				}
				else{
					System.out.println("montant1 < montant2");
					flag=6;
					return;
				}
			}
	}
}
