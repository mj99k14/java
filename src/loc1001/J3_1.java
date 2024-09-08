                                                                                                                                                                     import java.util.Scanner;

public class J3_1 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            System.out.print("예약하려는 이벤트 코드를 입력하세요: ");
            String code = sc.next();
            System.out.print("원하는 예약 날짜를 입력하세요: ");
            int date = sc.nextInt();

            // 코드가 E1, E2, E3가 아닌 경우 프로그램 종료
            if (!code.equals("E1") && !code.equals("E2") && !code.equals("E3")) {
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
            } else if (code.equals("E1")) {
                // E1 코드일 때 나이 확인
                if (age >= 18) {
                    System.out.println("예약이 가능합니다.");
                } else {
                    System.out.println("나이 제한으로 인해 예약할 수 없습니다.");
                }
            } else if (code.equals("E2")) {
                // E2 코드일 때 날짜가 짝수인지 확인
                if (date % 2 == 0) {
                    System.out.println("선택하신 날짜에 예약이 완료되었습니다.");
                } else {
                    System.out.println("선택하신 날짜에는 예약할 수 없습니다.");
                }
            } else if (code.equals("E3")) {
                // E3 코드일 때 나이와 날짜 조건 확인
                if (age >= 16 && date % 7 == 0) {
                    System.out.println("예약이 완료되었습니다!");
                } else {
                    if (age < 16) {
                        System.out.println("나이 제한으로 인해 예약할 수 없습니다.");
                    } else if (date % 7 != 0) {
                        System.out.println("선택하신 날짜에는 예약할 수 없습니다.");
                    }
                }
            }
        }
    }
}
