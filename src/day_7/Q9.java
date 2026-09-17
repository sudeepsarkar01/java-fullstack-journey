package day_7;
import java.util.Scanner;

public class Q9 {
    static void avg(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        double average = (double) sum / num.length;
        System.out.print("The average of th numbers is: " + average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter number_" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        avg(numbers);
    }
}
