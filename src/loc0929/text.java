package loc0929;

public class text {
    public static void main(String[] args) {
        System.out.println("숫자들의 합:" +
                            sum(new int[] {1,2,3,4}));
}
public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
}
}