package loc1001;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시도 횟수를 입력하세욤:");
        int tryn = sc.nextInt();
        for (int i = 0; i < tryn; i++) {
            System.out.print("사용자의 나이를 입력해주세요:");
            int age = sc.nextInt();
            if (age <=12) {
                System.out.println("어린이 이용권을 사용할수 있습니다.");
            } else if (13< age && age <= 18) {
                System.out.println("청소년 이용권을 사용할수 있습니다");

            }else{
                System.out.println("성인 이용권을 사용할 수 있습니다");
            }
        }
    }
}
