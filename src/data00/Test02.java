package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.AirportDto.Response.Body.Items.Item;

// 공항목록조회
public class Test02 {
    public static void main(String[] args) {
        try { // 2. try, catch 생성
            URL url = new URL( // 1. URL (json으로 변경 : 주소 끝에 _type=json 입력) // ByteStream을 연결할 대상
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            // 3.conn -> Byte Stream 선
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 4. utf-8 적용. 3Byte로 사이즈를 바꿔서 한글 깨짐 방지.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            // 5. ByteStream - Json
            String responseJson = br.readLine();
            // 6. Gson 라이브러리
            Gson gson = new Gson();
            // 7. AirportDto 호출
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);
            // 8. 호출하기 편하도록 result에 담기
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            // 9. 결과값(result) 출력
            // System.out.println(result);

            // 최종적으로 해야 할 것!!
            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
            System.out.println(airportMap.get("제주"));

        } catch (Exception e) { // 위가 잘못되었을 경우 실행함
            System.out.println("주소가 잘못되었습니다.");
        }
    }
}
