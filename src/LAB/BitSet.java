package LAB;

class BitSet {
    int state = 0; // 비트 상태를 저장하는 변수

    // 비트 설정 메소드
    void setBit(int position, boolean value) {
        if (value) {
            // value가 true인 경우 해당 비트를 1로 설정
            state |= (1 << position);
        } else {
            // value가 false인 경우 해당 비트를 0으로 설정
            state &= ~(1 << position);
        }
    }

    // 비트 조회 메소드
    boolean getBit(int position) {
        // 해당 위치의 비트 값을 반환 (1인지 0인지 확인)
        return (state & (1 << position)) != 0;
    }


    public static void main(String[] args){
        BitSet bitSet = new BitSet();
        //5번쨰 비트를 1로 설정
        bitSet.setBit(5,true);
        //true 출력
        System.out.println(bitSet.getBit(5));
        //false 출력
        System.out.println(bitSet.getBit(3));
    }
}
