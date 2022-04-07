package Unit_01;

/*
 * The wrapper class in java provides the mechanism to convert primitive into object and 
 * why?
 * Bcz we want to use predefined methods of these objects
 * -boolean data types -> Boolean obj;->obj.tostring();
 */

public class P4_Task02_WrapperClassesInJava {
	public static void main(String[] args) {
		//converting int into Integer
		int a = 20;
		String s = "" + a +"";
		
		Integer i = Integer.valueOf(a);//converting integer value into int explicitily
	    Integer j = a; //autoboxing, now compiler will write Integer.valueof(a) internally
		System.out.println(a+ "" +i+ " +j");
		System.out.println(i.toString());
		// a.tostring can not be done  due to a is int not object
		//Autoboxing: Converting prinitive into objects
		byte b=10;
		Byte byteobj=b;
		System.out.println(byteobj);
		
		//unboxing:Converting Objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
	}

}
