package service;

import model.Expense;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseManager {
    private List<Expense>expenses=new ArrayList<>();
    private int nextId=1;
    private static final String FILE_NAME="expense.csv";

    public ExpenseManager(){
        loadExpenses();
    }
    public void addExpense(double amount, LocalDate date, String note, String category){
        if (amount<=0){
            System.out.println("Invalid amount.");
            return;
        }
        Expense exp=new Expense(nextId++, amount, date, note, category);
        expenses.add(exp);
        saveExpenses();
        System.out.println("Expense added.");
    }
    public void viewExpenses(){
        if (expenses.isEmpty()){
            System.out.println("No expenses found.");
            return;
        }
        expenses.forEach(System.out::println);
    }
    public void updateExpense(int id, double amount, LocalDate date, String note, String category){
        for (Expense exp:expenses){
            if (exp.getId()==id){
                exp.setAmount(amount);
                exp.setDate(date);
                exp.setNote(note);
                exp.setCategory(category);
                saveExpenses();
            }
        }
        System.out.println("Expense not found.");
    }
    public void deleteExpense(int id){
        expenses.removeIf(exp->exp.getId()==id);
        saveExpenses();
        System.out.println("Expense deleted.");
    }
    private void saveExpenses(){
        try(PrintWriter pw=new PrintWriter(new FileWriter(FILE_NAME))){
            for(Expense exp: expenses){
                pw.println(exp.getId()+","+exp.getAmount()+","+exp.getDate()+","+exp.getNote()+","+exp.getCategory());
            }
        }catch (IOException e){
            System.out.println("Error saving file: "+e.getMessage());
        }
    }
    private void loadExpenses() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Expense exp = new Expense(
                        Integer.parseInt(data[0]),
                        Double.parseDouble(data[1]),
                        LocalDate.parse(data[2]),
                        data[3],
                        data[4]
                );
                expenses.add(exp);
                nextId = Math.max(nextId, exp.getId() + 1);
            }
        } catch (IOException e) {
        }
    }
    public void showSummary(){
        double total=expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total spent: "+total);

        Map<String, Double> byCategory=new HashMap<>();
        for (Expense exp: expenses){
            byCategory.put(exp.getCategory(), byCategory.getOrDefault(exp.getCategory(), 0.0)+exp.getAmount());
        }
        System.out.println("Spent by Category: "+byCategory);
    }
}
