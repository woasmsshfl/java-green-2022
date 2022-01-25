package ex20;

import java.util.Random;

// 패키지 Random class
public class PackageEx02 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(65)); // 5회 랜덤 뽑기

        }

    }

}
