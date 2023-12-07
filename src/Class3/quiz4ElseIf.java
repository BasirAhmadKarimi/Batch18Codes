package Class3;

public class quiz4ElseIf {
    public static void main(String[] args) {

        int age = 20;
        if (age < 1) {
            System.out.println("baby");

        } else if (age < 30) {
            System.out.println("still teenager");
        } else if (age < 20) {
            System.out.println("teenager");
        } else if (age < 50) {
            System.out.println("a little old");
        } else {
            System.out.println("old");

        }
    }
}
