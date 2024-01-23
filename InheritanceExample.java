package ObjectOrientedProgrammingLanguageInheritance.java;

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


class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " is eating.");
	}
}

class Dog extends Animal {

	String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public void bark() {
		System.out.println(name + " is barking.");
	}
}

public class InheritanceExample {

	// Inheritance in java is a powerful feature that allows you to create new
	// classes based on existing class.It allows code reuse.

	public static void main(String[] args) {

		Animal animal = new Animal("Generic Animal");
		animal.eat(); // Output: Generic Animal is eating.

		Dog dog = new Dog("Buddy", "Golden Retriever");
		dog.eat(); // Output: Buddy is eating.
		dog.bark(); // Output: Buddy is barking.
	}
}





