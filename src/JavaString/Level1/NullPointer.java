package JavaString.Level1;
import java.util.Scanner;
class NullPointer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string or type null:");
        String text=sc.nextLine();
        if(text.equals("null")){
            text=null;
        }
        System.out.println("Text length is:");
        System.out.println(text.length());
    }
}
