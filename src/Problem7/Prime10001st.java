package Problem7;

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class Prime10001st {
    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 1, i = 2;
        while (count <= 10001) {
            if (isPrime(i)) {
                System.out.println(count + "\t:\t" + i);
                count++;
            }
            i++;
        }
    }
}
