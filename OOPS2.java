package ObjectOrientedProgrammingLanguage.java;

class Penss {
	String color;
	String type;

	public void write() {
		System.out.println("Writng Something");
	}

	public void printColors() {
		System.out.println(this.color);
	}
}

class Student {

	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

}

public class OOPS2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Shashank";
		s1.age = 22;

		s1.printInfo();
	}

}
