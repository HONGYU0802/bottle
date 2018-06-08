package bag1;

//·â×°
class GoodDog{
	private int size;
	
	public int getSize(){
		return size;
	}
	public void setSize(int s) {
		size=s;
	}
	
	void bark(){
		if(size>60){
			System.out.println("Woof");
		}
		else if(size>14){
			System.out.println("Ruff");
		}
		else{
			System.out.println("Yip");
		}
	}
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDog one=new GoodDog();
		GoodDog two=new GoodDog();
		one.setSize(70);
		two.setSize(8);
		System.out.println("Dog one: "+one.getSize());
		System.out.println("Dog two: "+two.getSize());
		one.bark();
		two.bark();
	}

}
