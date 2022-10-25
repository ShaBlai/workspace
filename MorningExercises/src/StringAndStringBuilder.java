class StringAndStringBuilder {
    //instance variables


    String street = "15205 140th Way SE ";
    String apt = "G205";
    String city = "Renton";
    String state = "Washington";


    //constructor methods



    //business methods
    String myAddressUsingString() {
        String address = street + " " + apt + " " + city + " " + state;
        System.out.println(address);
        return address;
    }

    String myAddressUsingStringBuilder() {
        String address2 = new StringBuilder(32)
                .append("15205 140th Way SE")
                .append("  G205")
                .append(" Renton")
                .append(" Washington").toString();
        System.out.println(address2);
        return address2;
    }


//accessor/getter/setter methods

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }




//toString method



}

