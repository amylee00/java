
public class Person{  // this class is used by the other class MyClass.java
	private String name;
	private int age;
	
	Person(String n){
		this.setName(n);
	}

	public int getAge(){
		return age; // when the method type is int, have to return value
	}
	
	public void setAge(int a){	
		this.age=a;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}