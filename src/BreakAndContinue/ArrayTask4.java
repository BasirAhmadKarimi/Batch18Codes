package BreakAndContinue;

public class ArrayTask4 {
    public static void main(String[] args) {
       // not sorted
        //int [] numbers={10, 15, 20, 18, 9, 60, 22, 30};
        //sorted
        int [] numbers={9,10,15,18,20,22,30,60};
        boolean isSorted=true;
        for (int i=0; i<numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                    isSorted=false;
                    break;
            }
        }
        System.out.println("Is loop sorted"+isSorted);


    }
}
