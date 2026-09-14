package day_6;

public class day_6_Q7 {
    public static void main(String[] args) {
        int num[] = {99, 87, 98, 54, 76, 19};
        int min = num[0];
        for(int element: num){
            if(min > element){
                min = element;
            }
        }
        System.out.println("The minimum element is: " + min);
    }
}
