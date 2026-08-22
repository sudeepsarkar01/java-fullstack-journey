package day_3;

import java.util.Scanner;

public class ch3_Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write anything: ");
        String bio = sc.nextLine();
        if (bio.contains("  ")) {
            System.out.println("Double space detected.");
        } else if (bio.contains("   ")) {
            System.out.println("Triple space detected.");
        } else {
            System.out.println("NO double or triple spaces are detected.");
        }
    }
}
