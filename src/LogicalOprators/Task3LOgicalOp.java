package LogicalOprators;

import java.util.Scanner;

public class Task3LOgicalOp {
    public static void main(String[] args) {
        System.out.println("please enter current time in 24 hours format");
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        if(hours>=1&&hours<=11){
            System.out.println("it is morning");
        }else if(hours>=12&&hours<+15){
            System.out.println("it is afternoon");
        }else if(hours>=16&&hours<=20){
            System.out.println("evening");
        }else if(hours>=21&&hours<=24){
            System.out.println("it is night");
        }else {
            System.out.println("invalid");
        }
    }
}
