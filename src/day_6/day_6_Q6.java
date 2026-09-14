package day_6;

public class day_6_Q6 {
    public static void main(String[] args) {
        int array[] = {23, 54, 67, 98, 12};
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The maximum element is: " + max);
        // By using for-each loop
        for(int element: array){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}
