package loc0919;

public class TEST3 {
    public static void main(String[] args) {
        String str1 = new String("HELLO");
        String str2 = "HELLO";


        System.out.println(str1 == str2);// == 가 주소값을 비교
        System.out.println(str1.equals(str2)); // equals() 메서드는 두 객체가 가지고있는 값을 비교
    }
}
