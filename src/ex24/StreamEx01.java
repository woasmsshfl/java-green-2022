package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        // 단점 1. 1글자만 받을수 있다.
        // 단점 2. 문자로 변환도 되지 않는다.
        InputStream s = System.in;
        try {
            int n = s.read(); // 키보드 선에 접근해서 읽어서 n에 넣어라!
            System.out.println(n); // A를 입력하면 해당 아스키코드에 맞는 10진수 숫자로 변환되서 출력된다. = 65
            System.out.println((char) n); // A를 입력하면 해당 아스키코드가 자동 캐스팅된다. = A(묵시적 형변환)
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace(); // int n = s.read();에서 실패했을때 해당 함수를 진행하지 않고 여기서 대응한다.
            System.out.println("에러");
        }
    }

}
