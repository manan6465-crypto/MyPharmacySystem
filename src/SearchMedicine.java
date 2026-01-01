import java.util.ArrayList;
import java.util.Scanner;

public class SearchMedicine {
    public static void searchMedicine(ArrayList<Main.Medicine>medicines, Scanner sc){
        Main.clearScreen();
        System.out.println("=== Search Medicine ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available!");
            return;
        }
        System.out.print("Enter Medicine Name to search: ");
        String nameInput = sc.nextLine();
        boolean found = false;

        for(Main.Medicine med : medicines) {
            if(med.name.equals(nameInput)) {
                System.out.println("-----------------------------");
                System.out.println("ID: " + med.id);
                System.out.println("Name: " + med.name);
                System.out.println("Price: " + med.price);
                System.out.println("Quantity: " + med.quantity);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Medicine not found!");
        }
        System.out.println("-----------------------------");
    }
}
