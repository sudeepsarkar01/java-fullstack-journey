public class ch3_Q4 {
    static void main(String[] args) {
        String letter = "Dear <|name|>, Thank a lot.";
        System.out.println(letter.replace("<|name|>" , "Sudeep"));
    }
}
