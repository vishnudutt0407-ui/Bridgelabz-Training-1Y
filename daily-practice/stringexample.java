import java.util.Scanner;
public class stringexample{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = "java Programming";
// length()
System.out.println(s.length());
// top uppercase()
System.out.println(s.toUpperCase());
//toLowerCase
System.out.println(s.toLowerCase());
//charAt()
System.out.println(s.charAt(5));
//substring()
System.out.println(s.substring(5));
System.out.println(s.substring(0,4));
//contains()
System.out.println(s.contains("java"));
//equals()
System.out.println(s.equals("java Programming"));

}
} 