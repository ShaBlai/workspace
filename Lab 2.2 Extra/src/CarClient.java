public class CarClient {
        public static void main(String[] args) {
            Car corvette = new Car();
            corvette.displayCarInformation();

            Car tundra = new Car();
            tundra.color = "Purple";
            tundra.make = "Toyota";
            tundra.model = "Tundra";
            tundra.year = 2010;
            tundra.miles = 912322;
            tundra.displayCarInformation();

        }
}





