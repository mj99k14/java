package loc1020;

public class test1 {
    public static void main(String[] args) {
        String[] name = {"kim","park","yi"};

        for(int i=0; i< name.length; i++){
            System.out.println("name["+i+"]:"+ name[i]);

        }
        String tmp= name[2];
        System.out.println("tmp:" +tmp);
        name[0] = "yu";
        for (String str:name)
            System.out.println(str);
    }
}
