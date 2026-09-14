package day_6;
import java.util.Scanner;

public class day_6_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat_1[][] = new int[2][3];
        mat_1[0][0] = 12;
        mat_1[0][1] = 15;
        mat_1[0][2] = 56;

        mat_1[1][0] = 34;
        mat_1[1][1] = 24;
        mat_1[1][2] = 45;

        int mat_2[][] = new int[2][3];
        mat_2[0][0] = 76;
        mat_2[0][1] = 54;
        mat_2[0][2] = 87;

        mat_2[1][0] = 32;
        mat_2[1][1] = 43;
        mat_2[1][2] = 56;

        for(int i = 0; i < mat_1.length; i++){
            for(int j = 0; j < mat_2[i].length; j++){
                System.out.print(mat_1[i][j] + mat_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
