package StringXxpanation;

public class Task8 {
    public static void main(String[] args) {
        String str="car";

        boolean ispolin=true;
        String reverseWord="";

            for (int i=str.length()-1; i>=0; i--){
            reverseWord=reverseWord+str.charAt(i);
        }
if (str.equalsIgnoreCase(reverseWord)){
    System.out.println("It's a palindrom");
}else{
    System.out.println("It's not a palindrom");
}
    }
}
