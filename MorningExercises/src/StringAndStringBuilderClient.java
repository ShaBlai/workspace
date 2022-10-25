class StringAndStringBuilderClient {

    public static void main(String[] args) {
        StringAndStringBuilder addressString = new StringAndStringBuilder();

        boolean test1 = addressString.myAddressUsingString().equals(addressString.myAddressUsingStringBuilder());
        System.out.println("It is " + test1 + " that these addresses are the same");
        System.out.println(" ");

        boolean test2 = addressString.myAddressUsingString() == (addressString.myAddressUsingStringBuilder());
        System.out.println("It is " + test2 + " that these addresses are the same");
    }

}




