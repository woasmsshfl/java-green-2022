package ex20;

// 배열 예제2
// length 필드마다 별도의 length 필드가 있다.
// 행과 열을 표현.

public class ArrayEx02 {
    public static void main(String[] args) {
        int[][] array = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 }
        };

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.println(r + "행" + c + "열 : " + array[r][c]);
            }
        }
    }

}
