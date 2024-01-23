package ObjectOrientedProgrammingLanguageInheritance.java;

//Multilevel inheritance
class Animal1 {

	void printA() {
		System.out.println("Animal is Running");
	}

}

//Dogs is child class
class Dog1 extends Animal1 {

	void printD() {
		System.out.println("Dog is Barging");
	}

}

class Labradors extends Dog1 {
	void printL() {
		System.out.println("Lab is barging");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Labradors L = new Labradors();
		L.printA();
		L.printD();
		L.printL();

	}

}
