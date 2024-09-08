package loc1001;

import java.util.Scanner;

public class j5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.print("첫 번쨰 수 입력: ");
            int a = sc.nextInt();
            System.out.print("두 번쨰 수 입력: ");
            int b = sc.nextInt();
            System.out.print("세 번째 수 입력: ");
            int c = sc.nextInt();
            int max = a;
            if (a==b && b==c){
                System.out.print("모두 수가 같습니다.");
            } else if (a==b||b==c||a==c) {
                if (a==b){
                    System.out.println("두 수가 같습니다.("+a+"와"+b+")");
                }
                if (a==c){
                    System.out.println("두 수가 같습니다.(" +a+"와"+c+")");
                }if (b==c){
                    System.out.println("두 수가 같습니다,("+b+"와"+c+")");
                }

            } else {
                if (max < b) {
                max = b;
            } if (max<c) {
                max =c;
            }
                System.out.println("모든 수가 다릅니다 . 가장 큰수는" + max +"입니다");


        }


    }



    }
}
