package practice_Questions;
import java.util.Scanner;

public class practice_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = sc.nextFloat();

        float area = length * breadth;
        float perimeter = 2 * (length * breadth);

        System.out.println("Area is " + area);
        System.out.println("Perimeter " + perimeter);
    }
}
