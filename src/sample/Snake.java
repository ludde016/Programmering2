package sample;

public class Snake extends Animal {

    public Snake(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Snake is hissing!");
    }

    void sleep() {
        System.out.println("Snake is sleeping!");
    }

    void eat() {
        System.out.println("Snake is devouring!");
    }

	@Override
	void move() {
		System.out.println("Snake is slithering");
		
	}

}
