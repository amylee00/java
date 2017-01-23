public class MyClass {

	public static void main(String[] args) {

		Person j; // Person class defined separately in Person
		j=new Person("John");
		j.setAge(20);
		celebrateBirthday(j);
		System.out.println(j.getAge());	
		System.out.println(j.getName());
	}

	static void celebrateBirthday(Person p){
		p.setAge(p.getAge()+1);
		p.setName("Happy Birthday "+p.getName()+"!!");	
	}

	
}
