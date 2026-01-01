import java.util.ArrayList;

public class StockAlert {
    public static void checkLowStock(ArrayList<Main.Medicine>medicines){
        Main.clearScreen();
        System.out.println("=== Low Stock Alert ===");
        if(medicines.size() == 0) {
            System.out.println("No medicines available!");
            return;
        }
        boolean lowStockFound = false;
        for(Main.Medicine med : medicines) {
            if(med.quantity <= 5) {
                System.out.println("-----------------------------");
                System.out.println("ID: " + med.id);
                System.out.println("Name: " + med.name);
                System.out.println("Quantity: " + med.quantity);
                lowStockFound = true;
            }
        }
        if(!lowStockFound) {
            System.out.println("All medicines have sufficient stock.");
        }
        System.out.println("-----------------------------");
    }
}
