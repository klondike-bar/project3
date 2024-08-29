// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Defines attributes and methods and has a toString. Used for other mower classes

public abstract class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;

    //Default Constructor
    public Mower(){
        this.manufacturer = "null";
        this.year = 0;
        this.serialNumber = "null";
    }

    //Parameterized Constructor
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    //Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //toString returns attributes and correct symbol depending on the class it is used in
    public String toString(){
        String type = "#";
        if (this instanceof GasPoweredMower) {
            type = "G";
        }
        else if (this instanceof LawnTractor) {
            if (this instanceof CommercialMower) {
                type = "C";
            }
            else {
                type = " L";
            }
        }
        else if (this instanceof PushReelMower) {
            type = "P";
        }
        return manufacturer + "\n" + year + "\n" + serialNumber + "\n" + type;
    }
}
