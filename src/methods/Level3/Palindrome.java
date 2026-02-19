package src.methods.Level3;
import java.util.Scanner;
public class Palindrome{
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
    public static int[] reverseDigits(int[]digits){
        int n=digits.length;
        int[]rev=new int[n];
        for(int i=0;i<n;i++)rev[i]=digits[n-1-i];
        return rev;
    }
    public static boolean compareArrays(int[]a,int[]b){
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++)if(a[i]!=b[i])return false;
        return true;
    }
    public static boolean isPalindrome(int n,int[]digits){
        return compareArrays(digits,reverseDigits(digits));
    }
    public static boolean isDuckNumber(int[]digits){
        for(int d:digits)if(d!=0)return true;
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int[]digits=storeDigits(num);
        System.out.print("Digits: ");
        for(int d:digits)System.out.print(d+" ");
        System.out.println("\nReversed digits: ");
        int[]rev=reverseDigits(digits);
        for(int d:rev)System.out.print(d+" ");
        System.out.println("\nIs Palindrome: "+isPalindrome(num,digits));
        System.out.println("Is Duck Number: "+isDuckNumber(digits));
    }
}
