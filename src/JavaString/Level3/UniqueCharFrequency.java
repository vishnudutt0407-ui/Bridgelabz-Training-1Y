package JavaString.Level3;
import java.util.Scanner;
class UniqueCharFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();
        char[] unique=uniqueCharacters(text);
        String[][] result=frequency(text,unique);
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++)
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
    }
    static char[] uniqueCharacters(String s){
        char[] temp=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)){flag=false;break;}
            if(flag) temp[index++]=s.charAt(i);
        }
        char[] unique=new char[index];
        for(int i=0;i<index;i++) unique[i]=temp[i];
        return unique;
    }
    static String[][] frequency(String s,char[] unique){
        String[][] res=new String[unique.length][2];
        for(int i=0;i<unique.length;i++){
            int count=0;
            for(int j=0;j<s.length();j++) if(s.charAt(j)==unique[i]) count++;
            res[i][0]=Character.toString(unique[i]);
            res[i][1]=Integer.toString(count);
        }
        return res;
    }
}
