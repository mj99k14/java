package loc1001;

import java.util.Scanner;

public class J2_22 {
    public static int get_score(Scanner sc, String subject){
        System.out.print(subject + "점수를 입력하세요:");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int math =  get_score(sc,"수학");
        int science = get_score(sc,"과학");
        int english = get_score(sc,"영어");

        int totalScore = math + science + english;
        int averageScore = totalScore / 3;

        char grade;
        if (averageScore >=90){
            grade = 'A';
        }else if (averageScore >=80){
            grade = 'B';
        } else if (averageScore >=70) {
            grade = 'C';
        } else if (averageScore >=60) {
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("평균점수는 "+ averageScore+"점 이고, 학점은 "+ grade+ "입니다.");
    }
}
