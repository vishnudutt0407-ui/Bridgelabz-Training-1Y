import java.util.Scanner;
public class quotientremaider{
public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first no:");
double number1=sc.nextDouble();
System.out.print("Enter the second no:");
double number2=sc.nextDouble();
double quotient=number1/number2;
double remaider=number1%number2;
System.out.println(" The quotient is = " +quotient);
System.out.println(" The remaider is = " +remaider);
}
}