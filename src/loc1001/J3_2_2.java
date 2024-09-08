package loc1001;

import java.util.Scanner;

public class J3_2_2 {

    // 출석 점수 계산 메서드
    public static float calculateScore(int hoursPerWeek, float totalAbsenceHours, int tardyCount) {
        int totalStudyHours = hoursPerWeek * 15; // 총 수업 시간 계산
        float absenceScore = 20 - (20 * totalAbsenceHours / totalStudyHours); // 출석 점수 계산

        // 지각 3회당 결석 1시간으로 처리
        totalAbsenceHours += (tardyCount / 3);

        // 결석 시간이 총 수업 시간의 1/4을 초과하는지 확인
        if (totalAbsenceHours > totalStudyHours / 4.0) {
            return -1; // 학점 미부여(F)를 나타내기 위해 -1 반환
        }

        return absenceScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력
        System.out.print("주당 수업 시간을 입력하세요 (시수/주): ");
        int hoursPerWeek = sc.nextInt();

        System.out.print("결석한 총 시간을 입력하세요: ");
        float totalAbsenceHours = sc.nextFloat();

        System.out.print("지각 횟수를 입력하세요: ");
        int tardyCount = sc.nextInt();

        // 출석 점수 계산
        float score = calculateScore(hoursPerWeek, totalAbsenceHours, tardyCount);

        // 출력
        if (score == -1) {
            System.out.println("결석 시간이 총 수업 시간의 1/4을 초과하여 'F(학점 미부여)' 입니다.");
        } else {
            System.out.printf("출석 점수: %.2f점\n", score);
        }

        sc.close();
    }
}

