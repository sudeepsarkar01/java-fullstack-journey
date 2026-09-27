package day_9;

class Employee {
    private int id;
    private String name;

    public void setid(int a){
        id = a;
    }
    public int getid(){
        return id;
    }

    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
}
public class o1_privet_access_modifier {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setid(645);
        System.out.println(e.getid());
        e.setname("sudeep");
        System.out.println(e.getname());
    }
}
