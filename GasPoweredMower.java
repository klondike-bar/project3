// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Inherits from WalkBehindMower class and defines methods and attributes

public class GasPoweredMower extends WalkBehindMower{
    private Engine engine;
    private boolean selfPropelled;

    //Default Constructor
    public GasPoweredMower(){
        this.engine = new Engine();
        this.selfPropelled = false;
    }

    //Getters and Setters
    public Engine getEngine() {
        return engine;
    }

    public boolean isSelfPropelled(){
        return selfPropelled;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }

    //toString returns attributes in GasPoweredMower and WalkBehindMower
    public String toString() {
        String output = super.toString() + "\n" + engine.toString() + "\n" + selfPropelled;
        return output;
    }
}
