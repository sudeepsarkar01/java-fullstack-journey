package day_6;

public class day_6_Q8 {
    public static void main(String[] args) {
        int num[] = {23, 34, 99, 56, 67};
        boolean sorted = true;
        for(int i = 0; i < num.length - 1; i++){
            if(num[i] > num[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
