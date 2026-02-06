import java.util.Scanner;
public class averageofthree{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a:");
double a=sc.nextDouble();
System.out.print("Enter b:");
double b=sc.nextDouble();
System.out.print("Enter c:");
double c=sc.nextDouble();
double average=(a+b+c)/3;
System.out.println("The average of three number is : " +average);
}
} 