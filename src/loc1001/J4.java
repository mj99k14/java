package loc1001;

import java.util.Scanner;

public class J4 {

    // 자본금 계산 메서드
    public static float calculateCapital(int cash, int purchase_price, int number) {
        return cash - (purchase_price * number); // 자본금 계산 후 반환
    }

    // 예상 이익 계산 메서드
    public static float calculateExpectations(int purchase_price, int number, int price_sold) {
        return (price_sold * number) - (purchase_price * number); // 예상 이익 계산 후 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("초기 자본금을 입력하세요: ");
        int cash = sc.nextInt();

        System.out.print("주식 가격을 입력하세요: ");
        int purchase_price = sc.nextInt();

        System.out.print("구매할 주식 수를 입력하세요: ");
        int number = sc.nextInt();

        System.out.print("판매할 때의 주식 가격을 입력하세요: ");
        int price_sold = sc.nextInt();

        // 자본금 계산 메서드 호출
        float capital = calculateCapital(cash, purchase_price, number);

        // 예상 이익 계산 메서드 호출
        float expectations = calculateExpectations(purchase_price, number, price_sold);

        // 결과 출력
        System.out.printf("구매 후 남은 자본금: %.2f\n", capital);
        System.out.printf("예상 이익: %.2f\n", expectations);

        // 이익인지 손실인지 판단하여 출력
        if (expectations > 0) {
            System.out.println("예상되는 이익입니다.");
        } else if (expectations < 0) {
            System.out.println("예상되는 손실입니다.");
        } else {
            System.out.println("이익도 손실도 없습니다.");
        }

        sc.close(); // Scanner 닫기
    }
}
