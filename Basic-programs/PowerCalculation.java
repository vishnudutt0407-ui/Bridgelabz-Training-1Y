import java.util.Scanner;
public class PowerCalculations{
public static void main(String[] args){
Scanner sc=new 
Scanner (System.in);
System.out.print("Enter base value");
int base=sc.nextInt();
System.out.println("Enter the exponent value");
int exponent=sc.nextInt();
double result=Math.pow(base,exponent);
System.out.print(result);
}
}