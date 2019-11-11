package InterfaceLabb;

public class BYRÅ implements IKEA {

	@Override
	public void name() {
		System.out.println("MALM");
		
	}

	@Override
	public void material() {
		System.out.println("Spånskiva, Ekfaner, Tonad klar akryllack");
		
	}

	@Override
	public void price() {
		System.out.println("799 Kronor");
		
	}

	@Override
	public void Color() {
		System.out.println("Lack");
		
	}

}
