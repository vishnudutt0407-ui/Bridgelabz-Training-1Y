package JavaString.Level1;
import java.util.Scanner;
class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean same = true;
        if (s1.length() != s2.length()) {
            same = false;
        }
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }
        boolean Result = s1.equals(s2);
        if (same == Result) {
            System.out.println("Both results are same");
        } else {
            System.out.println("Results are different");
        }
    }
}
