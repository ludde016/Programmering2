package Cars;

public class GörGoo240 extends Car{
	
	public GörGoo240() {
		super.name = "Görgoo 240";
	}
	
	@Override
	void honk() {
		System.out.println("FLYTTA PÅ DIG FÖR I HELVETE");
		
	}

	@Override
	void consume() {
		System.out.println("Consume the soul of the innocent");
		
	}

	@Override
	void roll() {
		System.out.println("Keep on rolling baby, you know what time it is");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartmätaren ligger på under 80 km/h");
	}

}
