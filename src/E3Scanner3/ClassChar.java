package E3Scanner3;

import java.util.Scanner;

public class ClassChar {
    public static void main(String[] args) {
        Scanner ne=new Scanner(System.in);
        System.out.println("please enter your gender M/F");
        char gender=ne.next().charAt(0);
        System.out.println("your gender "+gender
        );

    }
}
