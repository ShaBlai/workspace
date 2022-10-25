//this is my old television lab
class TelevisionClient {

       public static void main(String[] args) {
            Television tv1 = new Television();
            tv1.brand = "Samsung";
            tv1.volume = 32;
            tv1.turnOn();
            tv1.turnOff();
            System.out.println("Did I make this program right?");

           //tv number 2
           Television tv2 = new Television();
           tv2.brand = "LG";
           tv2.volume = 45;
           tv2.turnOn();
           tv2.turnOff();
           System.out.println("Is my LG working?");


       }




}
