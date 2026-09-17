package day_7;
import java.util.Scanner;

public class Q10 {
    static void conversion(double a){
        double fahrenheit = (a * 9/5) + 32;
        System.out.print(a + " degree Celsius is " + fahrenheit + " degree fahrenheit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double cel = sc.nextDouble();
        conversion(cel);
    }
}
