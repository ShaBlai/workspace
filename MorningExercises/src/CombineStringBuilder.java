public class CombineStringBuilder {


    public static void main(String[] args) {
        String address2 = new StringBuilder(32)
                .append("15205 140th Way SE")
                .append("Apt G205 ")
                .append("Renton")
                .append("Washington").toString();
        System.out.println(address2);
    }




}
