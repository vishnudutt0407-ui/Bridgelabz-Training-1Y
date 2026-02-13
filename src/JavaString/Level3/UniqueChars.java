package JavaString.Level3;
import java.util.Scanner;
class UniqueChars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        int len=findLength(text);
        char[] unique=findUnique(text,len);
        System.out.print("Unique characters: ");
        for(char c:unique) if(c!='\0') System.out.print(c+" ");
    }
    static int findLength(String s){
        int i=0;
        while(true){
            try{s.charAt(i);i++;}catch(Exception e){break;}
        }
        return i;
    }
    static char[] findUnique(String s,int len){
        char[] temp=new char[len];
        int index=0;
        for(int i=0;i<len;i++){
            boolean flag=true;
            for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)){flag=false;break;}
            if(flag) temp[index++]=s.charAt(i);
        }
        return temp;
    }
}
