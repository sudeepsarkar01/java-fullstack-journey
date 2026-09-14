package day_7;

public class o5_method_overloading {
    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a);
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a);
        System.out.println("Good morning " + b);
    }

    public static void main(String[] args) {
        foo();
        foo(100);
        foo(200, 300);
    }
}
