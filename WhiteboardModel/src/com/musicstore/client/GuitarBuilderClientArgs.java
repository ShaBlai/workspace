package com.musicstore.client;

import com.musicstore.GuitarBrands;
import com.musicstore.GuitarBuilder;
import com.musicstore.GuitarType;

public class GuitarBuilderClientArgs {


    public static void main(String[] args) {
        GuitarBuilder guitar1 = new GuitarBuilder(GuitarType.valueOf(args[0]));
        System.out.println(guitar1);

        GuitarBuilder guitar2 = new GuitarBuilder(GuitarType.valueOf(args[0]), GuitarBrands.valueOf(args[1]));
        System.out.println(guitar2);
    }

}