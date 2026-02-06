import java.util.Scanner;
public class kmconverter2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the distance in km: ");
double kM=sc.nextDouble();
double miles=kM*0.621371;
System.out.println("The distance in miles is = " +miles);
}
}