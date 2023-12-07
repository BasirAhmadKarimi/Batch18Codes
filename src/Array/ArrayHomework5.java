package Array;

public class ArrayHomework5 {
    public static void main(String[] args) {
        int [] num={5, 12, 14, 15, 55, 584, 110, 699, 1400};
        int largest=0;
        for(int i=0; i<num.length; i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        System.out.println(largest);
    }
}
