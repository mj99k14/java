package loc1001;

import java.util.Scanner;

public class J2_2 {
    public static int math_score(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수학 점수를 입력하세요: ");
        int math = sc.nextInt();
        return math;
    }
    public static int science_score(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과학 점수를 입력하세요:");
        int science = sc.nextInt();
        return science;
    }
    public static int english_score(){
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 점수를 입력하세요:");
        int english = sc.nextInt();
        return english;

}

    public static void main(String[] args) {
     int ss=math_score()+science_score()+english_score();
     int sum = ss/3;
     if (sum>=90){
         System.out.println("평균점수는"+sum+"점 이고,학점은 A 입니다." );
     }else if (sum>=80){
         System.out.println("평균점수는"+sum+"점 이고,학점은 B 입니다.");
     }else if (sum>=70){
         System.out.println("평균점수는"+sum+"점 이고,학점은 C 입니다.");
     } else if (sum>=60) {
         System.out.println("평균점수는"+sum+"점 이고,학점은 D 입니다.");

     }else {
         System.out.println("평균점수는\"+sum+\"점 이고,학점은 F 입니다.");
     }

    }
}
