package JavaString.Level1;
import java.util.Scanner;
class UpperCaseDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();
        String builtIn=text.toUpperCase();
        String converted=toUpperCustom(text);
        boolean same=compareStrings(builtIn,converted);
        System.out.println("Built-in uppercase: "+builtIn);
        System.out.println("Custom uppercase: "+converted);
        System.out.println("Are both results same? "+same);
    }
    static String toUpperCustom(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result+=ch;
        }
        return result;
    }
    static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
}
