import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static class Medicine {
        int id;
        String name;
        double price;
        int quantity;

        public Medicine(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
    public static void clearScreen() {
        for (int i = 0; i < 30; i++) System.out.println();
    }
static ArrayList<Double> sales = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Main.Medicine>medicines = new ArrayList<>();
        int choice;
        do {
            clearScreen();
            System.out.println("=== Pharmacy Management System ===");
            System.out.println("1. Add Medicine");
            System.out.println("2. View All Medicines");
            System.out.println("3. Sell Medicine");
            System.out.println("4. Search Medicine");
            System.out.println("5. Update Medicine");
            System.out.println("6. Delete Medicine");
            System.out.println("7. Low Stock Alert");
            System.out.println("8. Sales Report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    AddMedicine.addMedicine(medicines, sc);
                    break;
                case 2:
                    ViewMedicine.viewAllMedicine(medicines);
                    break;
                case 3:
                    double total = SellMedicine.sellMedicine(medicines, sc, sales);
                    if(total > 0) {
                        sales.add(total);
                    }
                    break;
                case 4:
                    SearchMedicine.searchMedicine(medicines, sc);
                    break;
                case 5:
                    UpdateMedicine.updateMedicine(medicines, sc);
                    break;
                case 6:
                    DeleteMedicine.deleteMedicine(medicines, sc);
                    break;
                case 7:
                    StockAlert.checkLowStock(medicines);
                    break;
                case 8:
                    SalesReports.viewSalesReports(sales);
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

            System.out.println("\nPress Enter to continue...");
            sc.nextLine();

        } while(choice != 0);

        sc.close();
    }
}