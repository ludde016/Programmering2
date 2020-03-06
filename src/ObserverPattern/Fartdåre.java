package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Fartdåre {
	
	private List<Police> Polices = new ArrayList<Police>();
	private int _hastighet;
	
	public int getHastighet() {
		return _hastighet; 
	}
	
	public void setHastighet(int hastighet) {
		this._hastighet = hastighet;
		policeJakt();
	}
	
	public void jaga(Police police) {
		Polices.add(police);
		
	}
	
	public void policeJakt() {
		for(Police police : Polices) {
			police.update();
		}
	}

}
