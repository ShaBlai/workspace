package com.musicstore;

public class GuitarBuilder {
    //Fields or Instance Variables for the Guitar Builder class
    public static final int MAX_STRINGS = 12; //max number of strings for guitar
    public static final int MIN_STRINGS = 6; //minimum number of strings for guitar
    public static final int GUITAR_MAX_NICKNAME_LENGTH = 12; //Guitar Nickname Max Character length
    private static int guitarCount = 0; //number of guitars built;
    private String guitarNickname; //custom guitar nickname to be etched
    private GuitarBrands guitarBrands; //Guitar Brands Enum
    private GuitarType guitarType; //Guitar Type Enum
    private Experience experience; //Guitar Player Experience Enum
    private GuitarColor guitarColor; //Guitar Color Enum
    private int strings = 0; //number of default strings


    //Constructor Methods
    public GuitarBuilder() {
        guitarCount++;
    }

    public GuitarBuilder(GuitarType guitarType) {
        this();
        setGuitarType(guitarType);
    }

    public GuitarBuilder(GuitarType guitarType, GuitarBrands guitarBrands) {
        this(guitarType);
        setGuitarBrands(guitarBrands);
    }

    public GuitarBuilder(GuitarType guitarType, GuitarBrands guitarBrands, int strings) {
        this(guitarType, guitarBrands);
        setStrings(strings);
    }

    public GuitarBuilder(GuitarType guitarType, GuitarBrands guitarBrands, int strings, GuitarColor guitarColor) {
        this(guitarType, guitarBrands, strings);
        setGuitarColor(guitarColor);
    }

    public GuitarBuilder(GuitarType guitarType, GuitarBrands guitarBrands, int strings, GuitarColor guitarColor, String guitarNickname) {
        this(guitarType, guitarBrands, strings, guitarColor);
        setGuitarNickname(guitarNickname);
    }

    public GuitarBuilder(GuitarType guitarType, GuitarBrands guitarBrands, int strings, GuitarColor guitarColor, String guitarNickname, Experience experience) {
        this(guitarType, guitarBrands, strings, guitarColor, guitarNickname);
        setExperience(experience);
    }


    //Business Methods
    public void guitarsBuiltStatus() {
        System.out.println("Wow, just look at your guitar design skills go! You have built " + getGuitarCount() + " of them today!");
    }

    //Counter for number of Total Guitars created
    public static int getGuitarCount() {
        return guitarCount;
    }


    //Accessor Methods
    //Getters and Setters for fields above
    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public GuitarBrands getGuitarBrands() {
        return guitarBrands;
    }

    public void setGuitarBrands(GuitarBrands guitarBrands) {
        this.guitarBrands = guitarBrands;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public GuitarColor getGuitarColor() {
        return guitarColor;
    }

    public void setGuitarColor(GuitarColor guitarColor) {
        this.guitarColor = guitarColor;

    }

    public String getGuitarNickname() {
        return guitarNickname;
    }

    //setter method for validating the maximum characters for a guitar's nickname
    public void setGuitarNickname(String guitarNickname) throws IllegalGuitarNicknameException {
        if (guitarNickname.length() > GUITAR_MAX_NICKNAME_LENGTH) {
            throw new IllegalGuitarNicknameException("this is not an acceptable guitar nickname length" + getGuitarNickname());

             /*   this.guitarNickname = guitarNickname;
        if (guitarNickname.length() > GUITAR_MAX_NICKNAME_LENGTH) {
            System.out.println("Maximum nickname length reached, please reduce to below 12 characters");
        } */


        }

    }






    public static void setGuitarCount(int guitarCount) {
        GuitarBuilder.guitarCount = guitarCount;
    }

    public int getStrings() {
        return strings;
    }


    //sets the string limit to either 6 or 12 for the design
    public void setStrings(int strings) {
        if (strings == MIN_STRINGS || strings == MAX_STRINGS) {
            System.out.println("");
        } else {
            System.out.println("Please enter either 6 or 12 strings for your design");
            this.strings = strings;
        }
    }


    //toString Methods showing what was just built
    public String toString() {
        return "Rock on you " + experience + "!" + " You have just built a " + guitarBrands + " " + guitarColor + " " + guitarType + " nicknamed " + guitarNickname + "!";
    }

}
