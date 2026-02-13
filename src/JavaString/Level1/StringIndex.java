package JavaString.Level1;
import java.util.Scanner;
class StringIndexDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        int invalidIndex=text.length(); // This is out of bounds
        System.out.println("Length of string: "+text.length());
        System.out.println("Accessing index "+invalidIndex+" is invalid for demonstration purposes");
    }
}
