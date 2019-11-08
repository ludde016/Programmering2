package Cars;

public class VolvoV50 extends Car{
	
	public VolvoV50() {
		super.name = "V50";
	}
	
	@Override
	void honk() {
		System.out.println("Vem beh�ver tuta n�r allt rullar s� fint?");
		
	}

	@Override
	void consume() {
		System.out.println("INTE E95 F�R FAN, DIESEL SA JAG");
		
	}

	@Override
	void roll() {
		System.out.println("Borde bytt till vinterd�ck");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartm�taren ligger stadigt p� 90 km/h");
	}

}

