package day_9;

class company {
    String name;
    int salary;
    int id;

    public company() {
        name = "Raghu";
        salary = 13483492;
        id = 876;
    }

    public company(String My_name, int My_salary, int My_id) {
        name = My_name;
        salary = My_salary;
        id = My_id;
    }
}
public class o2_constructors_and_overloading {
    public static void main(String[] args) {

        company manager = new company();
        System.out.printf(
                "MY name is: %s%nMy salary is: %d%nMy id is: %d%n",
                manager.name, manager.salary, manager.id
        );
        System.out.println();

        company e = new company("Rajesh", 85000, 3058);
        System.out.printf(
                "MY name is: %s%nMy salary is: %d%nMy id is: %d%n",
                e.name, e.salary, e.id
        );
        System.out.println();

        company f = new company("Mia", 99000, 1000);
        System.out.printf(
                "MY name is: %s%nMy salary is: %d%nMy id is: %d%n",
                f.name, f.salary, f.id
        );
    }
}
