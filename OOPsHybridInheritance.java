package ObjectOrientedProgrammingLanguageInheritance.java;

class Shape4 {
	public void area() {
		System.out.println("Display area");
	}
}

class Triangle4 extends Shape3 {
	public void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}

class Circle1 extends Shape3 {
	public void area(int r) {
		System.out.println(Math.PI * r * r);
	}
}

class SemiCircle extends Circle {
	public void areaOfSemiCircle(int r) {
		System.out.println(Math.PI * r * r / 2);
	}
}

public class OOPsHybridInheritance {

	public static void main(String[] args) {

		Triangle3 t1 = new Triangle3();
		t1.area();// Shape3 class
		t1.area(2, 3);// Triangle3 class

		SemiCircle c1 = new SemiCircle();
		c1.area();// Shape class
		c1.area(2);// circle class
		c1.areaOfSemiCircle(2);// semicircle class

	}

}
