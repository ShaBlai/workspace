public class StringMethodsExample {

    public static void main(String[] args) {

        String testString = "HELLO world";

        boolean testContains = testString.contains("h");
        System.out.println("This is the contains boolean " + testContains);

        boolean testContains2 = testString.endsWith("l");
        System.out.println("This is the endsWith boolean " + testContains2);

        boolean testContains3 = testString.equals("purple rain");
        System.out.println("This is the equals boolean " + testContains3);

        boolean testContains4 = testString.equalsIgnoreCase("metallica");
        System.out.println("This is the equals IgnoreCase boolean " + testContains4);

        int testContains5 = testString.indexOf("e");
        System.out.println("This is the index location Of  " + testContains5);

        int testContains6 = testString.length();
        System.out.println("This is the length test " + testContains6);

        boolean testContains7 = testString.startsWith("HE");
        System.out.println("This is the starts with " + testContains7);

        String testContains8 = testString.strip();
        System.out.println("This is the strip " + testContains8);

        String testContains9 = testString.substring(3);
        System.out.println("This is the substring " + testContains9);

        String testContains10 = testString.toLowerCase();
        System.out.println("This is the lower case " + testContains10);

        String testContains11 = testString.toUpperCase();
        System.out.println("This is the upper case " + testContains11);

        //int[] ints = new int[10];
        //String[] strings = new String[5];
        //Person[] people = new Person[7];

    }






}
