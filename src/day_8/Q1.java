package day_8;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
}
public class Q1 {
    public static void main(String[] args){
        Employee1 e1 = new Employee1();
        e1.setName("sudeep sarkar");
        e1.salary = 23000;
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
