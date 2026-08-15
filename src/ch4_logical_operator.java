import java.util.Scanner;

public class ch4_logical_operator {
    public static void main(String[] args) {
        // logical operators are used to provide logics in java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        Scanner gs = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = gs.nextLine();
        if (age >= 18 && gender.equals("male")) {
            System.out.println("You can drive truck.");
        } else {
            System.out.println("You can't drive truck.");
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int ags = s.nextInt();
        Scanner g = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gndr = g.nextLine();
        if (age >= 18 || gender.equals("female") || gender.equals("male")) {
            System.out.println("You can drive car.");
        } else {
            System.out.println("You can't drive car.");
        }
    }
}
