package LogicalOprators;

import java.util.Scanner;

public class Task1LogicalOp {
    public static void main(String[] args) {
        System.out.println("please Enter your height in inch");
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        if(height<60){
            System.out.println("short");

        }else if(height>=60&& height<=72){
            System.out.println("Mediam");
        }else{
            System.out.println("Tall");
        }

    }
}
