package stringex.practice;

public class test08 {
    public static void main(String[] args) {
        String str = "AB CD";
        String replaceAll = str.replaceAll("\\p{Space}", "*"); //
        System.out.println("replaceAll: " + replaceAll);
    }

}
