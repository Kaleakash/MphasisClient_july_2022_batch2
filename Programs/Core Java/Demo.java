import java.util.*;
class Demo {
	public static void main(String args[]) {
		String name1 = "Raj Deep";		
		String name2 = "Raj Deep";		
		String name3 = new String("Raj Deep");
		String name4 = new String("Raj Deep");
		if(name3==name4) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

		if(name3.equals(name4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}