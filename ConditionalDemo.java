
public class ConditionalDemo {

	public static void main(String[] args) {
				
				int value1 = 2;
		        int value2 = 2;
		        //and
		        if((value1 == 1) && (value2 == 2))
		            System.out.println("value1 is 1 AND value2 is 2");
		        if((value1 != 1) && (value2 == 2))
		            System.out.println("value1 is not 1 AND value2 is 2");
		        if((value1 == 1) && (value2 != 2))
		            System.out.println("value1 is 1 AND value2 is not 2");
		        if((value1 == 2) && (value2 == 2))
		            System.out.println("value1 is 2 AND value2 is 2");
		        //or
		        if((value1 == 1) || (value2 == 1))
		            System.out.println("value1 is 1 OR value2 is 1");
		        if((value1 == 2) || (value2 == 2))
		            System.out.println("value1 is 2 OR value2 is 2");

	}

}