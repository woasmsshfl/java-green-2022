package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        // 단점 1. 고정된 길이의 문자만 받을 수 있어서 통신에 매우 비효율적이다.
        // 한자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다.(오토캐스팅)
        InputStreamReader ir = new InputStreamReader(in);

        char[] data = new char[3]; // 문자가 되었기 때문에 배열을 사용한다.
        // 통신에서 비효율적이라서 아예 안쓴다.!!!!!!!!!!
        try {
            ir.read(data); // 배열을 3자리를 줬기 때문에 4자리 이상 입력해도 3자리만 출력해준다.
            System.out.println(data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
