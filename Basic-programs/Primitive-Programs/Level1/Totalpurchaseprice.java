import java.util.Scanner;
public class Totalpurchaseprice{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the unit price (INR):");
double unitPrice = sc.nextDouble();
System.out.print("Enter quantity:");
int quantity = sc.nextInt();
double totalPrice = unitPrice * quantity;
System.out.println("The total  perchase price is " + totalPrice + "if quantity is " + quantity + " and unit price is " +unitPrice);
}
}