import java.util.Arrays;

public class ArrayToString {


    public static void main(String[] args) {
    /* Exercise 1
    String[] familyMembers = new String[10];
    familyMembers[0] = "Mom";
    familyMembers[1] = "Dad";
    familyMembers[2] = "Lexi";
    familyMembers[3] = "Cassidy";
    System.out.println(Arrays.toString(familyMembers));*/

   /* String[] myStringNumbers = {"2", "40", "7", "5"};
    int [] myIntNumbers = new int[myStringNumbers.length];

    for (int i = 0; i < myStringNumbers.length; i++) {
       myIntNumbers[i] = Integer.parseInt(myStringNumbers[i]);
        System.out.println(Arrays.toString(myStringNumbers));
        System.out.println(Arrays.toString(myIntNumbers));
    } */

      /*
      String[] myStringArrayA = {"Hello", "Boston"};
      String[] myStringArrayB = {"Hello", "Boston"};
      String[] myStringArrayC = {"Boston", "Hello"};
        */

      String initialString = "I love Boston. Yes, you do love boston";
      String[] strings = initialString.split("[, ?.@&$]+");
      System.out.println(Arrays.toString(strings));

      String [] testString = new String[strings.length];
      int currentIndex = 0;

      for (int i = 0; i < strings.length; i++) {
          boolean isTheWordAlreadyEncountered(testString, strings.length, currentIndex){
              if (isTheWordAlreadyEncountered)
                  continue;
          }  else {

          }
      }


      String testString2 = "Life is good";
      char [] charString = new char[testString.length];
      for (int i =0, i , currentIndex; i++);


    }


}
