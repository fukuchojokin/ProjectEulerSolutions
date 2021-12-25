package Problem3;

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

public class LargestPrimeFactor {
    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long n = 600851475143L;
        for (long i = 2L; i < n; ++i) {
            if (n % i == 0) {
                if(isPrime((int)i)){
                    System.out.println(i);
                }
            }
        }
    }
}
