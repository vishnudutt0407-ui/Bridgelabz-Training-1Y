package JavaString.Level2;
import java.util.Scanner;
class ShortestLongestWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
        String[] words=splitCustom(text);
        String[][] wordLen=wordsWithLength(words);
        int[] minMax=findMinMax(wordLen);
        System.out.println("Words and lengths:");
        for(int i=0;i<wordLen.length;i++) System.out.println(wordLen[i][0]+"\t"+Integer.parseInt(wordLen[i][1]));
        System.out.println("Shortest word: "+words[minMax[0]]);
        System.out.println("Longest word: "+words[minMax[1]]);
    }
    static int getLength(String str){
        int c=0;while(true){try{str.charAt(c);c++;}catch(Exception e){break;}}return c;
    }
    static String[] splitCustom(String str){
        int len=getLength(str),wCount=1;for(int i=0;i<len;i++) if(str.charAt(i)==' ') wCount++;
        String[] words=new String[wCount];int idx=0;int start=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' '){String w="";for(int j=start;j<i;j++) w+=str.charAt(j);words[idx]=w;idx++;start=i+1;}}
        String w="";for(int j=start;j<len;j++) w+=str.charAt(j);words[idx]=w;
        return words;
    }
    static String[][] wordsWithLength(String[] words){
        String[][] arr=new String[words.length][2];
        for(int i=0;i<words.length;i++) arr[i][0]=words[i]; for(int i=0;i<words.length;i++) arr[i][1]=String.valueOf(getLength(words[i]));
        return arr;
    }
    static int[] findMinMax(String[][] arr){
        int min=0,max=0;
        for(int i=1;i<arr.length;i++){
            if(Integer.parseInt(arr[i][1])<Integer.parseInt(arr[min][1])) min=i;
            if(Integer.parseInt(arr[i][1])>Integer.parseInt(arr[max][1])) max=i;
        }
        return new int[]{min,max};
    }
}
