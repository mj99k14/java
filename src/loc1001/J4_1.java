//package loc1001;
//
//import java.util.Scanner;
//
//public class J4_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("비밀번호를 입력하세요: ");
//        int passWord= sc.nextInt();
//        int p = passWord.length();
//        if (p>=8){
//            System.out.print("비밀번호 길이가 충분합니다.");
//        }else {
//            System.out.print("비밀번호가 안전하지 않습니다.");
//        }
//        while (p>=8){
//            char p= passWord;
//            for(int i =0 ; i< p.length(); i++){
//                if (!Character.isUpperCase(i)){
//                    System.out.print("비밀번호가 안전하지 않습니다");
//                    break;
//                }else {
//                    System.out.print("비밀번호가 안전합니다.");
//                }
//                }
//
//            }
//
//        }
//    }
//}
package loc1001;

import java.util.Scanner;

public class J4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");
        String passWord = sc.next();  // 비밀번호는 문자열로 입력 받음

        int p = passWord.length();  // 문자열의 길이를 확인
        if (p >= 8) {
            System.out.print("비밀번호 길이가 충분합니다.");
        } else {
            System.out.print("비밀번호가 안전하지 않습니다.");
        }

        if (p >= 8) {
            for (int i = 0; i < passWord.length(); i++) {
                char c = passWord.charAt(i);  // 문자열에서 각 문자를 가져옴
                if (!Character.isUpperCase(c)) {  // 대문자가 아니면
                    System.out.print("비밀번호가 안전하지 않습니다.");
                    break;
                } else {
                    System.out.print("비밀번호가 안전합니다.");
                }
            }
        }

        sc.close();  // 스캐너 닫기
    }
}



