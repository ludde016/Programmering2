package ObserverPattern;

public class Police extends aPolice{
	
	public Police (Fartd�re fartd�re) {
		this.fartd�re = fartd�re;
	    this.fartd�re.jaga(this);
	}

	@Override
	public void update() {
		if (this.fartd�re.getHastighet() > 80) {
			System.out.println("Du k�r i " + this.fartd�re.getHastighet());
			System.out.println("Slow down bitch");
		} 
		
	}

}
