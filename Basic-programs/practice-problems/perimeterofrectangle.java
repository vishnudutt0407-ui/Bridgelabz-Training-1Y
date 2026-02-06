import java.util.Scanner;
public class perimeterofrectangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the length:");
double length=sc.nextDouble();
System.out.print("Enter the weidth:");
double weidth=sc.nextDouble();
double perimeter = 2*(length+weidth);
System.out.println("Perimeter of rectangle = " +perimeter);
}
}