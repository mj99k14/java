package loc0925;

public class text2 {
    public static void main(String[] args) {
        int s [] = {90,80,20,60,70};
        int minimum = s[0];
        for (int a = 0; a < s.length; a++) {
            if (s[a] < minimum) {
                minimum = s[a];
            }

        }
        System.out.println(minimum);
    }
}
