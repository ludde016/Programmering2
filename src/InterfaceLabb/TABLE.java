package InterfaceLabb;

public class TABLE implements IKEA{

	@Override
	public void name() {
		System.out.println("Docksta");
		
	}

	@Override
	public void material() {
		System.out.println("Sp�nskiva, Laminat, ABS-plast, St�l");
		
	}

	@Override
	public void price() {
		System.out.println("199 Kronor");
		
	}

	@Override
	public void Color() {
		System.out.println("Vitt");
		
	}

}
