package loc0906;

import java.util.Scanner;

public class CLASS3 {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);

        System.out.println("첫 번쨰 정수를 입력하세요 :");
        int firstNumber=scanner.nextInt();

        System.out.print("두 번쨰 정수를 입력하세요:");
        int secondNumber=scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("두 값의 합은"+ sum + "입니다.");

    }
}
