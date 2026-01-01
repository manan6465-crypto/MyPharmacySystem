import java.util.ArrayList;
import java.util.Scanner;

public class AddMedicine {
    public static <Medicine> void addMedicine(ArrayList<Main.Medicine>medicines, Scanner sc) {
        Main.clearScreen();
        System.out.println("==========Add New Medicine==========");
        System.out.print("Enter Medicine ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Medicine Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Medicine Price : ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity :");
        int quantity = sc.nextInt();
        sc.nextLine();
       Main.Medicine med = new Main.Medicine(id, name, price, quantity);
        medicines.add(med);
        System.out.println("\nMedicine '" + name + "' added successfully!");
    }
}
