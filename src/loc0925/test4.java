package loc0925;

public class test4 {
    public static void main(String[] args) {

        final int SIZE = 6;
        int freq[] = new int[SIZE];

        // 빈도를 계산하는 부분
        for (int i = 0; i < 10000;i++) {  // 여러 번 반복해서 난수 생성
            ++freq[(int) (Math.random() * SIZE)];
        }

        // 결과를 출력하는 부분
        System.out.println("-------------------");
        System.out.println("면        빈도");
        System.out.println("-------------------");

        for (int i = 0; i < SIZE; i++) {
            System.out.println(""+ (i+ 1) + "" + freq[i]);  // 주사위 면과 빈도 출력
        }
    }
}
