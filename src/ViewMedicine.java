import java.util.ArrayList;

public class ViewMedicine {
    public static void viewAllMedicine(ArrayList<Main.Medicine>medicines){
        Main.clearScreen();
        System.out.println("=== List of All Medicines ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available!");
            return;
        }
        for(Main.Medicine med : medicines) {
            System.out.println("-----------------------------");
            System.out.println("ID: " + med.id);
            System.out.println("Name: " + med.name);
            System.out.println("Price: " + med.price);
            System.out.println("Quantity: " + med.quantity);
        }
        System.out.println("-----------------------------");
    }
}
