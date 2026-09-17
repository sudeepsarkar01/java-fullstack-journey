package day_7;
import java.util.Scanner;

public class Q8 {
    static void fibonacci_recursion(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.print(a + " ");
        fibonacci_recursion(b , a + b, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        fibonacci_recursion(0, 1, num);
    }
}
