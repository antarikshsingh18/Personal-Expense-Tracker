package model;
import java.time.LocalDate;

public class Expense {
    private int id;
    private double amount;
    private LocalDate date;
    private String note;
    private String category;

    public Expense(int id, double amount, LocalDate date, String note, String category){
        this.id=id;
        this.amount=amount;
        this.date=date;
        this.note=note;
        this.category=category;
    }
    public int getId() {return id;}
    public double getAmount(){return amount;}
    public LocalDate getDate(){return date;}
    public String getNote(){return note;}
    public String getCategory(){return category;}

    public void setAmount(double amount){this.amount=amount;}
    public void setDate(LocalDate date){this.date=date;}
    public void setNote(String note){this.note=note;}
    public void setCategory(String category){this.category=category;}

    @Override
    public String toString(){
        return String.format("ID:%d | Amount: %.2f | Date:%s | Note:%s | Category:%s",id,amount,date,note,category);
    }
}
