import java.util.Scanner;
public class areaoftriangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the base in cm:");
double baseCM=sc.nextDouble();
System.out.print("Enter the height in cm:");
double heightCM=sc.nextDouble();
double areaCM=0.5 * baseCM * heightCM;
double areaInches=areaCM/(2.54*2.54);
System.out.println("Area in squre cm" + areaCM);
System.out.println("Area in squre inches " + areaInches);
}
}