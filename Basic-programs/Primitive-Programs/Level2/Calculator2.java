import java.util.Scanner;
public class Calculator2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number 1 value");
int num1 = sc.nextInt();
System.out.print("Enter the number 2 value ");
int num2 = sc.nextInt();
System.out.println("Addition " +(num1+num2));
System.out.println("Substraction " +(num1-num2));
System.out.println("Multiplication " + (num1*num2));
System.out.println("Division " + (num1/num2));
}
}