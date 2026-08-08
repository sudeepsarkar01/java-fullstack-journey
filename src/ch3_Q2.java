import java.util.Scanner;

public class ch3_Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write anything about yourself: ");
        String bio = sc.nextLine();
        String replace_bio = bio.replace(' ', '_');
        System.out.println(replace_bio);
    }
}
