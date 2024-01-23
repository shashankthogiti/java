package ObjectOrientedProgrammingLanguage.java;

class Pen {
	String color;
	String type;

	public void write() {
		System.out.println("Writng Something");
	}

}

public class OOPS {

	public static void main(String[] args) {

		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "Gel";
		pen1.write();

	}

}
