package JavaString.Level2;
import java.util.Scanner;
class StringLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.next();
        int count=0;
        while(true){
            if(count==text.toCharArray().length)
                break;
            count++;
        }
        System.out.println("Length of the string: "+count);
    }
}
