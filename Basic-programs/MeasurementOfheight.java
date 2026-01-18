import java.util.Scanner;
public class MeasurementOfHeight{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter height");
double heightcm=sc.nextDouble();
double heightinches=heightcm*0.3937;
double heightfeet=heightinches*0.0833;
System.out.print("Your Height in cm is "+heightcm +
"while in feet is "+heightfeet+
" and inches is "+heightinches);
}
}