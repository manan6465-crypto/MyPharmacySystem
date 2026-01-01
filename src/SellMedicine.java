import java.util.ArrayList;
import java.util.Scanner;

public class SellMedicine {
    public static double sellMedicine(ArrayList<Main.Medicine>medicines, Scanner sc,ArrayList<Double>sales){
        Main.clearScreen();
        System.out.println("=== Sell Medicine ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available to sell!");
            return 0.0;
        }
        System.out.print("Enter Medicine ID to sell: ");
        int id = sc.nextInt();
        sc.nextLine();
       Main. Medicine found = null;
        for(Main.Medicine med : medicines) {
            if(med.id == id) {
                found = med;
                break;
            }
        }
        if(found == null) {
            System.out.println("Medicine with ID " + id + " not found!");
            return 0.0;
        }
        System.out.println("Medicine Found: " + found.name + " | Price: " + found.price + " | Available Qty: " + found.quantity);
        System.out.print("Enter Quantity to sell: ");
        int sellQty = sc.nextInt();
        sc.nextLine();
        if(sellQty > found.quantity) {
            System.out.println("Not enough stock! Available: " + found.quantity);
            return 0.0;
        }
        found.quantity -= sellQty;
        double totalPrice = found.price * sellQty;
        System.out.println("\nSold " + sellQty + " units of " + found.name);
        System.out.println("Total Bill: " + totalPrice);
        return totalPrice;

    }
}
