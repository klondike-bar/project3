// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Inherits from Mower class and defines methods and attributes

public class LawnTractor extends Mower{
    private Engine engine;
    private String model;
    private double deckWidth;

    //Default Constructor
    public LawnTractor(){
        this.engine = new Engine();
        this.model = "null";
        this.deckWidth = 0.0;
    }

    //Getters and Setters
    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    //toString returns attributes in LawnTractor and Mower
    public String toString() {
        String output =  super.toString() + "\n" + engine.toString() + "\n" + model + "\n" + deckWidth;
        return output;
    }
}
