package com.musicstore.test;

import com.musicstore.GuitarBuilder;
import com.musicstore.GuitarColor;

public class GuitarBuilderValidationTest {

    //main method to validate fields

    public static void main(String[] args) {
        GuitarBuilder guitarTest = new GuitarBuilder();
        guitarTest.setGuitarNickname("The Greatest Guitar Ever Built");//validation test of the guitar nickname length
        guitarTest.setStrings(100);//validation test of the total strings allowed for design
    }

}
