package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return;
            }

            System.out.println(dto.getData().size());
            dto.getData().get(dto.getData().size() - 1).setId(5000);
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("ID : " + dto.getData().get(i).getId());
                System.out.println("제목 : " + dto.getData().get(i).getTitle());
                System.out.println("내용 : " + dto.getData().get(i).getContent());
                System.out.println("==================================");
                System.out.println("E-mail : " + dto.getData().get(i).getData().getEmail());
                System.out.println("이름 : " + dto.getData().get(i).getData().getUsername());
                System.out.println("비밀번호 : " + dto.getData().get(i).getData().getPassword());
                System.out.println("가입한 날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("로그인 날짜 : " + dto.getData().get(i).getUpdated());
                System.out.println("==================================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
