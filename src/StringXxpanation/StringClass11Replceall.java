package StringXxpanation;

public class StringClass11Replceall {
    public static void main(String[] args) {
        String str="sdjfkDAHGhjsdfhklhd@#$%$1245";
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[A-Z]", "*"));
        System.out.println(str.replaceAll("[0-9]", "*"));
        System.out.println(str.replaceAll("[0-9A-Za-z]", "*"));
        System.out.println(str.replaceAll("[^A-Z]", "*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(str.replaceAll("[!-?]", ""));
        System.out.println(str.replaceAll("[#-*]", ""));

        System.out.println((int)'A');
    }
}
