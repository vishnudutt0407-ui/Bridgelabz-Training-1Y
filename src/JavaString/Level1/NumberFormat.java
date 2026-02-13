package JavaString.Level1;
import java.util.Scanner;
class NumberFormatDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to convert to number:");
        String text=sc.nextLine();
        System.out.println("Generating NumberFormatException:");
        generateException(text);
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }
    static void generateException(String str){
        int num=Integer.parseInt(str);
        System.out.println("Number is: "+num);
    }
    static void handleException(String str){
        try{
            int num=Integer.parseInt(str);
            System.out.println("Number is: "+num);
        }catch(NumberFormatException e){
            System.out.println("Caught NumberFormatException: Invalid number format");
        }catch(Exception e){
            System.out.println("Caught RuntimeException: "+e.getMessage());
        }
    }
}

