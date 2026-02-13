package JavaString.Level2;
import java.util.Scanner;
class Splitmethod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
        String[] builtIn=text.split(" ");
        String[] custom=splitCustom(text);
        boolean same=compareArrays(builtIn,custom);
        System.out.println("Built-in split:");
        for(String w:builtIn) System.out.println(w);
        System.out.println("Custom split:");
        for(String w:custom) System.out.println(w);
        System.out.println("Are both results same? "+same);
    }
    static int getLength(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);
                count++;
            }catch(Exception e){break;}
        }
        return count;
    }
    static String[] splitCustom(String str){
        int length=getLength(str);
        int wordCount=1;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' ') wordCount++;
        }
        int[] spaceIndexes=new int[wordCount-1];
        int idx=0;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){spaceIndexes[idx]=i; idx++;}
        }
        String[] words=new String[wordCount];
        int start=0;
        for(int i=0;i<wordCount;i++){
            int end=(i<wordCount-1)?spaceIndexes[i]:length;
            String word="";
            for(int j=start;j<end;j++) word+=str.charAt(j);
            words[i]=word;
            start=end+1;
        }
        return words;
    }
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
}
