package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units of electricity used: ");
        float unit = sc.nextFloat();
        if (unit >= 1 && unit <= 100) {
            float bill = unit * 5;
            System.out.println("The bill is: " + bill);
        } else if (unit >= 101 && unit <= 200) {
            float bill = unit * 7;
            System.out.println("The bill is: " + bill);
        } else if (unit >= 201 && unit <= 300) {
            float bill = unit * 10;
            System.out.println("The bill is: " + bill);
        } else {
            float bill = unit * 15;
            System.out.println("The bill is: ₹" + bill);
        }
    }
}
