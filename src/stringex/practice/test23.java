package stringex.practice;

public class test23 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 0; i < 10; i++) {
            String strNum = String.format("%010d", num); // num(1)부터 출력하되 빈공간은 10진수 0으로 채워서 출력한다.
            System.out.println(strNum);
            num++; // num의 값을 반복할 때마다 1씩 더한다. 10번동안.
        }
    }

}
