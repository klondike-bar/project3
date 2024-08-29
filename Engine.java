// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Defines attributes and methods and has a toString. Used for other classes.

public class Engine {
    private String manufacturer;
    private double hoursePower;
    private int cylinders;

    //Default Constructor
    public Engine(){
        this.manufacturer = "null";
        this.hoursePower = 0.0;
        this.cylinders = 0;
    }

    //Parameterized Constructor
    public Engine(String manufacturer, double hoursePower, int cylinders){
        this.manufacturer = manufacturer;
        this.hoursePower = hoursePower;
        this.cylinders = cylinders;
    }

    //Setters and Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


    //Returns all the attributes in Engine
    public String toString(){
        String output = manufacturer + "\n" + hoursePower + "\n" + cylinders;
        return output;
    }
}
