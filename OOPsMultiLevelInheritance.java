package ObjectOrientedProgrammingLanguageInheritance.java;

class Shape2 {
	public void area() {
		System.out.println("Display area");
	}
}

class Triangle2 extends Shape2 {
	public void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}

class EquilateralTriangle extends Triangle4 {
	public void areaOfEquilateralTriangle(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}

public class OOPsMultiLevelInheritance {

	public static void main(String[] args) {
		EquilateralTriangle t1 = new EquilateralTriangle();
		t1.area();
		t1.area(2, 3);
		t1.areaOfEquilateralTriangle(2, 3);

	}

}
