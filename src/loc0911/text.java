package loc0911;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int grade ;


    System.out.println("성적을 입력하세요: ");
    grade = sc.nextInt();
    if (grade >= 90) {
        System.out.println("A");
    }
    else if (grade >= 80) {
        System.out.println("B");
    }
    else if (grade >= 70) {
        System.out.println("C");

    }
    else if (grade >= 60) {
        System.out.println("D");
    }
}
}