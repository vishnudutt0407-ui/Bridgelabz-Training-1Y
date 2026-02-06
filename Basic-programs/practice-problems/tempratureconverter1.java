import java.util.Scanner;
public class tempratureconverter1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter temprature in celsius:");
int celsius=sc.nextInt();
int fahrenheit=(celsius*9/5)+32;
System.out.println("The temprature in fahrenheit = " +fahrenheit);
}
} 