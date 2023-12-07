package E3Scanner3;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("please enter your city name");
        Scanner sc=new Scanner(System.in);
        String cityName=sc.nextLine();

        System.out.println("please enter Temperature in");
        double tem=sc.nextDouble();
        double temInCelsius=(tem-32)*5.0/9.0;
        System.out.println("temperaturein"  +cityName+"is"+temInCelsius);
    }
}
