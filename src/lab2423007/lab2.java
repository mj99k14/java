package lab2423007;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = "요일, 주중";
        String s = "요일, 주말";

        while (true) {
            System.out.print("1~7 사이의 숫자를 입력하세요:");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("월" + w);
                    break;
                case 2:
                    System.out.println("화" + w);
                    break;
                case 3:
                    System.out.println("수" + w);
                    break;
                case 4:
                    System.out.println("목" + w);
                    break;
                case 5:
                    System.out.println("금" + w);
                    break;
                case 6:
                    System.out.println("토" + s);
                    break;
                case 7:
                    System.out.println("일" + s);
                    break;
                default:
                    System.out.println("유효하지 않는 숫자입니다");
                    continue;
            }


            if (input >= 1 && input <= 7) {
                break;
            }
        }
        sc.close();
    }
}
