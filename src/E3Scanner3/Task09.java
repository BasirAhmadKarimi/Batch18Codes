package E3Scanner3;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("How many yours have you worked");
        Scanner sc=new Scanner(System.in);
        int yearsWorked=sc.nextInt();
        if(yearsWorked>=5){
            System.out.println("What is your annual salary");
            double salary=sc.nextDouble();
            sc.nextLine();
            if(salary>5000){

                System.out.println("your bounce is 5000");
            }else{
                System.out.println("bounce=3000");
            }
        }else{
            System.out.println("you are not eligible for bounce");
        }
    }
}
