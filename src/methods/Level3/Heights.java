package src.methods.Level3;
import java.util.Scanner;
public class Heights{
    public static int[] generateHeights(int size){
        int[]heights=new int[size];
        for(int i=0;i<size;i++){
            heights[i]=(int)(Math.random()*101)+150;
        }
        return heights;
    }
    public static int sumArray(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)sum+=arr[i];
        return sum;
    }
    public static double meanHeight(int[]arr){
        return (double)sumArray(arr)/arr.length;
    }
    public static int shortestHeight(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)min=Math.min(min,arr[i]);
        return min;
    }
    public static int tallestHeight(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)max=Math.max(max,arr[i]);
        return max;
    }
    public static void main(String[]args){
        int[]heights=generateHeights(11);
        System.out.print("Player heights in cm: ");
        for(int i=0;i<heights.length;i++)System.out.print(heights[i]+" ");
        System.out.println();
        System.out.println("Shortest height: "+shortestHeight(heights));
        System.out.println("Tallest height: "+tallestHeight(heights));
        System.out.println("Mean height: "+meanHeight(heights));
    }
}
