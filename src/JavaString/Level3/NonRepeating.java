package JavaString.Level3;
import java.util.Scanner;
class NonRepeating{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        char ch=findFirstNonRepeating(text);
        if(ch=='\0') System.out.println("No non-repeating character found");
        else System.out.println("First non-repeating character: "+ch);
    }
    static char findFirstNonRepeating(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++) if(freq[s.charAt(i)]==1) return s.charAt(i);
        return '\0';
    }
}
