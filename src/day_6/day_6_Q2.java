package day_6;
import java.util.Scanner;

public class day_6_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mark = {13, 45, 34, 67, 97};
        while(true){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            boolean isinarray = false;
            for (int element: mark) {
                if (num == element) {
                    isinarray = true;
                    break;
                }
            }
            if (isinarray) {
                System.out.println("The element is present in the array.");
                break;
            } else {
                System.out.println("The element is not present in the array.");
            }
        }
    }
}
