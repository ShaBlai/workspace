public class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung",-100);
        tv.setVolume(1);

        System.out.println(tv + "\n");

        tv.setVolume(100);
        System.out.println(tv + "\n");

        tv.setVolume(-1);
        tv.setVolume(-100);
        System.out.println(tv + "\n");

        tv.setBrand("Sony");
        tv.setVolume(101);


    }



}
