package loc1001;

public class test2 {
    public static void main(String[] args) {


        //6AB
//
        int myIpAddr = 0xD265ECA4;

        int ipAddr1 = (myIpAddr >>24) & 0xFF;
        int ipAddr2 = (myIpAddr >>16) & 0xFF;
        int ipAddr3 = (myIpAddr >>8) & 0xFF;
        int ipAddr4 = (myIpAddr) & 0xFF;




        System.out.println(ipAddr1 + " " + ipAddr2 + " " + ipAddr3 + " " + ipAddr4);

    }
}
