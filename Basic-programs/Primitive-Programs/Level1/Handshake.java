import java.util.Scanner;
public class Handshake{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the number of student:");
int studentsNumber=sc.nextInt();
int handshake=(studentsNumber * (studentsNumber - 1))/2;
System.out.println(" Maximum number of handshake is " + handshake);
}
}