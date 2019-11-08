package Cars;

public class Main {
	
	public static void main(String[] args) {
		Car[] cars = {new GörGoo240(), new Amazon(), new Volvo740(), new VolvoV50()};
		
		for (Car car : cars) {
			System.out.println();
			System.out.println(car.name);
			car.honk();
			car.roll();
			car.speed();
			car.consume();
			
		}
	}

}
