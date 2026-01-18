import java.util.Scanner;
public class UserKmToMiles{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Km");
double Km=sc.nextDouble();
double Miles=Km/1.6;
System.out.print("The total mile is"+Miles+
"for the given Km"+Km);
}
}