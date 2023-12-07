package LogicalOprators;

import java.util.Scanner;

public class Task2LogicalOp {
    public static void main(String[] args) {
        System.out.println("please enter number from 1 to 7");
        Scanner sc=new Scanner(System.in);
        int dayNumer=sc.nextInt();
        if(dayNumer>=1 && dayNumer<=5){
            System.out.println("It is weekday");
        }else{
            if(dayNumer>=6 &&dayNumer<=7){
                System.out.println("it is weekend");
            }else{
                System.out.println("invalid");
            }
        }
    }
}
