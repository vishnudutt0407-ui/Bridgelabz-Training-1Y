package JavaString.Level3;
import java.util.Scanner;
class CharFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        String[][] result=frequency(text);
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++)
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
    }
    static String[][] frequency(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        int count=0;
        for(int i=0;i<256;i++) if(freq[i]>0) count++;
        String[][] res=new String[count][2];
        int index=0;
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                res[index][0]=Character.toString((char)i);
                res[index][1]=Integer.toString(freq[i]);
                index++;
            }
        }
        return res;
    }
}
