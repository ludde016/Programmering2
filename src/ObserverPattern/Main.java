package ObserverPattern;

public class Main {
	
	public static void main(String[] args) {
		Fartd�re fartd�re = new Fartd�re();
		
		new Police(fartd�re);
		
		fartd�re.setHastighet(150);
	}

}
