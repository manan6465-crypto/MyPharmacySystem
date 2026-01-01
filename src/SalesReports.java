import java.util.ArrayList;

public class SalesReports {
    public static void viewSalesReports(ArrayList<Double>sales){
        Main.clearScreen();
        System.out.println("=== Sales Report ===");
        if(sales.size() == 0) {
            System.out.println("No sales recorded yet!");
            return;
        }
        double totalSales = 0;
        for(int i = 0; i < sales.size(); i++) {
            System.out.println("Sale " + (i + 1) + ": " + sales.get(i));
            totalSales += sales.get(i);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Sales: " + totalSales);
        System.out.println("-----------------------------");
    }
}
