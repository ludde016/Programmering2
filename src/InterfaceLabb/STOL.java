package InterfaceLabb;

public class STOL implements IKEA {

	@Override
	public void name() {
		System.out.println("Tobias");
		
	}

	@Override
	public void material() {
		System.out.println("Stål, Karbonatplast");
		
	}

	@Override
	public void price() {
		System.out.println("655 Kronor");
		
	}

	@Override
	public void Color() {
		System.out.println("Plast");
		
	}

}
