import java.util.Scanner;
public class Kmtomiles2{
public static void main(String[] args){
Scanner sc = new  Scanner(System.in);
System.out.println("the distance in kilometer: ");
double km = sc.nextDouble();
double miles = km / 1.6;
System.out.println("the totale miles is " + miles + "Miles for the given kilometer is " + km + "KM");
}
}