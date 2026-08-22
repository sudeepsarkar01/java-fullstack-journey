package day_1;

import java.util.Scanner;

public class ch1_variable {
    public static void main(String[] args) {
        int num = 8;
        // int is data type and num is variable and 8 is value.
        byte x = 127;
        short s = 9862;
        float f = 3.5f;
        double d = 3.5;
        long l = 873823648233493742L;
        char c = 'g';
        String S = "jskhfgi";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The entered number is " + a);
    }
}
