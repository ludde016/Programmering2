package ObserverPattern;

public class Fartd�re {
	
	private String _hastighet;
	
	public String getHastighet() {
		return _hastighet; 
	}
	
	public void setHastighet(String hastighet) {
		this._hastighet = hastighet;
		policeJakt();
	}
	
	public void jaga(Observer police) {
		police.add(police);
		
	}
	
	public void policeJakt() {
		observer.update();
	}

}
