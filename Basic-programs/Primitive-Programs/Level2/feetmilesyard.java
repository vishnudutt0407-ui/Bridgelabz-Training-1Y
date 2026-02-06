import java.util.Scanner;
public class feetmilesyard{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter distance in feed:");
double feet=sc.nextDouble();
double yards= feet/3;
double miles = yards/1760;
System.out.println(" The ditance in yards = " + yards);
System.out.println(" Distance in miles = " + miles);
}
}