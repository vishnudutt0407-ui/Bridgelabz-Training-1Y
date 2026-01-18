import java.util.Scanner;
public class UserUniversityfee{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("fee");
double fee=sc.nextDouble();
System.out.print("discountPercent");
double discountPercent=sc.nextDouble();
double discount=fee*discountPercent/100;
double discountedFee=fee-discount;
System.out.println("The discounted amount is INR "+discount+
                   "discounted Fee in INR"+discountedFee);
}
}		 
