package BreakAndContinue;

public class Class1BreakAndCon {
    public static void main(String[] args) {
        int [] numbers= {10, 25, 30, 40, 45, 45};
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==30){
                System.out.println("number 30 is present");
                break;

            }

        }
    }
}
