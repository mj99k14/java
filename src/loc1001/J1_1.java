package loc1001;

import java.util.Scanner;

public class J1_1 {
    public static void main(String[] args) {
            System.out.print("첫번쨰 변의 길이를 입력하세요:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.print("두번쪠 변의 길이를 입력하세요:");
            int b = sc.nextInt();
            System.out.print("세번쨰 변의 길이를 입력하세요:");
            int c = sc.nextInt();
            if (a+b<c || a+c<b||c+b<a){
                System.out.println("입력하신 변의 길이로는 삼각형을 만들 수 없습니다 \n삼각형을 만들기 위해서는 어떤 두변의 길이의 합이 다른 한변의 길이보다 커야합니다.");
            }else if(a==b&&b==c){
                System.out.println("입력하신 변의 길이로 정삼각형을 만들 수 있습니다");
            } else if (a==b || b==c || c==a) {
                System.out.println("입력하신 변의 길이로 이등변삼각형을 만들 수 있습니다");
            } else {
                System.out.println("입력하신 변의 길이로는 부등변삼각형을 만들 수 있습니다");

            }


        }


    }

