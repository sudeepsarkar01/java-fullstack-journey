package day_6;

public class day_6_Q1 {
    public static void main(String[] args) {
        float[] num = {25.6f, 65.9f, 34.5f, 87.9f, 98.3f};
        float sum = 0;
        for(float element: num){
            sum = sum + element;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
