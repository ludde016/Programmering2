package ObserverPattern;

public class Police extends aPolice{
	
	public Police (Fartdåre fartdåre) {
		this.fartdåre = fartdåre;
	    this.fartdåre.jaga(this);
	}

	@Override
	public void update() {
		if (this.fartdåre.getHastighet() > 80) {
			System.out.println("Du kör i " + this.fartdåre.getHastighet());
			System.out.println("Slow down bitch");
		} 
		
	}

}
