import java.util.Scanner;
public class basiccalculator{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the number1:");
double num1 = sc.nextDouble();
System.out.print("Enter the number2:");
double num2=sc.nextDouble();
double adddition = num1 + num2;
double substraction = num1- num2;
double multiplication = num1*num2;
double division = num1/num2;
System.out.println("Addition = " + adddition);
System.out.println("substraction = " + substraction);
System.out.println("multiplication = " + multiplication);
System.out.println("division = " + division);
}
}