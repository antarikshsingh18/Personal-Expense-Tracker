import service.ExpenseManager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Update Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Summary Report");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.print("Enter note: ");
                    String note = sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    manager.addExpense(amount, date, note, category);
                }
                case 2 -> manager.viewExpenses();
                case 3 -> {
                    System.out.print("Enter expense ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter new date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.print("Enter new note: ");
                    String note = sc.nextLine();
                    System.out.print("Enter new category: ");
                    String category = sc.nextLine();
                    manager.updateExpense(id, amount, date, note, category);
                }
                case 4 -> {
                    System.out.print("Enter expense ID to delete: ");
                    int id = sc.nextInt();
                    manager.deleteExpense(id);
                }
                case 5 -> manager.showSummary();
                case 0 -> {
                    System.out.println("Goodbye.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}