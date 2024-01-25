package ObjectOrientedProgrammingLanguageAbstraction.java;

//Abstraction in java is hiding the implementation detail and shows only essential feature.
//The abstract be perforn abstract and non-abstract method

abstract class Animal1 {
	abstract void walk();// abstract method

	public void eat() { // non-abstract method
		System.out.println("Animal eats");
	}
}

class Horse1 extends Animal1 {
	@Override
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}

class Hen1 extends Animal1 {
	@Override
	public void walk() {
		System.out.println("walk s on 2 legs");
	}
}

public class OOPS1 {

	public static void main(String[] args) {
		Horse1 horse1 = new Horse1();
		horse1.walk();
		horse1.eat();

		Hen1 hen1 = new Hen1();
		hen1.walk();
		hen1.eat();

	}

}
