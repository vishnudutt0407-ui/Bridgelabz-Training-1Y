import java.util.Scanner;
public class stringbuilder{
public static void main (String[] args){
StringBuilder sb =new StringBuilder("hello");

sb.append("world");
System.out.println("append: " +sb);

sb.insert(5,",");
System.out.println("insert:" +sb);

sb.replace(6,11,"java");
System.out.println("replace:" +sb);

sb.delete(5,6);
System.out.println("delete:" +sb);

sb.reverse();
System.out.println("reverse:" +sb);



}
}