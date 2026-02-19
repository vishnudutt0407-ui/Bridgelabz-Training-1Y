package src.methods.Level2;
import java.util.Scanner;
public class Numbers{
    public static int[] generate4DigitRandomArray(int size){
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[]numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min=Math.min(min,numbers[i]);
            max=Math.max(max,numbers[i]);
        }
        double avg=(double)sum/numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[]args){
        int[]arr=generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
        System.out.println();
        double[]result=findAverageMinMax(arr);
        System.out.println("Average: "+result[0]);
        System.out.println("Minimum: "+result[1]);
        System.out.println("Maximum: "+result[2]);
    }
}
