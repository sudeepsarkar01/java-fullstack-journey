package practice_Questions;
import java.util.Scanner;

public class practice_Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temp: ");
        float temp = sc.nextFloat();

        float Fahrenheit = (temp * 9 / 5) + 32;
        System.out.println("celsius to fahrenheit is: " + Fahrenheit);
    }
}
