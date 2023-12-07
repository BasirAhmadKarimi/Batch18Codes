public class Task32DArray {
    public static void main(String[] args) {
        String [][] name={
                {"Faisal","maria","james","Jack"},
                {"A","B","C","D"}
        };
        for(int row=0; row<name[0].length; row++){
            if(name[1][row].equals("A") || name[1][row].equals("B"))
            System.out.println(name[0][row]+" "+name[1][row]);

        }
    }
}
