package loc1019;

public class text5 {
    public static void main(String[] args) {
        int [] numArr =new int[10];

        for(int i =0; i <numArr.length; i++){
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i=0; i <numArr.length-1;i++){
            boolean changed = false; //flag 변수
            for (int j=0; j <numArr.length-1;j++){
                if(numArr[i] > numArr[j+1]){
                    int temp = numArr[j];
                    numArr[j] =numArr[j+1];
                    changed =true;
                }
            }
            if (!changed) break;

            for(int k=0; k<numArr.length;k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }
}
