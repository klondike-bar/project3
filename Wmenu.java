import java.io.IOException;
import java.util.Scanner;

public class Wmenu {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MowerWareHouse warehouse = new MowerWareHouse();
        System.out.print("Enter the filename: ");
        String inputFileName = scnr.nextLine();

        try {
            warehouse.readMowerData(inputFileName);
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            scnr.close();
        }
    }
}
