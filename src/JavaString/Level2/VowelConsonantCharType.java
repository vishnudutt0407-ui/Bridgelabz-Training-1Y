package JavaString.Level2;
import java.util.Scanner;
class VowelConsonantCharType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        String[][] result=analyzeText(text);
        displayTable(result);
    }
    static String checkChar(char ch){
        if(ch>='A' && ch<='Z') ch=(char)(ch+32);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
        else if(ch>='a' && ch<='z') return "Consonant";
        else return "Not a Letter";
    }
    static String[][] analyzeText(String str){
        int len=str.length();
        String[][] arr=new String[len][2];
        for(int i=0;i<len;i++){
            arr[i][0]=String.valueOf(str.charAt(i));
            arr[i][1]=checkChar(str.charAt(i));
        }
        return arr;
    }
    static void displayTable(String[][] arr){
        System.out.println("Character\tType");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
        }
    }
}
