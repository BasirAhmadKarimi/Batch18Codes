package BreakAndContinue;

public class ArrayIsSorted2 {
    public static void main(String[] args) {
        int [] numbers={10,25,26,30,40,45,45};
        int previous=numbers[0];
        boolean isSorted=true;
        for(int current:numbers){
            if(previous>current){
                isSorted=false;
                break;

            }
            previous=current;
        }
        System.out.println("Is array sorted"+isSorted);
    }
}
