package com.musicstore.client;
import com.musicstore.*;
public class GuitarBuilderClient {

    public static void main(String[] args) {

        try {
            //Guitar Built Item #1
            GuitarBuilder Guitar1 = new GuitarBuilder(GuitarType.ELECTRIC, GuitarBrands.DEAN, 6, GuitarColor.SUNBURST, "Rainmaker", Experience.EXPERIENCED_MUSICIAN);
            System.out.println(Guitar1);
            Guitar1.guitarsBuiltStatus();

            //Guitar Built  Item #2
            GuitarBuilder Guitar2 = new GuitarBuilder(GuitarType.BASS, GuitarBrands.GIBSON, 6, GuitarColor.BLUE, "Shredder");
            Guitar2.setExperience(Experience.NEW_MUSICIAN);
            System.out.println(Guitar2);
            Guitar2.guitarsBuiltStatus();

            //Guitar Built Item #3
            GuitarBuilder Guitar3 = new GuitarBuilder(GuitarType.ACOUSTIC, GuitarBrands.TAKAMINE, 12, GuitarColor.PURPLE, "Peace", Experience.EXPERIENCED_MUSICIAN);
            System.out.println(Guitar3);
            Guitar3.guitarsBuiltStatus();

        //catch for guitar nickname being too long
        } catch (Exception e) {
            System.out.println(" This nickname is beyond 12 characters, please shorten it! " + e);
        }
    }
}