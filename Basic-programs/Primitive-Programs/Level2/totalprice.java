import java.util.Scanner;
public class totalprice{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the unit price INR:");
double unitPrice = sc.nextDouble();
System.out.print("Enter quantity:");
double quantity=sc.nextDouble();
double totalPrice = unitPrice*quantity;
System.out.println(" the total price is INR = " +totalPrice);
}
}