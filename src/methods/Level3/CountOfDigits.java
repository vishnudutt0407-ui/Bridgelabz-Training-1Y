package src.methods.Level3;
import java.util.Scanner;
public class CountOfDigits{
    public static int countDigits(int n){
        int count=0;
        while(n>0){n/=10;count++;}
        return count;
    }
    public static int[] storeDigits(int n){
        int size=countDigits(n);
        int[]digits=new int[size];
        for(int i=size-1;i>=0;i--){digits[i]=n%10;n/=10;}
        return digits;
    }
    public static int sumDigits(int[]digits){
        int sum=0;for(int d:digits)sum+=d;return sum;
    }
    public static int sumSquares(int[]digits){
        int sum=0;for(int d:digits)sum+=Math.pow(d,2);return sum;
    }
    public static boolean isHarshad(int n,int[]digits){
        return n%sumDigits(digits)==0;
    }
    public static int[][] digitFrequency(int[]digits){
        int[][]freq=new int[10][2];
        for(int i=0;i<10;i++){freq[i][0]=i;freq[i][1]=0;}
        for(int d:digits)freq[d][1]++;
        return freq;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int[]digits=storeDigits(num);
        System.out.println("Number of digits: "+digits.length);
        System.out.print("Digits: ");
        for(int d:digits)System.out.print(d+" ");
        System.out.println("\nSum of digits: "+sumDigits(digits));
        System.out.println("Sum of squares of digits: "+sumSquares(digits));
        System.out.println("Is Harshad number: "+isHarshad(num,digits));
        int[][]freq=digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++)if(freq[i][1]>0)System.out.println("Digit "+freq[i][0]+" occurs "+freq[i][1]+" times");
    }
}
