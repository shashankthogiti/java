package ObjectOrientedProgrammingLanguageInheritance.java;

//Single inheritance
class Animals {

	void printA() {
		System.out.println("Animal is Running");
	}

}

//Dogs is child classa
class Dogs extends Animals {

	void printD() {
		System.out.println("Dog is Barging");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.printA();
		d.printD();

	}

}
