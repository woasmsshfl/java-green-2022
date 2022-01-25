package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner 만들어보기!
// Scanner도 결국 Stream, StreamReader, Buffer로 만들어졌기 때문에 어떤 구조인지 알고 있어야 한다!
class MyScanner {
    // 컴포지션
    InputStream in;
    InputStreamReader ir;
    BufferedReader br;

    MyScanner(InputStream in) {
        this.in = in;
        this.ir = new InputStreamReader(in);
        this.br = new BufferedReader(ir);
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }
}

public class StreamEx04 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // System.out.println(line);
        MyScanner sc = new MyScanner(System.in);
        try {
            String line = sc.readLine();
            System.out.println("받은 문자열 : " + line);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
