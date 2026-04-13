
import java.util.Scanner;

public class Main {

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Even or Odd
    public static String evenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Prime Number
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition & Multiplication
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        // Even or Odd
        System.out.print("Enter number to check Even/Odd: ");
        int eo = sc.nextInt();
        System.out.println("Result: " + evenOdd(eo));

        // Factorial
        System.out.print("Enter number for Factorial: ");
        int f = sc.nextInt();
        System.out.println("Factorial: " + factorial(f));

        // Prime
        System.out.print("Enter number to check Prime: ");
        int p = sc.nextInt();
        if (isPrime(p)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
