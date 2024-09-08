package loc0924;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    System.out.printf("[%d,%d]", i, j);
                } else {
                    System.out.printf("%8c", ' ');
                }
            }
            // 바깥쪽 for 루프가 끝날 때마다 줄바꿈을 해준다.
            System.out.println();
        }
    }
}
