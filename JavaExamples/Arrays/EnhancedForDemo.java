public class EnhancedForDemo {
    public static void main(String[] args) {
        char[] primes = { 'a', 'b', 'c' };

        // Print the primes out without for/in loop
        for (int i = 0; i < primes.length ; i++) {
            System.out.println(primes[i]);
        }

        // Print the primes out using a for/in loop
        for (char n : primes) {
            System.out.println(n);
        }
    }
}
