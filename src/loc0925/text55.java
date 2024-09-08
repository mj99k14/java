package loc0925;

import java.util.Scanner;

public class text55 {
    public static void main(String[] args) {
        final int size = 10;
        int[] seats = new int[size];

        Scanner sc = new Scanner(System.in);

        while (true) {
            // 좌석 번호 출력
            System.out.println("------------------------");
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println("\n------------------------");

            // 좌석 상태 출력 (예약 여부)
            for (int i = 0; i < size; i++) {
                System.out.print(seats[i] + " ");
            }
            System.out.println("\n------------------------");

            // 좌석 번호 입력 받기
            System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1): ");
            int s = sc.nextInt();

            // 종료 조건
            if (s == -1) {
                System.out.println("예약 프로그램을 종료합니다.");
                break;
            }

            // 좌석 번호 범위 체크
            if (s < 1 || s > size) {
                System.out.println("잘못된 좌석 번호입니다. 다시 입력하세요.");
                continue;
            }

            // 예약 처리
            if (seats[s - 1] == 0) {
                seats[s - 1] = 1;
                System.out.println("예약되었습니다.");
            } else {
                System.out.println("이미 예약된 자리입니다.");
            }
        }

        sc.close();
    }
}
