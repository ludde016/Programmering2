package Cars;

public class Volvo740 extends Car {
	
	public Volvo740() {
		super.name = "Volvo740";
	}
	
	@Override
	void honk() {
		System.out.println("*Honk honk*");
		
	}

	@Override
	void consume() {
		System.out.println("K�rran rullar smort p� diesel om diesel var E95");
		
	}

	@Override
	void roll() {
		System.out.println("Rullar som en g�rgoo240 fast b�ttre");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartm�taren ligger p� 740 km/h");
	}

}

