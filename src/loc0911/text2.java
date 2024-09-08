package loc0911;

import java.util.Date;
public class text2 {
    public static void main(String[] args) {
        Date date = new Date();
        int currentHour = date.getHours();
        System.out.println("현재 시간은:" + date);
        if (currentHour < 11) {
            System.out.println("GOOD MORING");
        } else if (currentHour < 15) {
            System.out.println("GOOD ARFTERNOON");
        } else if (currentHour < 20) {
            System.out.println("GOOD evening");
        }else {
            System.out.println("GOOD night");
        }
    }
}
