package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto<T> {
    private T data;
    private Response response;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
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
            class Items<T> {
                private List<T> item;

                @AllArgsConstructor
                @Data
                class AirportDto {
                    private String airportId;
                    private String airportNm;
                }

                @AllArgsConstructor
                @Data
                class FlightDto {
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
}
