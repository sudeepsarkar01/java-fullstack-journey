package day_6;

public class print_array_in_reverse {
    public static void main(String[] args) {
        int[] marks = {23, 45, 76, 87, 98};
        for (int i = marks.length - 1; i >= 0; i--){
            System.out.println(marks[i]);
        }
    }
}
