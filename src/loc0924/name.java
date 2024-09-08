package loc0924;

import java.sql.SQLOutput;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final  int students = 5;
        int [] soccer = new int [students];
        int sum = 0;
        for (int i = 0; i < students; i++) {
            System.out.print("성적을 입력하시오:");
            int ss = sc.nextInt();
            soccer[i] = ss;
            sum += ss;
        }

        double avg =  (double) sum / students;
        System.out.print("평균 성적은 " + avg +"입니다");

        }

    }

