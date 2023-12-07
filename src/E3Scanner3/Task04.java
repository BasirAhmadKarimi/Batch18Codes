package E3Scanner3;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=19){
            System.out.println("you will get the driving licence");
        }else{
            System.out.println("you will get a learner permit");
        }
    }
}
