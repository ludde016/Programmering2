package Cars;

abstract class Car {
	
	protected String name;
	
	abstract void honk();
	
	abstract void consume();
	
	abstract void roll();
	
	abstract void speed();
	
	public static void KöriDiket() {
		System.out.println("*Kör ner i diket*");
	}

}
