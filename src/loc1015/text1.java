
package loc1015;
import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s[] = new int[5];
        for (int i = 0; i <s.length;i++) {
            System.out.print(i + "번쨰 입력 구다사이:");
            s[i] = scanner.nextInt();
        }

        for(int i =0; i <s.length;i++){
            System.out.printf("%d번쨰 입력값은:%d%n",i,s[i]);
        }

    }
}
