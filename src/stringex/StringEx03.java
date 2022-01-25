package stringex;

public class StringEx03 {
    public static void main(String[] args) {
        String data = " 20";
        int temp = Integer.parseInt(data); // 공뱍20에서 공백부분은 숫자로 변환하다가 오류가 난다.
        // 숫자 형식의 오류이다.
        System.out.println(temp);
    }

}
