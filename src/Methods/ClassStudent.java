package Methods;

public class ClassStudent {
    int getGrade(int score) {
        if (score > 90) {
            System.out.println('A');
        } else if (score > 80) {
            System.out.println('B');
        } else if (score > 70) {
            System.out.println('C');
        } else if (score > 50) {
            System.out.println('D');
        } else {
            System.out.println('F');

        }
        return score;
    }
    }



