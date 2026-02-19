package src.methods.Level3;
import java.util.Scanner;
public class NumberChecker{
    public static int[] getDigits(int n){
        int temp=n,count=0;
        while(temp>0){temp/=10;count++;}
        int[]digits=new int[count];
        for(int i=count-1;i>=0;i--){digits[i]=n%10;n/=10;}
        return digits;
    }
    public static boolean isDuck(int[]d){
        for(int i:d)if(i!=0)return true;
        return false;
    }
    public static boolean isArmstrong(int[]d){
        int sum=0,n=d.length,number=0;
        for(int i:d)sum+=Math.pow(i,n);
        for(int i:d)number=number*10+i;
        return sum==number;
    }
    public static int[] largestTwo(int[]d){
        int l=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int i:d){if(i>l){s=l;l=i;}else if(i>s)s=i;}
        return new int[]{l,s};
    }
    public static int[] smallestTwo(int[]d){
        int s=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int i:d){if(i<s){second=s;s=i;}else if(i<second)second=i;}
        return new int[]{s,second};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int[]digits=getDigits(num);
        System.out.print("Digits: ");
        for(int i:digits)System.out.print(i+" ");
        System.out.println("\nDuck Number: "+isDuck(digits));
        System.out.println("Armstrong: "+isArmstrong(digits));
        int[]lt=largestTwo(digits);
        System.out.println("Largest: "+lt[0]+", Second Largest: "+lt[1]);
        int[]st=smallestTwo(digits);
        System.out.println("Smallest: "+st[0]+", Second Smallest: "+st[1]);
    }
}
