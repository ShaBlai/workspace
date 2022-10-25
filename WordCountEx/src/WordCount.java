import java.util.Arrays;


public class WordCount {
    //We love Bosttaawnnn
    static String sentence = "Hello I love Boston. Yes, you do Love Boston";
    static String sentenceArray[] = sentence.split("[, ?.@]+");


    public static void countMethod() {

        int[] countArray = new int[sentenceArray.length];
        int count = 0;
        boolean wordUsedPreviously = false;

        for (int i = 0; i < sentenceArray.length; i++) {
            count = 0;

            for (String word : sentenceArray) {
                if (word.equalsIgnoreCase(sentenceArray[i])) {
                        count++;
                        countArray[i] = count;

                }
            }

        if !(wordUsedPreviously)

        }

        System.out.println(Arrays.toString(countArray));
    }


}
