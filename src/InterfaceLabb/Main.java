package InterfaceLabb;

public class Main {
	
	public static void main(String[] args) {
		IKEA[] m�bler = {new TABLE(), new STOL(), new BYR�()};
		
		for (IKEA ikea : m�bler) {
			System.out.println();
			ikea.name();
			ikea.material();
			ikea.Color();
			ikea.price();
			
		}
	}

}
