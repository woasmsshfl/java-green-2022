package data01;

// lombok 라이브러리는 디버깅이 아닌 런타임때 실행되서 만들어준다.
import lombok.AllArgsConstructor; // 모든 생성자를 만든다.
import lombok.Getter; // 자동으로 Getter를 만들어주는 lombok 라이브러리
import lombok.Setter; // 자동으로 Setter를 만들어주는 lombok 라이브러리

@AllArgsConstructor
@Getter
@Setter
class 사자 {
    private String name;
    private String color;
}

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        // s.setName("사자");
        System.out.println(s.getName());
    }
}
