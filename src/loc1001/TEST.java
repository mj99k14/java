package loc1001;

public class TEST {
    public static void main(String[] args) {


        int addr1 = 210;
        int addr2 = 101;
        int addr3 = 236;
        int addr4 = 188;

        int mask1 = 255;//8비트 이기때문에 256까지지만 0~255 까지떄문에 255는 ->1111 1111(계산하기떄문에 우리가원래하던 이진수로 나타내면됨)
        int mask2 = 255;
        int mask3 = 255;
        int mask4 = 0;

        int sunbAddr1 = addr1 & mask1;
        int sunbAddr2 = addr2 & mask2;
        int sunbAddr3 = addr3 & mask3;
        int sunbAddr4 = addr4 & mask4;
        System.out.println(sunbAddr1+ "." +sunbAddr2+ "." +sunbAddr3+ "." +sunbAddr4);

    }
}
