package JavaString.Level1;
import java.util.Scanner;
class IllegalArgumentDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        System.out.println("Enter start index:");
        String startInput=sc.nextLine();
        System.out.println("Enter end index:");
        String endInput=sc.nextLine();
        int start=0;
        int end=0;
        try{
            start=Integer.parseInt(startInput);
            end=Integer.parseInt(endInput);
        }catch(NumberFormatException e){
            System.out.println("Invalid input: Please enter numbers for indices");
            return;
        }
        if(start<0||end>text.length()||start>end){
            System.out.println("IllegalArgumentException: start index is greater than end index or indices are invalid");
        }else{
            System.out.println("Substring: "+text.substring(start,end));
        }
    }
}
