package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q03 {
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
