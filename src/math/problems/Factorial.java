package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);


        System.out.println(" Find a Factorial of a given number using Iteration Method ");
        System.out.println("enter an integer");
        number = sc.nextInt();
        iterationFactorial(number);
        System.out.println("The factorial of" + " " + number + " " + "is" + " " + Factorial.iterationFactorial(number));
        //find Factorial of a given number using Recursion
        System.out.println("\n" + " Find a Factorial of a given number using a Recursion Method ");
        System.out.println("enter an integer");
        number = sc.nextInt();
        recursionFactorial(number);
        System.out.println("The factorial of" + " " + number + " " + "is" + " " + Factorial.recursionFactorial(number));

    }
    public static long recursionFactorial(long n) {
        if (n == 1) {
            return 1;

        } else {
            return n * recursionFactorial(n - 1);
        }
    }

    public static long iterationFactorial(long n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}


