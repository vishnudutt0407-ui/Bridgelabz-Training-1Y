package src.methods.Level1;
import java.util.Scanner;
class QuotientRemainder{
    static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor=sc.nextInt();
        int[]result=findRemainderAndQuotient(number,divisor);
        System.out.println("Quotient is "+result[0]);
        System.out.println("Remainder is "+result[1]);
    }
}
