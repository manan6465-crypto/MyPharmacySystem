import java.util.ArrayList;
import java.util.Scanner;

public class DeleteMedicine {
    public static void deleteMedicine(ArrayList<Main.Medicine>medicines, Scanner sc){
        Main.clearScreen();
        System.out.println("=== Delete Medicine ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available to delete!");
            return;
        }
        System.out.print("Enter Medicine ID to delete: ");
        int idInput = sc.nextInt();
        sc.nextLine();
        Main.Medicine found = null;
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
        medicines.remove(found);
        System.out.println("Medicine '" + found.name + "' deleted successfully!");
    }
}
