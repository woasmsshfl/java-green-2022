package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // 모든 생성자를 만들어주는 라이브러리
@Data // Getter, Setter, toString 이 모두 포함된 라이브러리
public class ResponseDto {
    private Response response; // 변수명을 꼭 동일하게 해야한다!

}

@AllArgsConstructor
@Data
class Response {
    private Header header;
    private Body body;

    @AllArgsConstructor
    @Data
    class Header { // 내부클래스.
        private String resultCode;
        private String resultMsg;
    }

    @AllArgsConstructor
    @Data
    class Body {
        private Items items;
        private int numOfRows;
        private int pageNo;
        private int totalCount;

        @AllArgsConstructor
        @Data
        class Items {
            private List<Item> item; // Item class가 배열로 되어있기 때문에 List를 사용해준다.

            @AllArgsConstructor
            @Data
            class Item { // 연산이 필요없다면 String 타입을 써도 된다.! String은 무적!
                private String airlineNm;
                private String arrAirportNm;
                private String arrPlandTime;
                private String depAirportNm;
                private String depPlandTime;
                private int economyCharge;
                private int prestigeCharge;
                private String vihicleId;
            }
        }
    }
}
