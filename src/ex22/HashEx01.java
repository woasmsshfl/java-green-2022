package ex22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashEx01 {
    public static void main(String[] args) {
        // 1. 순차적으로 데이터를 저장하고 싶을 때
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1); // toString() 메서드가 호출됨.

        // 2. 데이터의 중복을 피하고 싶을 때
        Set<String> arr2 = new HashSet<>();
        arr2.add("안녕1");
        arr2.add("안녕2");
        arr2.add("안녕2"); // 중복된 내용이라 출력하지 않는다.
        System.out.println(arr2);

        // 3. 키값으로 데이터를 검색하고 싶을 때
        Map<String, String> arr3 = new HashMap<>();
        arr3.put("name", "황재민");
        arr3.put("gender", "남");
        arr3.put("phone", "0103333");
        System.out.println(arr3.get("name")); // name이라는 키값에 들어있는 데이터 불러오기
        System.out.println(arr3.get("phone")); // phone이라는 키값에 들어있는 데이터 불러오기
        System.out.println(arr1.get(1)); // arr1의 1번지 데이터 출력 = 2
        System.out.println(arr3.containsKey("name")); // name 이란 키 값이 있는가? true
        System.out.println(arr3.containsValue("남")); // 남 이란 밸류값이 있는가? true
        System.out.println(arr3);
    }

}
