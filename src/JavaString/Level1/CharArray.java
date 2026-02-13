package JavaString.Level1;
    import java.util.Scanner;
    class CharArrayComparison {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String text = sc.next();
            char[] userMethodChars = getChars(text);
            char[] builtInChars = text.toCharArray();
            boolean result = compareCharArrays(userMethodChars, builtInChars);
            System.out.print("Characters using user-defined method: ");
            for (char c : userMethodChars) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Characters using toCharArray(): ");
            for (char c : builtInChars) {
                System.out.print(c + " ");
            }
            System.out.println();
            if (result) {
                System.out.println("Both arrays are same");
            } else {
                System.out.println("Both arrays are different");
            }
        }

        static char[] getChars(String str) {
            char[] arr = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }
            return arr;
        }

        static boolean compareCharArrays(char[] arr1, char[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }


