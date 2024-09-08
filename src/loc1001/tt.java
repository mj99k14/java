package loc1001;

public class tt {
   public static void main(String[] args) {
            //0100 1010 1110 0010 0000 0000 1011 1011
       int foo = 0b0100101011100010000000010111011;
            //GET :특정 자리의 비트 값 읽기
            //  - 비트 자리 수

       int setPosition =31;
       boolean value = true;

       int mask = 1 <<31;
       // 0b01000000000000000000000000000000;

       int result2 =foo |mask;

    }
}
