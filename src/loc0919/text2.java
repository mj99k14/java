package loc0919;

public class text2 {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6};
        int index = 0;

        System.out.println("후위 증감 연산자 활용 예:");

        while ( index < numbers.length) {
            System.out.println("현재 요소(후위):" + numbers[index]);
            index = 0;
            System.out.println("\n전위 증감 연산자 활용 예");
            while ( index < numbers.length) {
                if (++index == 4){
                    System.out.println("4번쨰 요소에 도달함(전위):" + numbers[index -1]);
                    break;
                }
            }
            System.out.println("\n증감 연산자와 반복문 예:");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] %2 == 0){
                    System.out.println("짝수 요소:" + numbers[i]);
                }
            }
        }
        }
}
