package ObjectOrientedProgrammingLanguageEncapsulation.java;

//The Object Oriented Programming Language deals with 4 Principles or Features.They are:-

//1.Encapsulation
//2.Inheritence
//3.Polymorphism
//4.Abstraction

//But there are 2 more features in OOPS.They are:-

//i.Class
//ii.Object

//i.Class:The class is collection of Object .It is also called as BluePrintor Logical Entity.
//The class are 2 types.Thery are: Pre-defined and User-defined
//The pre-defined are Scanner,Console,System,String
//The user-define are Dog,A,Test,Demo,.............

//ii.Object:Instance of class is called object

public class EncapsulationExampleBooks {

	// The Concept of binding feilds and method together as a single unit is called
	// Encapsulation.It helps in keep data security and provide controlledd access
	// to it.'GETTERS & SETTERS' are used to access and modify the variable.

		private String name;
		private String price;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}


	public static void main(String[] args) {

		EncapsulationExampleBooks name = new EncapsulationExampleBooks();
		EncapsulationExampleBooks price = new EncapsulationExampleBooks();
		name.setName("Java");
		price.setPrice("200/-");
		System.out.println("The Book name is: " + name.getName());
		System.out.println("The Book price is: " + price.getPrice());
		name.setName("HTML");
		price.setPrice("100/-");
		System.out.println("The Book name is: " + name.getName());
		System.out.println("The Book price is: " + price.getPrice());

	}

}
