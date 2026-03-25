public class arithmeticexception {
	public static void main (String[]args){
		try {
		int a = 20;
		int b = 0;
		int c = a/b;
		System.out.println("the output is : +c");
	    }
		catch (ArithmeticException e){
			System.out.println("arithmetic not found");
		}
finally {
System.out.println("finally code is executed");
}
	}
}