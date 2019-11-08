package Cars;

public class Amazon extends Car{
	
	public Amazon() {
		super.name = "Amazon";
	}
	
	@Override
	void honk() {
		System.out.println("Snygg byggt, fräsig kärra");
		
	}

	@Override
	void consume() {
		System.out.println("E95 tack");
		
	}

	@Override
	void roll() {
		System.out.println("Rullar inte så långt med punka");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartmätaren ligger någonstans mellan 50 och 100 km/h ");
	}

}
