package day_7;
import java.util.Scanner;

public class Q1 {
    static int num(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter another number: ");
        int y = sc.nextInt();

        int result = num(x, y);
        System.out.print("The sum is: " + result);
    }
}
