public class Address {

    private String city = "Seattle";
    private String country = "USA";




    public Address(String city, String country) {
        this.city = city;
        this.country = country;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
