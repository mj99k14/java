package loc0925;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
    while (true) {
        final int ss[] = new int[10];
        System.out.println("---------------------------------");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("ss[]");
        System.out.println("--------------------------------");
        final int s[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1):");
        int user = sc.nextInt();
        if (user > -1) {
            ss[user] = 1;
            System.out.println("예약되었습니다");
        }else if (ss[user]==1) {
            System.out.println("이미 예약된 자석입니다");
        } else if (user==-1) {
            break;

        }

    }


    }
    }

