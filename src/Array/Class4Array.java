package Array;

public class Class4Array {
    public static void main(String[] args) {
        int [] num={10,25,44,33,56};

           // System.out.println(num[0]);
           //System.out.println(num[1]);
           // System.out.println(num[2]);
           // System.out.println(num[3]);
            //System.out.println(num[4]);
            //loop is easier
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+num[i];
           System.out.println(sum);
        }
    }
}
