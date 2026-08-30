package day_5;

import java.util.Random;
import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int computer = random.nextInt(10) + 1;
        int guess;

        do {
            System.out.print("Guess a number (1-10): ");
            guess = sc.nextInt();

            if (guess == computer) {
                System.out.println("Correct! You won! 🎉");
            } else {
                System.out.println("Wrong guess, try again!");
            }

        } while (guess != computer);
    }
}
