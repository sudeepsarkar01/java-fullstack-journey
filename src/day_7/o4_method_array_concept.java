package day_7;

public class o4_method_array_concept {
    static void change(int[] arr){
        arr[0] = 83;
    }
    public static void main(String[] args) {
        int[] marks = {43, 65, 87, 76, 98, 86};
        change(marks);
        System.out.print("The changed mark is: " + marks[0]);
        System.out.println();
        for(int elements: marks){
            System.out.print(elements + " ");
        }
    }
}
