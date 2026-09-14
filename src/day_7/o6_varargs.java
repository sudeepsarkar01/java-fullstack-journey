package day_7;

public class o6_varargs {
    /*static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }*/
    static int sum(int x, int ...arr){
        int result = x;
        for(int elements: arr){
            result = result + elements;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Learn about varargs!");
        System.out.println("The sum of nothing is: " + sum(2));
        System.out.println("The sum of 2 and 3 is: " + sum(2, 3));
    }
}
