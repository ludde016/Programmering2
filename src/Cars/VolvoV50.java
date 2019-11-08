package Cars;

public class VolvoV50 extends Car{
	
	public VolvoV50() {
		super.name = "V50";
	}
	
	@Override
	void honk() {
		System.out.println("Vem behöver tuta när allt rullar så fint?");
		
	}

	@Override
	void consume() {
		System.out.println("INTE E95 FÖR FAN, DIESEL SA JAG");
		
	}

	@Override
	void roll() {
		System.out.println("Borde bytt till vinterdäck");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartmätaren ligger stadigt på 90 km/h");
	}

}

