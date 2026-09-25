package day_8;

class Employee{
    int id;
    String name;
    public void details(){
        System.out.print("My id is: " + id + "\n");
        System.out.print("My name is: " + name + "\n");
        System.out.println();
    }
}

class Driver{
    int d_id;
    String d_name;
    public void d_details(){
        System.out.print("My id is: " + d_id + "\n");
        System.out.print("My name is: " + d_name + "\n");
        System.out.println();
    }
}
public class oop_custom_class {
    public static void main(String[] args) {
        System.out.println("Creating custom class: ");

        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Sudeep";
        Employee e2 =  new Employee();
        e2.id = 102;
        e2.name = "Bittu";
        Employee e3 =  new Employee();
        e3.id = 103;
        e3.name = "Samay";

        e1.details();
        e2.details();
        e3.details();

        System.out.println("Drivers details: ");
        Driver d1 = new Driver();
        d1.d_id = 201;
        d1.d_name = "Sunil";
        Driver d2 = new Driver();
        d2.d_id = 202;
        d2.d_name = "Sahil";

        d1.d_details();
        d2.d_details();
    }
}
