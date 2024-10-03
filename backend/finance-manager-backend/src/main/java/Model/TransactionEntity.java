package Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementation/generation of primary key
    private long id; // primary key

    private String type;  // Type of transaction: income or expense.
    private String category;  // Category of the transaction.
    private double amount;  // Amount of money involved in the transaction.
    private LocalDate date;  // Date of the transaction.
    private String description;  // Additional notes about the transaction.

    // User has multiple Transactions, define a one-to-many relationship between User and Transaction
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
