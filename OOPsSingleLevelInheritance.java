package ObjectOrientedProgrammingLanguageInheritance.java;

class Shape1 {
	public void area() {
		System.out.println("Display area");
	}
}

class Triangle1 extends Shape1 {
	public void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}

public class OOPsSingleLevelInheritance {

	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();
		t1.area();
		t1.area(2, 3);

	}

}
