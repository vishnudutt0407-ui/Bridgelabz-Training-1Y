package src.methods.Level1;
import java.util.Scanner;
class SpringSeason{
    static boolean isSpring(int month,int day){
        if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20))return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month: ");
        int month=sc.nextInt();
        System.out.print("Enter day: ");
        int day=sc.nextInt();
        boolean result=isSpring(month,day);
        if(result)System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}
