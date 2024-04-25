package chapter10;

public class Formatting {
    public static void main(String[] args) {
        //formatting numbers to use commas
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
    }
}
