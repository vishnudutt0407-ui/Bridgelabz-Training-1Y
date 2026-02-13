package JavaString.Level1;
    import java.util.Scanner;
    class Substring{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String text = sc.next();
            System.out.println("Enter start index:");
            int start = sc.nextInt();
            System.out.println("Enter end index:");
            int end = sc.nextInt();
            String substring1 = getSubstringUsingCharAt(text, start, end);
            String substring2 = text.substring(start, end);
            boolean result = compareStrings(substring1, substring2);
            System.out.println( substring1);
            System.out.println(substring2);
            if (result) {
                System.out.println("Both substrings are same");
            } else {
                System.out.println("Both substrings are different");
            }
        }

        static String getSubstringUsingCharAt(String str, int start, int end) {
            String sub = "";
            for (int i = start; i < end; i++) {
                sub = sub + str.charAt(i);
            }
            return sub;
        }

        static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }


