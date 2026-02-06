import java.util.Scanner;
public class heihtconverter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your height in cm:");
double heightCM=input.nextDouble();
double totalInches= heightCM/2.54;
int feet= (int)
(totalInches/12);
double inches = totalInches % 12;
System.out.println("your  height in cm " + heightCM + "while in feet is " + feet + "and in inches is " + inches);
}
}