# Personal Expense Tracker

## 1. Project Overview
- **Project Name:** Personal Expense Tracker
- **Language:** Java
- **Interface:** Command-Line Interface (CLI)
- **Data Storage:** CSV file (`expenses.csv`)
- **Purpose:** To track, view, update, delete, and persist personal expenses.

---

## 2. Project Structure / Design
- **Expense.java**  
  Model class representing an expense with the following fields:  
  - `amount` (double)  
  - `date` (String, format yyyy-mm-dd)  
  - `note` (String)

- **ExpenseManager.java**  
  Handles CRUD operations (Create, Read, Update, Delete) and CSV file operations:  
  - `addExpense(Expense e)`  
  - `viewExpenses()`  
  - `updateExpense(int index, Expense e)`  
  - `deleteExpense(int index)`  
  - `saveToCSV(String filename)`  
  - `loadFromCSV(String filename)`

- **Main.java**  
  CLI menu interface allowing the user to interact with the program.  
  Menu options include add, view, update, delete, save, load, and exit.

---

## 3. Assumptions
- Date format is `yyyy-mm-dd`.
- Expense index starts at **0** for update/delete operations.
- CSV file name is `expenses.csv`.
- Categories and date filters are optional enhancements.
- Basic validation is included to prevent invalid index operations.

---

## 4. Sample Inputs/Outputs

**Sample Input:**  
Add Expense -> Amount: 250, Date: 2025-10-04, Note: Lunch

markdown
Copy code

**Sample Output:**  
Expense added successfully!
--- View Expenses ---
Index: 0, Amount: 250.0, Date: 2025-10-04, Note: Lunch



**CSV File Content:**  
250.0,2025-10-04,Lunch
1000.0,2025-10-05,Groceries
75.5,2025-10-05,Bus fare



---

## 5. Notes / Additional Information
- CLI is simple and menu-driven for ease of use.  
- Save/Load functionality ensures persistent storage across sessions.  
- Basic error handling is implemented for invalid indexes and file operations.  
- Built to meet all **must-have requirements** of the Evaao internship assignment.

---

## Author
**Antariksh Singh**
