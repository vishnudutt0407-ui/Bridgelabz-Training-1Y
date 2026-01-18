import java.util.Scanner;
public class CalculateSimpleIntrest{
public static void main(String[] args){
Scanner sc=new
System.out.print("Enter principle:");
double principle=sc.nextDouble();
System.out.print("Enter rate:");
double rate=sc.nextDouble();
System.out.print("Enter time:");
double time=sc.nextDouble();
double si=(principle*rate*time)/100;
system.out.print("simple intrest="+si);
sc.close;
}
}