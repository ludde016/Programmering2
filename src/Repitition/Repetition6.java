package Repitition;

public interface Repetition6 {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Ludvig", 18); 
		Person person2 = new Person("Raiwin", 17); 
		
		if (person1.age > person2.age) {
			System.out.println(person1.name);
			
		}
		else {
			System.out.println(person2.name);
		}
	}

}