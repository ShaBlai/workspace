package com.entertainment.client;
import com.entertainment.DisplayType;
import com.entertainment.Television;



class TelevisionClient {

    public static void main(String[] args) {
        //tv number 1
        Television tv1 = new Television("Samsung", Television.MAX_VALUE, DisplayType.LED);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println("\n");

        //tv number 2
        Television tv2 = new Television("Sony", Television.MIN_VALUE, DisplayType.LED);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2 + "\n");

        //tv number 3
        Television tv3 = new Television("Sony", 33, DisplayType.LED);
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3 + "\n");

        System.out.println(Television.getInstanceCount() + " instances");
    }



}