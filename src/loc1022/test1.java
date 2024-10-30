package loc1022;

public class test1 {
    public static void main(String[] args) {
     int bar[] = new int[3];

     for(int i =0, j =10; i< bar.length; i++,j+=10){
         bar[i] = j;
        }

     for (int i =0; i<3 ; i++){
         System.out.print(bar[i] +"\t" );
     }



    }
}
