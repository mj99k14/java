package loc0905;

import java.util.Scanner;

public class comment {
    public static void main(String[] args) {

        //scanner  객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 출력한 구구단 입력을 요청
            System.out.print("출력할 구구단을 입력 하세요: ");
            int tableNumber = scanner.nextInt(); // 사용자가 입력한 값을 저장

        /*
        *입력된 숫자에 대해 구구단을 출력하는 반복문
        * *반복문은 1부터 9까지 순회하면서
        * 사용자가 입력한 숫자와 곱하여 결과를 출력

         */

            for (int multiplier = 1; multiplier <= 9; multiplier++){
                //입력된 숫자에 대해 1부터 9까지 곱한 결과를 출력
                System.out.println(tableNumber + "*" + multiplier + "=" + tableNumber * multiplier);
        }
            //scanner 지원 해제
        scanner.close();//리소스 누수를 방지하기위해 scanner 객체 달기
    }



}
