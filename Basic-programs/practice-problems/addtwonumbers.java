import java.util.Scanner;
public class addtwonumbers{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter first no:");
int number1= sc.nextInt();
System.out.print("Enter the second no:");
int number2=sc.nextInt();
int add = number1+number2;
System.out.println("Addition of two number is = " + add);
}
}