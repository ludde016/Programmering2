package Cars;

public class Amazon extends Car{
	
	public Amazon() {
		super.name = "Amazon";
	}
	
	@Override
	void honk() {
		System.out.println("Snygg byggt, fr�sig k�rra");
		
	}

	@Override
	void consume() {
		System.out.println("E95 tack");
		
	}

	@Override
	void roll() {
		System.out.println("Rullar inte s� l�ngt med punka");
		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Fartm�taren ligger n�gonstans mellan 50 och 100 km/h ");
	}

}
