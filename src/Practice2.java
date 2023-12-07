public class Practice2 {
    public static void main(String[] args) {
        String str="Mom";
        String reverseWrd="";

        for (int i =str.length()-1; i >=0 ; i--) {
            reverseWrd=reverseWrd+str.charAt(i);

        }
        if (str.equalsIgnoreCase(reverseWrd)){
            System.out.println("it is palindrom");
        }else{
            System.out.println("it is not palindrom");
        }
        java.lang.StringBuilder sb=new java.lang.StringBuilder("you are gorgeous Maria");
       // System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.insert(3," "));
        System.out.println(sb.insert(6,"R"));

    }

}
