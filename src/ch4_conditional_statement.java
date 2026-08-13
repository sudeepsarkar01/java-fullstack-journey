import java.util.Scanner;

public class ch4_conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You can not drive.");
        }
    }
}
// ==, >=, <=, <, >,!= (relational operator)
// == (Assignment operator)