package day_8;
import java.util.Scanner;

class employee{
    int id;
    String name;
    int age;
    public void details(){
        System.out.print("The id of the employee is: " + id + "\n");
        System.out.print("The name of the employee is: " + name + "\n");
        System.out.print("The age of the employee is: " + age + "\n");
        System.out.println();
    }
}
public class cs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employee e1 = new employee();
        System.out.print("Enter your id: ");
        int a = sc.nextInt();
        e1.id = a;
        sc.nextLine();

        System.out.print("Enter your name: ");
        String b = sc.nextLine();
        e1.name = b;

        System.out.print("Enter your age: ");
        int c = sc.nextInt();
        e1.age = c;
        System.out.println("Employee details is: ");

        e1.details();
    }
}
