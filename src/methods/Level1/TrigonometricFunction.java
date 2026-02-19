package src.methods.Level1;
import java.util.Scanner;
public class TrigonometricFunction{
    public double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        return new double[]{sin,cos,tan};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle=sc.nextDouble();
        TrigonometricFunction obj=new TrigonometricFunction();
        double[]result=obj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine value "+result[0]);
        System.out.println("Cosine value "+result[1]);
        System.out.println("Tangent value "+result[2]);
    }
}

