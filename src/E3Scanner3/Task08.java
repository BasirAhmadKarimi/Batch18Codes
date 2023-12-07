package E3Scanner3;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("please Enter your age");
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        if(age>=18){
            System.out.println("I will issue you a driver licence"+age);
        }else{
            System.out.println("I will issue you a learner permit");
        }

    }
}
