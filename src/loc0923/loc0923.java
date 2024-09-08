package loc0923;

import java.util.Random;
import java.util.Scanner;

public class loc0923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        int count = 0;
        while (count < 5) {
            System.out.print("정답을 추측하여 보시오:");
            int guess = sc.nextInt();
            count++;
            if (guess > randomInt) {
                System.out.println("제시한 정수가 낮습니다.");

            } else if (guess < randomInt) {
                System.out.println("제시한 정수가 높습니다.");

            } else if (guess == randomInt) {
                System.out.println("축하합니다  시도횟수=" +count);
                break;
            }


        }
        System.out.println("정답은" + randomInt);
        }
    }
