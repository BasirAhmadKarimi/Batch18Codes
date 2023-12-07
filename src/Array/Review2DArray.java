package Array;

public class Review2DArray {
    public static void main(String[] args) {
        int [][] numbers= {
                {20,23,25,45},
                {66,33,55,12,55},
                {30,50,60}

        };
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }
    }
}
