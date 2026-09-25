package day_8;
import java.util.Scanner;

class Square {
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Square sq = new Square();
        System.out.print("Enter side of the square: ");
        int a = sc.nextInt();
        sq.side = a;

        System.out.print("The area is: " + sq.area() + "\n");
        System.out.print("The perimeter is: " + sq.perimeter());
    }
}
