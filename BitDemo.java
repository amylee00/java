
public class BitDemo {

	public static void main(String[] args) {

		        int bitmask =001;  //1 or 8?
		        int val = 011;//11 or 9?
		        
		        int bitmask2 = 0x000F;//what does this mean ?
		        int val2 = 0x2222;//what does this mean?
		        
		        // prints "2"
		        System.out.println(val & bitmask);//AND
		        System.out.println(val ^ bitmask);//exclusive OR
		        System.out.println(val | bitmask);//inclusive OR
		        System.out.println(val << bitmask);//shifts bit pattern to left???
		        System.out.println(val >> bitmask);//shifts bit pattern to right???

		        System.out.println(val2 & bitmask2);//AND

	}

}
