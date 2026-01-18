import java.util.Scanner;
public class AverageOfThreeNumber{
public static void main(String[] args){
Scanner sc=new 
Scanner(System.in);
System.out.print("Enter a");
int a=sc.nextInt();
System.out.print("Enter b");
int b=sc.nextint();
System.out.print("Enter c");
int c=sc.nextInt();
int sum =a+b+c;
float average=sum/3.0f;
System.out.print(average);
}
}
