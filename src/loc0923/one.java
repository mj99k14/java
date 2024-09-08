package loc0923;

import java.util.Random;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        int randomNum = rand.nextInt(100);
        int guess;
        do {
            System.out.print("정답을 추측하여 보시요:");
            guess = sc.nextInt();
            tries++;

            if (guess > randomNum) {
                System.out.println("제시한 정수가 낮습니다");
            } else if (guess < randomNum) {
                System.out.println("제시한 정수가 높습니다");
            } else if (guess == randomNum) {
                System.out.println("축하합니다 시도한 횟수는" + tries);

            }
        }while (tries < 5) ;

        System.out.println("실패입니다. 정답은 "+randomNum);
    }
}