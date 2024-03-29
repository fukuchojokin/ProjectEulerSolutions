package Problem2;

// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

public class EvenFibonacciNumbers {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int  x, sum = 0, i  = 2;
        while ((x = fibonacci(i++)) < 4000000) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
