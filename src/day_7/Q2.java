package day_7;
import java.util.Scanner;

public class Q2 {
    static String yourname(String name){
        if(name.equalsIgnoreCase("sudeep")){
            return "Wel come sudeep";
        } else {
            return "You are not sudeep";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String result = yourname(name);
        System.out.println(result);
    }
}
