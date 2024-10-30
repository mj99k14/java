package special_lecture;

import java.util.Scanner;

public class loc1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 나이 입력
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("잘못된 입력 값 입니다");
            return;
        }

        // 이용권 판별 후 출력
        String grade = "";
        if (age <= 12) {
            grade = "어린이";
        } else if (age <= 18) {
            grade = "청소년";
        } else {
            grade = "성인";
        }

        System.out.println(grade + " 이용권을 사용할 수 있습니다.");

        sc.close();
    }
}
