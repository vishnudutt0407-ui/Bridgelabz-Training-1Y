package src.methods.Level3;
import java.util.Scanner;
public class PerfectNumber {

    // Method to find sum of proper divisors of n
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumOfDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return n > 0 && sumOfDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return n > 0 && sumOfDivisors(n) < n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect number: " + isPerfect(num));
        System.out.println("Abundant number: " + isAbundant(num));
        System.out.println("Deficient number: " + isDeficient(num));
        System.out.println("Strong number: " + isStrong(num));
    }
}
