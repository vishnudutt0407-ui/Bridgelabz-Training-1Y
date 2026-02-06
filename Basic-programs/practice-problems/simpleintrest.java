import java.util.Scanner;
public class simpleintrest{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the principal: ");
double principal=sc.nextDouble();
System.out.print("Enter the rate: " );
double rate=sc.nextDouble();
System.out.print("Enter the time: " );
double time=sc.nextDouble();
double simpleIntrest=(principal*rate*time)/100;
System.out.println("The simple intrest is = " +simpleIntrest);
}
}