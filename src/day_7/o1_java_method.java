package day_7;
import java.util.Scanner;

public class o1_java_method {
    int logic(int a, int b, int c){
        int total;
        if(a > b && a > c){
            int x = a + b + c;
            total  = (x / 2) * 100;
        } else if (b > a && b > c){
            int x = a - b - c;
            total = (x / 2) * 50;
        } else {
            int x = (a + b) - c;
            total = (x / 2) * 60;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[] = new int[3];
        System.out.println("Enter marks of first student:");
        for(int i = 0; i < 3; i++){
            System.out.print("Enter mark_" + (i + 1) + ": ");
            mark[i] = sc.nextInt();
        }
        int a = mark[0];
        int b = mark[1];
        int c = mark[2];
        int x;
        o1_java_method obj = new o1_java_method();
        x = obj.logic(a, b, c);
        System.out.print("Total is: " + x);
        System.out.println();

        System.out.println("Enter marks of second student:");
        for(int i = 0; i < 3; i++){
            System.out.print("Enter mark_" + (i + 1) + ": ");
            mark[i] = sc.nextInt();
        }
        int s = mark[0];
        int y = mark[1];
        int z = mark[2];
        int l;
        o1_java_method obj_1 = new o1_java_method();
        l = obj_1.logic(s, y, z);
        System.out.print("Total is: " + l);
    }
}
