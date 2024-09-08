package loc0919;

public class star {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j =0; j<i;j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int s = 0; s <= 5; s++) {
            for (int z= 5; z > s; z--) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
