package day_6;

public class multidimentional_array {
    public static void main(String[] args) {
        int[][] mark = new int[3][3];
        mark[0][0] = 100;
        mark[0][1] = 101;
        mark[0][2] = 102;

        mark[1][0] = 103;
        mark[1][1] = 104;
        mark[1][2] = 105;

        mark[2][0] = 106;
        mark[2][1] = 107;
        mark[2][2] = 108;
        System.out.println(mark[1][0]);
        System.out.println(mark[1][1]);
        System.out.println(mark[1][2]);
        System.out.println("access all the elements using for loop: ");

        for (int i = 0; i < mark.length; i++){
            for (int j = 0; j < mark[i].length; j++){
                System.out.print(mark[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
