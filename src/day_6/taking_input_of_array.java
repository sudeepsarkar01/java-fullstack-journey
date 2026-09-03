package day_6;
import java.util.Scanner;

public class taking_input_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for(int i = 0; i < num.length; i++){
            System.out.print("Enter number_" + (i +1) + ": ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            System.out.print(" ");
        }
    }
}
