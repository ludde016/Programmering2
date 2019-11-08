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
		System.out.println("Kärran rullar smort på diesel om diesel var E95");
		
	}

	@Override
	void roll() {
		System.out.println("Rullar som en görgoo240 fast bättre");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartmätaren ligger på 740 km/h");
	}

}

