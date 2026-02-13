package JavaString.Level1;
    import java.util.Scanner;
    class ComplexLowercaseDemo{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter text:");
            String text=sc.nextLine();
            String builtIn=text.toLowerCase();
            String converted=toLowerCustom(text);
            boolean same=compareStrings(builtIn,converted);
            System.out.println("Built-in lowercase: "+builtIn);
            System.out.println("Custom lowercase: "+converted);
            System.out.println("Are both results same? "+same);
        }
        static String toLowerCustom(String str){
            String result="";
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch>='A' && ch<='Z'){
                    ch=(char)(ch+32);
                }
                result+=ch;
            }
            return result;
        }
        static boolean compareStrings(String s1,String s2){
            if(s1.length()!=s2.length()) return false;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)) return false;
            }
            return true;
        }
    }


