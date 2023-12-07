package E3Scanner3;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Please Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=  sc.nextInt();
        sc.nextLine();
        System.out.println("Please Enter your full name");
        String fullName=sc.nextLine();
        System.out.println("Your name is "+fullName+" and you are "+age+" old");
    }
}
