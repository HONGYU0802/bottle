package EX1_Classes;

//Q2: Declaration de la classe Montant
public class Montant {
	
	private double somme;
	private Monnaie monnaie;

	public void setsomme(double s){
		this.somme=s;
	}
	
	public void setmonnaie(Monnaie m){
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
	public Montant(){
		this.somme=0;
		this.monnaie=Monnaie.euro;
	}
	
	//Q5: Conversion en chaine de caractere (test)
	String ConversionCaractere(){
		if(monnaie==Monnaie.euro){
			return somme +"euro";
		}
		else{
			return somme +"dollar";
		}
	}
	
	//Q6: Conversion d'un montant (test)
	double ConversionMontant(){
		if(monnaie==Monnaie.euro){
			this.somme*=1.16;
			this.monnaie=Monnaie.dollar;
			return somme;
		}
		else if(monnaie==Monnaie.dollar){
			this.somme*=0.84;
			this.monnaie=Monnaie.euro;
			return somme;
		}
		return somme;		
	}
	
	//Q7: Test d'egalite entre deux montants (test)
	String egale(Montant montant2){
			if(this.monnaie!=montant2.monnaie()){
				if(this.doubleValue()==montant2.ConversionMontant()){
					return "Ils sont egales";
				}
				else{
					return "Ils ne sont pas egales";
				}		
			}
			else{
				if(this.doubleValue()==montant2.doubleValue()){
					return "Ils sont egales";
				}
				else{
					return "Ils ne sont pas egales";
				}
			}
	}
	
	//Q8: Comparaison selon l'ordre naturel sur meme monnaie (test)
	String Comparaison(Montant montant){
			if(this.monnaie()!=montant.monnaie()){
				this.ConversionMontant();
				if(this.doubleValue()==montant.doubleValue()){
					return "egale";
				}
				else if(this.doubleValue()>montant.doubleValue()){
					return "superieur";
				}
				else{
					return "inferieur";
				}
			}
			else{
				if(this.doubleValue()==montant.doubleValue()){
					return "egale";
				}
				else if(this.doubleValue()>montant.doubleValue()){
					return "superieur";
				}
				else{
					return "inferieur";
				}
			}
	}
}
