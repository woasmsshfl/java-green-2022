package stringex.practice;

public class test24 {
    public static void main(String[] args) {
        int i = 123456789;

        System.out.println(String.format("%,d_", i)); // 해당값을 10진수로 3자리씩 끊어 ,를 넣어서 출력하고 끝에 _를 넣는다.
        System.out.println(String.format("%,15d_", i)); // 해당값을 10진수 15자리까지 출력하고 3자리씩 끊어 ,를 넣고 빈자리는 앞으로 넣고, 끝에 _를 넣는다.
        System.out.println(String.format("%,-15d_", i)); // 해당값을 10진수 15자리까지 출력하고 3자리씩 끊어 ,를 넣고 빈자리는 뒤로 넣고, 끝에 _를 넣는다.
        System.out.println(String.format("%,015d_", i)); // 해당값을 10진수 15자리까지 출력하고 3자리씩 끊어 ,를 넣고 빈자리는 0을 넣고 끝에 _를 넣는다.
    }
}
