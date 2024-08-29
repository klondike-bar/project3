// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Inherits from Mower class and defines methods and attributes

public abstract class WalkBehindMower extends Mower{
    private double cutWidth;
    private double wheelDiameter;

    //Default Constructor
    public WalkBehindMower(){
        this.cutWidth = 0.0;
        this.wheelDiameter = 0.0;
    }

    //Getters and Setters
    public double getCutWidth() {
        return cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    //toString returns attributes in WalkBehindMower and Mower
    public String toString() {
        String output = super.toString() + "\n" + cutWidth + "\n" + wheelDiameter;
        return output;
    }
}
