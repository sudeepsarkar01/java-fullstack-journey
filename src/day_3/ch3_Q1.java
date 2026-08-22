package day_3;

import java.util.Scanner;

public class ch3_Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String lower_name = name.toLowerCase();
        System.out.println(lower_name);
    }
}
