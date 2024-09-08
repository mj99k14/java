package loc0927;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        final int seats =5;
        int [] seat = new int[seats];

        while (true){
            System.out.println("------------------------------");
            for (int i = 0; i < seats; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n-----------------------------");
            for (int i = 0; i < seats; i++) {
                System.out.print(seat[i]+" ");
            }
            System.out.println("-----------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("좌석을 골라주셈(종료는 -1)");
            int choice = sc.nextInt();

            if (choice == -1) {
                break;
            }
            if (seat[choice-1] == 0) {
                System.out.print("예악되었습니다");
            }
            else {
                System.out.print("예악 불가능합니다");
            }
        }
    }
}
