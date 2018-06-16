package EX2_BuilderComposite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Groupe extends Forme{
	private List<Forme> childFormes=new ArrayList<Forme>();
		
	@Override
	public String toString(){
		return name;
	}
	
	@Override
	public void print(){
		//System.out.println(toString());
		for(Forme forme : childFormes){		
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
