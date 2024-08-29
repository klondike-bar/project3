// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Inherits from WalkBehindMower class and defines methods and attributes

public class PushReelMower extends WalkBehindMower{
    int numWheels;

    //Default Constructor
    public PushReelMower(){
        this.numWheels = 0;
    }

    //Getters and Setters
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    //toString returns attributes in PushReelMower and WalkBehindMower
    public String toString(){
        String output = super.toString() + "\n" + numWheels;
        return output;
    }
}
