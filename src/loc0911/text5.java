package loc0911;
import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        String month;

        Scanner scan = new Scanner(System.in);
        System.out.print("월의 이름을 입력하시오: ");
        month = scan.next();

        int monthNumber;
        switch (month.toLowerCase()) {  // 입력을 소문자로 변환하여 처리
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            default:
                monthNumber = 0;
                break;
        }

        System.out.println("월 번호: " + monthNumber);  // 결과 출력
    }
}
