public class Primes {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        int prime = 2;
        while (prime * prime <= num) {
            if (isPrime[prime]) {
                int multiple = prime * 2;
                while (multiple <= num) {
                    isPrime[multiple] = false;
                    multiple += prime;
                }
            }
            prime++;
        }

        System.out.println("Prime numbers up to " + num + ":");
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        double percent = ((double) count / num) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n",
        count, num, percent);
    
    }
}