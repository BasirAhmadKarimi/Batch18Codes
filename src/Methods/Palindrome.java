package Methods;

public class Palindrome {
    void ispalin(String word){
       String reverseWord="";
       for(int i=word.length()-1; i>=0; i--) {
           reverseWord=reverseWord+word.charAt(i);
       }
       if(word.equalsIgnoreCase(reverseWord)){
           System.out.println(word);
           System.out.println("It is Palindrome");
       }else{
           System.out.println(word);
           System.out.println("It is not Palindrome");
       }
    }
}
