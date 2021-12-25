package Problem9;

// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
// a^2 + b^2 = c^2
// For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; ++i) {
            for (int j = i + 1; j < 1000; ++j) {
                for (int k = j + 1; k < 1000; ++k) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && Math.cbrt(i + j + k) == 10) {
                        System.out.println(i * j * k);
                        break;
                    }
                }
            }
        }

    }
}

