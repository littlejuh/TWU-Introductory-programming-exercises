import java.security.InvalidParameterException;
import java.util.ArrayList;

public class PrimeFactor {

    public static int[] generate(int n){
        if (n <= 0) {
            throw new InvalidParameterException();
        }
        ArrayList<Integer> primeDivisors = new ArrayList<>();
        if(isPrime(n)){
            primeDivisors.add(n);
        }
        else{
            int lastPrimeFound = 0;
            int prime = 2;
            while(n > 1){
                if(n%prime == 0){
                    n = n/prime;
                    if(prime != lastPrimeFound){
                        lastPrimeFound = prime;
                        primeDivisors.add(prime);
                    }
                }else{
                    prime = nextPrime(prime);
                }
            }
        }
        return buildIntArray(primeDivisors);
    }

    private static int[] buildIntArray(ArrayList<Integer> integers) {
        int[] ints = new int[integers.size()];
        int i = 0;
        for (Integer n : integers) {
            ints[i++] = n;
        }
        return ints;
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        int limit = (int) Math.sqrt(n) + 1;
        if (n % 2 == 0 && n != 2 || n < 2) {
            isPrime = false;
        } else {
            for (int i = 3; i < limit; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    i = limit;
                }
            }
        }
        return isPrime;
    }

    private static int nextPrime(int n){
        int number = n + 1;
        while(!isPrime(number)){
            number++;
        }
        return number;
    }
}
