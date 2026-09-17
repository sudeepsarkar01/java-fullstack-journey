package day_7;
import java.util.Scanner;

public class Q4 {
    static void paten(char ch, int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a special character: ");
        char cr = sc.next().charAt(0);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        paten(cr, n);
    }
}