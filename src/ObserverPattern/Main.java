package ObserverPattern;

public class Main {
	
	public static void main(String[] args) {
		Fartdåre fartdåre = new Fartdåre();
		
		new Police(fartdåre);
		
		fartdåre.setHastighet(150);
	}

}
