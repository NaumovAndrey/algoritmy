package seminar;

import java.util.ArrayList;
import java.util.Arrays;

// Поиск простых чисел
public class PrimeNumbers {
    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        int col = 0;
        Arrays.fill(primes, true);
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                    col++;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                result.add(i);
            }
        }
        System.out.println(col);
        return result;
    }
}
