package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {

        InputStream in = System.in; // 단점 : 한글자씩 숫자로 받는다.
        InputStreamReader ir = new InputStreamReader(in); // 단점 : 고정된 길이를 받는다
        BufferedReader br = new BufferedReader(ir); // 장점 : 가변길이의 문자열을 받는다.
        // Buffer의 사이즈는 8192byte = 8Kbyte 이다.

        // 위의 코드와 동일한 1줄 코드.
        // BufferedReader reader = new BufferedReader(
        // new InputStreamReader(System.in)
        // );

        try {
            String line = br.readLine();
            System.out.println("받은 문자열 : " + line);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
