public class Task52DArray {
    public static void main(String[] args) {
        String[][] cars = {
                {"tomato", "potato", "onion", "cabage"},
                {"apple", "orange", "grape", "mango"},
                {"milk", "butter", "cheese", "cream"},
                {"Candy", "Chocolate", "Cupcake", "Cookies"}
        };
        for (String[] k : cars) {
            for (String items : k) {
                System.out.print(items + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
        }
            System.out.println();
        }

    }
}