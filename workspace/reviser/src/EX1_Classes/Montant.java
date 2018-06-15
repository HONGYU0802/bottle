package EX1_Classes;

//Q2: Declaration de la classe Montant
public class Montant implements Comparable<Montant>{
	
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
	public Montant(double somme, Monnaie monnaie){
		this.somme=somme;
		this.monnaie=monnaie;
	}
	
	public Montant(double somme){
		this.somme=somme;
		this.monnaie=Monnaie.euro;
	}
	
	//Q5: Conversion en chaine de caractere (test)
	@Override
	public String toString(){
		if(this.monnaie==Monnaie.euro){
			return this.somme+"euro";
		}
		return this.somme+"dollar";
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
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Montant){
			Montant montant=(Montant) obj;
			if(this.somme==montant.somme && this.monnaie==montant.monnaie)
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		//return Double.valueOf(somme).hashCode()^monnaie.hashCode();
		return super.hashCode();
	}
	
	//Q8: Comparaison selon l'ordre naturel sur meme monnaie (test)
	@Override
	public int compareTo(Montant montant) {
		if(this.monnaie()!=montant.monnaie()){
			this.ConversionMontant();
			if(this.somme<montant.somme){
				return -1;
			}
			if(this.somme>montant.somme){
				return 1;
			}
			return 0;
		}
		else{
			if(this.somme<montant.somme){
				return -1;
			}
			if(this.somme>montant.somme){
				return 1;
			}
			return 0;
		}
		
	}
}
