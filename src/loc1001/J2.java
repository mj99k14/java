package loc1001;

import java.util.Scanner;

public class J2 {
    public static float square_feet(float n) {
        return n * 10.7539f;
    }

    public static float acres(float n) {

        return n * 0.000247105f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("토지의 면적을 제곱미터(m2)단위로 입력하세요:");
        int n = sc.nextInt();
        if (n <0){
            System.out.println("잘못된 입력입니다.");
        } else {
            System.out.println(n + "제곱미터는" + square_feet(n) + "평방비트입니다");
            System.out.println(n + "제곱미터는" + acres(n) + "에이커입니다");

        }


    }
}
