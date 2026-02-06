import java.util.Scanner;
public class squresides{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the perimeter of squre:");
double perimeter=sc.nextDouble();
double side= perimeter/4;
System.out.print("Length of the side is " + side + " whose perimeter is " + perimeter);
}
}