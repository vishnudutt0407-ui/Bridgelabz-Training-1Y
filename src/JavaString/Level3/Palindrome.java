package JavaString.Level3;
import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text:");
        String text=sc.nextLine();
        System.out.println("Method 1: "+isPalindrome(text));
        System.out.println("Method 2: "+isPalindromeRec(text,0,text.length()-1));
        System.out.println("Method 3: "+isPalindromeArray(text));
    }
    static boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;end--;
        }
        return true;
    }
    static boolean isPalindromeRec(String s,int start,int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return isPalindromeRec(s,start+1,end-1);
    }
    static boolean isPalindromeArray(String s){
        char[] ch=s.toCharArray();
        char[] rev=new char[ch.length];
        for(int i=0;i<ch.length;i++) rev[i]=s.charAt(s.length()-1-i);
        for(int i=0;i<ch.length;i++) if(ch[i]!=rev[i]) return false;
        return true;
    }
}
