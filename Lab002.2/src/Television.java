
class Television {
    //Fields or Instance Variables
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    private static int instanceCount = 0;
    private String brand = "Toshiba"; //brand name
    private int volume = 1; //current volume
    private boolean mute = false; //mute state
    private DisplayType display= DisplayType.LED;



//Constructor Methods
//class brandvolume

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }


    public Television(String brand,int volume,DisplayType display){
        this(brand,volume);
        setDisplay(display);
    }



    //Business Methods
    public void turnOn() {
        //call private method for this task
        //boolean isConnected = verifyInterconnection();
        System.out.println("Turning on your " + brand + "TV to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Turning off your device, goodbye");
    }


    // Accessor Methods
    //setters and getters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == "Samsung" || brand == "Toshiba" || brand == "LG") {
            System.out.println("This brand is valid");
        }

        else {System.out.println("This brand is not valid");
            this.brand = brand;}
    }

    public int getVolume() {
        return volume;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VALUE || volume > MAX_VALUE) {
            System.out.println("You have entered an invalid volume of " + volume);
        } else {
            System.out.println("This is a good volume");
            this.volume = volume;
        }
    }



    //Instance Counter
    public static int getInstanceCount(){
        return instanceCount;
    }


    /* public boolean verifyInterconnection() {
        return True; //fake implementation */


    //toString()
    public String toString() {
        return "Brand: " + brand + " " + " Volume " + volume + " " + display;
    }


}