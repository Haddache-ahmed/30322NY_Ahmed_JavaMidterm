package math.problems;

public class PrimeNumber {
    public static boolean isPrimeNumber(int num) {
        int count = 0;//counting how many dividers
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count != 2) {
            return false;

        } else
            return true;
    }

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
            }
        }

    }}

