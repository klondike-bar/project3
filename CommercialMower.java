// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Inherits from LawnTractor class and defines methods and attributes

public class CommercialMower extends LawnTractor{
    private double operatingHours;
    private boolean zeroTurnRadius;

    //Default Constructor
    public CommercialMower(){
        this.operatingHours = 0.0;
        this.zeroTurnRadius = false;
    }

    //Getters and Setters
    public double getOperatingHours() {
        return operatingHours;
    }
    public boolean isZeroTurnRadius(){
        return zeroTurnRadius;
    }
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }

    //toString returns attributes in CommercialMower and LawnTractor
    public String toString(){
        String output = super.toString() + "\n" + operatingHours + "\n" + zeroTurnRadius;
        return output;
    }
}