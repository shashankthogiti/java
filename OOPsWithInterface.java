package ObjectOrientedProgrammingLanguageAbstraction.java;

interface Animal2 {

	public void walks();
	
}

class Horse2 implements Animal2 {

	@Override
	public void walks() {
		System.out.println("Horse walk on 4 legs");
	}
}

class Hen2 implements Animal2 {
	@Override
	public void walks() {
		System.out.println("Hen walks on 2 legs");
	}
}

public class OOPsWithInterface {

	public static void main(String[] args) {
		Horse2 horse = new Horse2();
		horse.walks();

		Hen2 hen = new Hen2();
		hen.walks();
	}

}
