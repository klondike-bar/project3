// NAME: Ambrose Yancey    DATE: 03/24/2024

// COURSE: COMP 167      Section: 004

// DESCRIPTION
// Creates an Array, reads, and writes to a file.
// Uses Inheritance to get mower values and prints out desired mowers

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;

    //Default Constructor
    public MowerWareHouse() {
        storeName = "null";
        mowers = new ArrayList<Mower>();
    }

    //Getters and Setters
    public String getStoreName() {
        return storeName;
    }

    public ArrayList<Mower> getMowers() {
        return mowers;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setMowers(ArrayList<Mower> mowers) {
        this.mowers = mowers;
    }

    public int getNumMowers() {
        return mowers.size();
    }

    public void setMower(int spot, Mower mower) {
        mowers.add(spot, mower);
    }

    public Mower getMower(int value) {
        return mowers.get(value);
    }

    //Adds or removes Mower
    public void addMower(Mower add) {
        mowers.add(add);
    }

    public Mower removeMower(int remove) {
        return mowers.remove(remove);
    }

    //Reads input file
    public void readMowerData(String inputFileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(inputFileName);
        Scanner scnr = new Scanner(inputStream);
        storeName = scnr.nextLine();

        //Initializes variables
        String manufacturer = "";
        int year = 0;
        String serialNumber = "";
        String type = "";

        //Keeps going until the end of the file
        while (scnr.hasNext()) {
            //Gets manufacturer, year, serialNumber, and type per mower
            manufacturer = scnr.nextLine();
            year = Integer.parseInt(scnr.nextLine());
            serialNumber = scnr.nextLine();
            type = scnr.nextLine();

            if (type.equals("L")) {
                //Create objects of LawnTractor and Engine
                LawnTractor lawn = new LawnTractor();
                Engine eng = new Engine();

                //Gets values and puts it in setters
                eng.setManufacturer(scnr.nextLine());
                eng.setHoursePower(Double.parseDouble(scnr.nextLine()));
                eng.setCylinders(Integer.parseInt(scnr.nextLine()));

                lawn.setEngine(eng);
                lawn.setModel(scnr.nextLine());
                lawn.setDeckWidth(Double.parseDouble(scnr.nextLine()));
                lawn.setManufacturer(manufacturer);
                lawn.setYear(year);
                lawn.setSerialNumber(serialNumber);

                //Calls addMower
                addMower(lawn);
            }

            if (type.equals("C")) {
                //Create objects of Commercial and Engine
                CommercialMower commercial = new CommercialMower();
                Engine eng = new Engine();

                //Gets values and puts it in setters
                eng.setManufacturer(scnr.nextLine());
                eng.setHoursePower(Double.parseDouble(scnr.nextLine()));
                eng.setCylinders(Integer.parseInt(scnr.nextLine()));

                commercial.setEngine(eng);
                commercial.setModel(scnr.nextLine());
                commercial.setDeckWidth(Double.parseDouble(scnr.nextLine()));
                commercial.setOperatingHours(Double.parseDouble(scnr.nextLine()));
                commercial.setZeroTurnRadius(Boolean.parseBoolean(scnr.nextLine()));
                commercial.setManufacturer(manufacturer);
                commercial.setYear(year);
                commercial.setSerialNumber(serialNumber);

                //Calls addMower
                addMower(commercial);
            }

            if (type.equals("G")) {
                //Create objects of GasPoweredMower and Engine
                GasPoweredMower gas = new GasPoweredMower();
                Engine eng = new Engine();

                //Gets values and puts it in setters
                gas.setCutWidth(Integer.parseInt(scnr.nextLine()));
                gas.setWheelDiameter(Integer.parseInt(scnr.nextLine()));

                eng.setManufacturer(scnr.nextLine());
                eng.setHoursePower(Double.parseDouble(scnr.nextLine()));
                eng.setCylinders(Integer.parseInt(scnr.nextLine()));

                gas.setEngine(eng);
                gas.setSelfPropelled(Boolean.parseBoolean(scnr.nextLine()));
                gas.setManufacturer(manufacturer);
                gas.setYear(year);
                gas.setSerialNumber(serialNumber);

                //Calls addMower
                addMower(gas);
            }

            if (type.equals("P")) {
                //Create object of PushReelMower
                PushReelMower push = new PushReelMower();

                //Gets values and puts it in setters
                push.setCutWidth(Integer.parseInt(scnr.nextLine()));
                push.setWheelDiameter(Double.parseDouble(scnr.nextLine()));
                push.setNumWheels(Integer.parseInt(scnr.nextLine()));
                push.setManufacturer(manufacturer);
                push.setYear(year);
                push.setSerialNumber(serialNumber);

                //Calls addMower
                addMower(push);
            }
        }
        scnr.close();

        Scanner scnrMenu = new Scanner(System.in);
        System.out.println("Enter your choice of Mower to get information");
        String input = "";

        //Keeps going until input is "S"
        while (!(input.equals("S"))) {

            //Prompts user for input
            System.out.println("Type C for Commercial mower, G for Gas Powered Mower, P for Push Reel Mower, L for Lawn Tractor, or S to Stop");
            input = scnrMenu.nextLine();

            //Prints out Commercial Mower
            if (input.equals("C")) {
                for (int i = 0; i < mowers.size(); i++) {
                    Mower output = mowers.get(i);
                    if (output instanceof CommercialMower) {
                        System.out.println(output);
                    }
                }
            }

            //Prints out GasPoweredMower
            else if (input.equals("G")) {
                for (int i = 0; i < mowers.size(); i++) {
                    Mower output = mowers.get(i);
                    if (output instanceof GasPoweredMower) {
                        System.out.println(output);
                    }
                }
            }

            //Prints out PushReelMower
            else if (input.equals("P")) {
                for (int i = 0; i < mowers.size(); i++) {
                    Mower output = mowers.get(i);
                    if (output instanceof PushReelMower) {
                        System.out.println(output);
                    }
                }
            }

            //Prints out LawnTractor
            else if (input.equals("L")) {
                for (int i = 0; i < mowers.size(); i++) {
                    Mower output = mowers.get(i);
                    if (output instanceof LawnTractor) {
                        if (output instanceof CommercialMower) {
                            System.out.print("");
                        }
                        else {
                            System.out.println(output);
                        }
                    }
                }
            }

            //Breaks while loop if input equals "S"
            else if (input.equals("S")) {
                break;
            }

            //Prints out error if specific inputs are not
            else {
                System.out.println("Option provided is invalid. Check capitalization");
            }
        }
        scnrMenu.close();
    }

    //Writes mower information to a file
    public void saveMowerData(String outputFileName) throws IOException{
        FileWriter fileW = new FileWriter(outputFileName);
        BufferedWriter writing = new BufferedWriter(fileW);

        writing.write(this.toString());
        writing.close();
    }

    //toString outputs store name and information about mowers
    public String toString() {
        String output = getStoreName();
        String line = "\n";

        for (int i = 0; i < mowers.size(); i++) {
            output += line + mowers.get(i).toString();
        }

        return output;
    }
}
