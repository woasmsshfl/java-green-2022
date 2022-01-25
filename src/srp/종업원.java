package srp;

// 종업원 - 요리사(의존성) 종업원이 요리사를 호출하는 관계.
public class 종업원 {

    public 음식 주문받기(요리사 chef) {
        음식 jjajang = chef.음식생성(); // 메시지 전달
        return jjajang; // null 아무것도 없음.
    }

}
