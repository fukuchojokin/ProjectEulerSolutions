package Problem6;

// The sum of the squares of the first ten natural numbers is,
//          1^2 + 2^2 + 3^3 + .... 10^2 = 385
// The square of the sum of the first ten natural numbers is,
//          (1+2+3+.....10)^2 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDifference {
    static long sumOfSquares() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    static long squareOfSum() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return (long) Math.pow(sum, 2);
    }

    public static void main(String[] args) {
        System.out.println(squareOfSum() - sumOfSquares());
    }
}
