package Class4Scanner;

public class Task2 {
    public static void main(String[] args) {

        int num1 = 23;
        int num2 = 44;
        int num3 = 99;
        if (num1 > num2) {
            if (num1 > num3) {

                System.out.println("num1  one is the largest" + num1);
            }
        } else {
            if (num2 > num3) {
                System.out.println("num2 is larges" + num2);
            } else {
                System.out.println("num3 is largest" + num3);
            }
        }
    }
}