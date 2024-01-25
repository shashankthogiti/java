package ObjectOrientedProgrammingLanguageInheritance.java;

class Shape3 {
	public void area() {
		System.out.println("Display area");
	}
}

class Triangle3 extends Shape4 {
	public void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}

class Circle extends Shape4 {
	public void area(int r) {
		System.out.println(Math.PI * r * r);
	}
}

public class OOPsHierarchialInheritance {

	public static void main(String[] args) {

		Triangle4 t1 = new Triangle4();
		t1.area();// Shape3 class
		t1.area(2, 3);// Triangle3 class

		Circle1 c1 = new Circle1();
		c1.area();// Shape3 class
		c1.area(2);// Circle class

	}

}
