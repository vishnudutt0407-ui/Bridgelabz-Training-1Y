import java.util.Scanner;
public class areaofcircle{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the vale of radius: ");
double radius =sc.nextDouble();
double area = 3.14*(radius*radius);
System.out.println("Area of circle is = " +area);
}
}