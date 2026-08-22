package day_3;

public class ch3_string_methods {
    static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        System.out.println(name.length());

        String lower = name.toLowerCase();
        System.out.println(lower.toLowerCase());

        String upper = name.toUpperCase();
        System.out.println(upper);

        String trim = "  Sudeep Sarkar  ";
        String newtrim = trim.trim();
        System.out.println(newtrim);
        System.out.println(trim);

        System.out.println(name.substring(2));
        System.out.println(name.substring(0,5));

        System.out.println(name.replace('r' , 'p'));
        System.out.println(name.replace("r" , "pp"));

        System.out.println(name.startsWith("ha"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf("H" , 3));
    }
}
