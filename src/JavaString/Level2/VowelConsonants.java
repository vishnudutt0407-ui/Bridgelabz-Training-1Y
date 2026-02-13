package JavaString.Level2;
import java.util.Scanner;
class VowelConsonants{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        int[] count=countVowelsConsonants(text);
        System.out.println("Vowels: "+count[0]);
        System.out.println("Consonants: "+count[1]);
    }
    static String checkChar(char ch){
        if(ch>='A' && ch<='Z') ch=(char)(ch+32);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
        else if(ch>='a' && ch<='z') return "Consonant";
        else return "NotALetter";
    }
    static int[] countVowelsConsonants(String str){
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            String res=checkChar(str.charAt(i));
            if(res.equals("Vowel")) vowels++;
            else if(res.equals("Consonant")) consonants++;
        }
        return new int[]{vowels,consonants};
    }
}
