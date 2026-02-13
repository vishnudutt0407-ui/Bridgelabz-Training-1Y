package JavaString.Level3;
import java.util.Scanner;
class NestedChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        String[] result=frequency(text);
        System.out.println("Character : Frequency");
        for(int i=0;i<result.length;i++)
            if(result[i]!=null) System.out.println(result[i]);
    }
    static String[] frequency(String s){
        char[] ch=s.toCharArray();
        int n=ch.length;
        int[] freq=new int[n];
        for(int i=0;i<n;i++){
            if(ch[i]=='0') continue;
            freq[i]=1;
            for(int j=i+1;j<n;j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        String[] res=new String[n];
        for(int i=0;i<n;i++) if(ch[i]!='0') res[i]=ch[i]+" : "+freq[i];
        return res;
    }
}

