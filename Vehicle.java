
public class Vehicle{

	int maxSpeed;
	String colors;
	
	void horn(){
		System.out.println("Beep-beep");
	}

	
	
	public static void main(String[] args) {
		
	Vehicle v1 = new Vehicle();
	Vehicle v2 = new Vehicle();
	
	v1.colors="red";
	v2.horn();

	
	}
}