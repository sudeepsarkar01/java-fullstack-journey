package day_7;
import java.util.Scanner;

public class Q3 {
    static void multiplication_table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        multiplication_table(a);
    }
}
