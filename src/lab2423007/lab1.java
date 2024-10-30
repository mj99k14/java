package lab2423007;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("나이를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 0 ) {
                System.out.println("나이는 음수가 될수 없습니다. 다시입력하세요");
            } else {
                if (0 <= age && age <= 12) {
                    System.out.println("어린이");
                } else if (age >=13 && age <= 17) {
                    System.out.println("청소년");

                } else if (age >=18 && age <= 64) {
                    System.out.println("성인");

                } else {
                    System.out.println("노인");
                }
            }
        }
    }
}
