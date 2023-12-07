package BreakAndContinue;

public class Class2Break {
    public static void main(String[] args) {
        String [] names={"Aidos","Zeeshan","Abid", "sharif", "Zeeshan"};
        int count=0;
        for(int i=0; i< names.length; i++){

            if(names.equals("Zeeshan")){
               count++;

            }
        }
        System.out.println("Zeeshan apeared"+count+" "+"times");
    }
}
