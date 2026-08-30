package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        long balance = sc.nextInt();
        System.out.print("Entre withdrawal amount: ");
        long amount = sc.nextInt();
        if (amount <= balance && amount % 100 == 0 && amount > 0) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal not Successful");
        }
        long remain = balance - amount;
        System.out.println("The remain balance is: " + remain);
    }
}
