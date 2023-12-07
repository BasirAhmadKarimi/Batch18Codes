package StringXxpanation;

public class Split {
    public static void main(String[] args) {
        String str =" It's Savera's Birthday toda. it's Sunday. Toda is java class.";
      // String [] strArr= str.split("[.]");
        //System.out.println(strArr.length);
        //System.out.println(strArr[2].trim());
        String [] wordArr= str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[1]);
    }
}
