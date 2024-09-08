package loc0925;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s[]  = {0,10,20,30,40,50};
        int user , index = -1;
        System.out.print("탐색할 값을 입력하세요:");
        user = sc.nextInt();

        for (int i = 0; i < s.length; i++) {
            if (s[i] == user) {
                index = i;
                System.out.print(user+"값은"+i+"위치에 있습니다.");
            }
        }

    }
}
