# Personal-Expense-Tracker
A simple **Java CLI application** to manage daily personal expenses.  
Users can **add, view, update, delete expenses**, and **save/load them in a CSV file**.  
---
## Features
- ✅ Add expense (amount, date, note)  
- ✅ View all expenses  
- ✅ Update an expense by index  
- ✅ Delete an expense by index  
- ✅ Save expenses to CSV file  
- ✅ Load expenses from CSV file  
- ✅ Basic validation & error handling  
- ⚡ Optional: Predefined categories for expenses  
- ⚡ Optional: Filter expenses by date  
- 💻 Simple CLI menu interface  
---
## Tech Stack
- Java (CLI application)  
- File I/O (CSV storage)  
- Object-Oriented Programming (OOP)  
---
## How to Run
1. Clone the repository or unzip the project files.  
2. Open the project in **IntelliJ IDEA** (or any Java IDE).  
3. Run the `Main.java` file.  
4. Follow the CLI menu options to add, view, update, delete, save, and load expenses.
---
## CLI Menu Sample

--- Personal Expense Tracker ---

1. Add Expense
2. View Expenses
3. Update Expense
4. Delete Expense
5. Save to CSV
6. Load from CSV
7. Exit

Choose an option: 1
Enter amount: 250
Enter date (yyyy-mm-dd): 2025-10-04
Enter note: Lunch
Expense added successfully!

--- View Expenses ---
Index: 0, Amount: 250.0, Date: 2025-10-04, Note: Lunch

---
## Sample CSV Output
250.0,2025-10-04,Lunch

---
## Assumptions
- Date format is `yyyy-mm-dd`.  
- Expense index starts at **0** for updates/deletes.  
- CSV file name is `expenses.csv`.  
- Categories and date filters are optional features.  
---
## Author
**Antariksh Singh**
