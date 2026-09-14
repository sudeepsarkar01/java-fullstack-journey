package day_7;
import java.util.Scanner;

public class o2_non_static_method {
    String name;
    long roll_no;
    String Class;

    void student() {
        System.out.println("Name: " + name);
        System.out.println("roll_no: " + roll_no);
        System.out.println("Class: " + Class);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Enter Student 1 details---");
        o2_non_static_method std_1 = new o2_non_static_method();
        System.out.print("Enter your name: ");
        std_1.name =sc.nextLine();
        System.out.print("Enter your roll no.: ");
        std_1.roll_no = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your class: ");
        std_1.Class = sc.nextLine();
        System.out.println();

        System.out.println("---Enter Student 2 details---");
        o2_non_static_method std_2 = new o2_non_static_method();
        System.out.print("Enter your name: ");
        std_2.name =sc.nextLine();
        System.out.print("Enter your roll no.: ");
        std_2.roll_no = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your class: ");
        std_2.Class = sc.nextLine();
        System.out.println();

        System.out.println("---Student 1 details---");
        std_1.student();
        System.out.println("---Student 2 details---");
        std_2.student();
    }
}
