
public class Animal {

	void bark(){
		
		System.out.println("Woof-woof");
	}
	
	void meow(){
		System.out.println("Meow");
	}
		
	
	public static void main(String[] args) {

		Animal dog = new Animal();
		Animal cat = new Animal();

		dog.bark();
		cat.meow();
		
	}

}
