public class Iteration {

    public static void displayNumbersUsingForLoop(int start, int end) {

        for (int i = start; i < end; i++) {
            System.out.println(i);
       }
    }

    public static void displayNumbersUsingWhile(int start, int end) {

        while (start < end) {
            System.out.println(start);
            start++;
        }
    }

    public static void displayNumbersUsingDoWhile(int start, int end) {

        do {
            System.out.println(start);
            start++;
        }
        while (start < end);
    }

    public static void displayNumbersUsingIf(int start, int end){

        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }

    }


    public static void displayNumbersUsingForEach (int start, int end){


    }


}

