import java.util.ArrayList;
import java.util.Scanner;

public class UpdateMedicine {
    public static void updateMedicine(ArrayList<Main.Medicine>medicines, Scanner sc){
        Main.clearScreen();
        System.out.println("=== Update Medicine ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available to update!");
            return;
        }
        System.out.print("Enter Medicine ID to update: ");
        int idInput = sc.nextInt();
        sc.nextLine();
       Main. Medicine found = null;
        for(Main.Medicine med : medicines) {
            if(med.id == idInput) {
                found = med;
                break;
            }
        }
        if(found == null) {
            System.out.println("Medicine with ID " + idInput + " not found!");
            return;
        }
        System.out.println("Medicine Found: " + found.name);
        System.out.println("1. Update Price");
        System.out.println("2. Update Quantity");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1) {
            System.out.print("Enter new price: ");
            double newPrice = sc.nextDouble();
            sc.nextLine();
            found.price = newPrice;
            System.out.println("Price updated successfully!");
        } else if(choice == 2) {
            System.out.print("Enter new quantity: ");
            int newQty = sc.nextInt();
            sc.nextLine();
            found.quantity = newQty;
            System.out.println("Quantity updated successfully!");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
