public class Main {

    private static int myIntField; //0
    private static String myStringField; //null


    public static void main(String[] args) {
        myMethod();
    }

    private static void myMethod() {
        int myLocalInt = 3;       //Can you use public or private to local variables?
        String myLocalString = "Shawn";


        System.out.println(myLocalInt + " " + myLocalString);
        System.out.println(myIntField + " " + myStringField);

    }


}