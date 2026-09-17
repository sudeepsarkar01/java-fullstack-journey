package day_7;
import java.util.Scanner;

public class Q5 {
    static void sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.print("The sum is: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sum(n);
    }
}
