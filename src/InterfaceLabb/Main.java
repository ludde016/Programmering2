package InterfaceLabb;

public class Main {
	
	public static void main(String[] args) {
		IKEA[] möbler = {new TABLE(), new STOL(), new BYRÅ()};
		
		for (IKEA ikea : möbler) {
			System.out.println();
			ikea.name();
			ikea.material();
			ikea.Color();
			ikea.price();
			
		}
	}

}
