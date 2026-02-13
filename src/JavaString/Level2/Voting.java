package JavaString.Level2;
import java.util.Scanner;
class Voting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] ages=new int[n];
        System.out.println("Enter ages of 10 students:");
        for(int i=0;i<n;i++) ages[i]=sc.nextInt();
        String[][] result=canVote(ages);
        displayTable(result);
    }
    static String[][] canVote(int[] ages){
        String[][] arr=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            arr[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) arr[i][1]="false";
            else if(ages[i]>=18) arr[i][1]="true";
            else arr[i][1]="false";
        }
        return arr;
    }
    static void displayTable(String[][] arr){
        System.out.println("Age\tCanVote");
        for(int i=0;i<arr.length;i++) System.out.println(arr[i][0]+"\t"+arr[i][1]);
    }
}
