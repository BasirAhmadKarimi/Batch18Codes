public class tasks62DArray {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even
         numbers in 3 rows and 4 columns. Develop
        a program which will identify/print the even numbers only.*/
        int [][] odd= {{25,23,44,66},
            {48,77,66,33},
            { 10,15,14,56}
};
        for(int row=0; row<odd.length; row++){
            for(int col=0; col<odd[row].length; col++){
                if(col%2==0){
                    System.out.print(odd[row][col]+" ");
                }

            }
}
}
}