package Class3;

public class TypeCasting {
    public static void main(String[] args) {

        int age = 10;
        double age2 = age;
        System.out.println(age2);
        double num = 10.5;
        int num2 = (int) 10.5;
        System.out.println(num2);
        short mD = 100;
        byte mD2 = (byte) mD;
        System.out.println(mD2);

        double a = 2.3;
        double b = 1.3;
        if (a > b) {
            System.out.println("Double value " + a + " is larger than " + b);

        }
        int tem=23;
        if(tem<32){
            System.out.println("Water wii freeze with temperature"+tem);
        }else{
            System.out.println("Water wii not freeze with temperature"+tem);
        }
        int expected=35;
        int actual=40;
        if(actual>expected){
            System.out.println("you will love the course and you will be succeed");
        }else{
            System.out.println("course will be very hard for you");
        }
        int num6=12;
        if (num6>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }

    }
}