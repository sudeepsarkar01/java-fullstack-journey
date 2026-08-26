package day_4;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String rock = "rock";
        String paper = "paper";
        String scissor = "scissor";
        System.out.print("Enter a number between 1-3: ");
        int you = sc.nextInt();
        int computer = random.nextInt(3) + 1;
        System.out.println("Computer chosen number: " + computer);

        if (you == 1) {
            System.out.println("you entered: " + rock);
        } else if (you == 2){
            System.out.println("you entered: " + paper);
        } else if (you == 3) {
            System.out.println("you entered: " + scissor);
        }
        if (computer == 1) {
            System.out.println("computer entered: " + rock);
        } else if (computer == 2) {
            System.out.println("computer entered: " + paper);
        } else {
            System.out.println("computer entered: " + scissor);
        }

        if (computer == 1 && you == 2) {
            System.out.println("you win");
        } else if (computer == 1 && you == 3) {
            System.out.println("computer win");
        } else if (computer ==1 && you == 1) {
            System.out.println("Tie");
        } else if (computer == 2 && you == 1) {
            System.out.println("computer win");
        } else if (computer == 2 && you == 2) {
            System.out.println("Tie");
        } else if (computer == 2 && you == 3) {
            System.out.println("you win");
        } else if (computer == 3 && you == 1) {
            System.out.println("you win");
        } else if (computer == 3 && you == 2) {
            System.out.println("computer win");
        } else if (computer == 3 && you == 3) {
            System.out.println("Tie");
        }
    }
}
