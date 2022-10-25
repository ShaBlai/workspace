public class ComputerClient {


    public static void main(String[] args) {
        ComputerUsingIntPrimitives thisVar = new ComputerUsingIntPrimitives();
        int value = thisVar.add(5,5);
        float valueFloat = thisVar.addFloat(3.33f, 5.55f);

        System.out.println(value);
        System.out.println(valueFloat);

    }

}
