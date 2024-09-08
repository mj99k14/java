package loc0911;

import java.util.Scanner;

public class text6 {
    public static void main(String[] args) {
        int m31;
        int m30;
        int m29;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("일수를 알고 싶은 월을 입력하세요: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("월의 날수는 31");
                break;
            case 2:
                System.out.println("월의 날수는 29");
                break;
            default:
                System.out.println("월의 날수는 30");
                break;

            }
        }
    }
