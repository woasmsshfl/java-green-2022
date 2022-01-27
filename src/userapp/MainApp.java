package userapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            // conn은 ByteStream. 아직 방향을 정하지 않았다.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return; // 스택 종료
            }

            // 2. 프로그램 만들기
            // (1) 화면에 회원정보를 출력하겠다. fow문 사용.
            System.out.println(dto.getData().size()); // 19. 0~18
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("ID : " + dto.getData().get(i).getUsername());
                System.out.println("비밀번호 : " + dto.getData().get(i).getPassword());
                System.out.println("E-mail : " + dto.getData().get(i).getEmail());
                System.out.println("가입한 날짜" + dto.getData().get(i).getCreated());
                System.out.println("로그인 날짜" + dto.getData().get(i).getUpdated());
                System.out.println("====================");
            }

        } catch (Exception e) {
            System.out.println("오류가 발생했습니다.");
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 출력해준다.
        }
    }

}
