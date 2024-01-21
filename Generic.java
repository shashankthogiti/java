package generic.java;

// Generic means parameterized type.The is to allow type(String,Integer,....) to be a parameter to methods, classes and interfaces

class Generic<T> {
	T obj;

	Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}


	public static void main(String[] args) {

		Generic<Integer> object = new Generic<>(15);
		System.out.println(object.getObj());
		
		Generic<String> object2 = new Generic<>("Shashank");
		System.out.println(object2.getObj());

	}

}
