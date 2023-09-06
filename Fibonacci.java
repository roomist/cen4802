/**
 * The FibonacciCalculator class provides a static method for calculating the nth term of the Fibonacci sequence.
 */

public class Fibonacci {

    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int nthTerm = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}