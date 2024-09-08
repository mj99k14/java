package loc1001;

import java.util.Scanner;

public class J3_2 {
    public static void main(String[] args) {
        System.out.print("주당 수업 시간을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int hours_per_week = sc.nextInt();
        System.out.print("결석한 총 시간을 입력하세요:");
        int absence_hours = sc.nextInt();
        System.out.print("지각 횟수를 입력하세요:");
        int tardy_count= sc.nextInt();

        int week = 15 * hours_per_week;
        if (tardy_count<4){
            int tardy_count1= tardy_count / 3;
            hours_per_week  += tardy_count1;
        }
        float absence = 20 - (20 * absence_hours / week);
        if (week / hours_per_week > week / 4.0){
            System.out.print("당신의 출석 점수는 f(학점 미부여)점입니다.");
        }
        else {


            System.out.print("당신의 출석 점수는" + absence + "점 입니다.");
        }
    }
}