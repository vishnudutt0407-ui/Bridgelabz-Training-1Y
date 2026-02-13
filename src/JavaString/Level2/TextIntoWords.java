package JavaString.Level2;
import java.util.Scanner;
class TextIntoWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
        String[] words=new String[1];int count=0;String word="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){words[count]=word;count++;word="";String[] temp=new String[count+1];for(int j=0;j<count;j++) temp[j]=words[j];words=temp;}else word+=text.charAt(i);}
        words[count]=word;
        System.out.println("Word\tLength");
        for(int i=0;i<words.length;i++){
            int len=0;while(true){try{words[i].charAt(len);len++;}catch(Exception e){break;}}
            System.out.println(words[i]+"\t"+len);
        }
    }
}
