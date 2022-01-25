package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import data00.Response.Body.Items.Item;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL( // ByteStream을 연결할 대상
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");

            // conn -> Byte Stream 선
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    // utf-8 -> 한글을 3Byte로 끊어 읽겠다.
                    // default는 한글을 1Byte로 읽기 때문에 한글이 깨진다.
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine(); // readLine() : ByteStream 을 Json으로.
            Gson gson = new Gson(); // Gson 라이브러리
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }
    }
}
