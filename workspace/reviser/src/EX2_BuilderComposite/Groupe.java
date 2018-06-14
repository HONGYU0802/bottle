package EX2_BuilderComposite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Groupe implements Forme{
	private List<Forme> childFormes=new ArrayList<Forme>();
	
	@Override
	public String toString(){
		return "\n------------Croupe----------";
	}
	
	@Override
	public void print(){
		for(Forme forme : childFormes){
			System.out.println(forme.toString());
			forme.print();
		}
	}
	
	public void add(Forme forme){
		childFormes.add(forme);
	}
	
	public void remove(Forme forme){
		childFormes.remove(forme);
	}
}
