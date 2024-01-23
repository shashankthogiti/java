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

public class EncapsulationExampleCar {

	// The Concept of binding feilds and method together as a single unit is called
	// Encapsulation.It helps in keep data security and provide controlledd access
	// to it.'GETTERS & SETTERS' are used to access and modify the variable.

		private String name;
		private String model;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}


	public static void main(String[] args) {

		EncapsulationExampleCar name = new EncapsulationExampleCar();
		EncapsulationExampleCar model = new EncapsulationExampleCar();
		name.setName("TATA");
		model.setModel("TATA nano");
		System.out.println(name.getName());
		System.out.println(model.getModel());

	}

}
