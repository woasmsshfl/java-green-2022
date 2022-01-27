package weathertest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LocalDate nowDate = LocalDate.now();
        // DateTimeFormatter dateTimeFormatter =
        // DateTimeFormatter.ofPattern("yyyyMMdd");
        // String nowDateString = nowDate.format(dateTimeFormatter);

        // LocalTime nowTime = LocalTime.now();
        // DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmm");
        // String nowTimeString = nowTime.format(dateTimeFormatter2);

        // char m1 = nowTimeString.charAt(2);
        // char m2 = nowTimeString.charAt(3);
        // String m1String = String.valueOf(m1);
        // String m2String = String.valueOf(m2);
        // String miniteString = m1String.concat(m2String);
        // int miniteInt = Integer.parseInt(miniteString);

        // System.out.println("현재 날짜 : " + nowDateString);
        // System.out.println("현재 시간 : " + nowTimeString);
        // System.out.println("현재 분단위 : " + miniteInt);

        // baseDate, obsrValue, category
        System.out.println("알고싶은 날짜를 8자리로 입력하세요.");
        System.out.println("예시 ) 20220126");
        String baseDate = sc.nextLine();

        System.out.println("알고싶은 시간을 30분 단위로 4자리를 입력하세요.");
        System.out.println("예시 ) 0800 0930 1130 1200");
        String baseTime = sc.nextLine();

        Map<String, String> weatherMap = DownloadWeather.getWeatherList(baseDate, baseTime);

        System.out.println("현재 온도는 " + weatherMap.get("T1H") + "도 입니다.");
    }

}
