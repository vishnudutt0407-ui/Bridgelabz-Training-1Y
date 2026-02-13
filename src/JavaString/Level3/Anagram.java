package JavaString.Level3;
import java.util.Scanner;
class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first text:");
        String text1=sc.nextLine();
        System.out.println("Enter second text:");
        String text2=sc.nextLine();
        if(isAnagram(text1,text2)) System.out.println("Texts are anagrams");
        else System.out.println("Texts are not anagrams");
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        for(int i=0;i<256;i++) if(freq1[i]!=freq2[i]) return false;
        return true;
    }
}
