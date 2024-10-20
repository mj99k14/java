package loc1017;

// import 구문을 클래스 외부에 배치
import java.util.Scanner;

public class test3 {

    static void gugudan() {
        for (int dan = 2; dan <= 9; dan++) {
            for (int num = 1; num <= 9; num++) {
                System.out.println(dan + "*" + num + "=" + num * dan);
            }
            System.out.println();
        }
    }

    static void aToZ() {
        for (char startChar = 'a'; startChar <= 'z'; startChar++) {
            System.out.print(startChar);
        }
        System.out.println();
    }

    static void matrix() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0;  col < 32; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 사용자로부터 정수를 입력
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        // if문
        if (inputValue == 1) {
            gugudan();
        } else if (inputValue == 2) {
            aToZ();
        } else if (inputValue == 3) {
            matrix();
        }

        // switch문
        switch (inputValue) {
            case 1:
                gugudan();
                break;
            case 2:
                aToZ();
                break;
            case 3:
                matrix();
                break;
        }
    }
}
