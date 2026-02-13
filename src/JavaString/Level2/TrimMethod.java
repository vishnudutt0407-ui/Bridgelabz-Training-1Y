package JavaString.Level2;
import java.util.Scanner;
class TrimMethod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        int[] pos=getTrimPositions(text);
        String custom=substringCustom(text,pos[0],pos[1]);
        String builtIn=text.trim();
        boolean same=compareStrings(custom,builtIn);
        System.out.println("Custom trim: '"+custom+"'");
        System.out.println("Built-in trim: '"+builtIn+"'");
        System.out.println("Are both trims same? "+same);
    }
    static int[] getTrimPositions(String str){
        int start=0,end=str.length()-1;
        while(start<=end && str.charAt(start)==' ') start++;
        while(end>=start && str.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    static String substringCustom(String str,int start,int end){
        String res="";
        for(int i=start;i<=end;i++) res+=str.charAt(i);
        return res;
    }
    static boolean compareStrings(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
}
