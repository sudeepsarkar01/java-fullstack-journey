package day_7;
import java.util.Scanner;

public class o7_recursion {
    static long factorial(long a){
        if(a == 0 || a == 1){
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
    static long factorial_iterative(long a){
        if(a == 0 || a == 1) {
            return 1;
        } else {
            long product = 1;
            for(int i = 1; i <= a; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextInt();

        System.out.print("The factorial of n is: " + factorial(n));
        System.out.println();
        System.out.print("The factorial of n is: " + factorial_iterative(n));
    }
}
// a function is called itself is called recursion.
// factorial of 5: 5 * 4 * 3 * 2 * 1
// factorial of n: n * (n - 1) * ...... * 1
// factorial of n: n * factorial(n - 1)
// factorial(0) = 1
// 5 * 24 = 120 = 5!
