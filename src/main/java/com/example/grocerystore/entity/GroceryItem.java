package com.example.grocerystore.entity;


import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private Date packagingDate;
    private Date expiryDate;

//    @OneToOne
//    private InventoryLevel inventoryLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPackagingDate() {
        return packagingDate;
    }

    public void setPackagingDate(Date packagingDate) {
        this.packagingDate = packagingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", packagingDate=" + packagingDate +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public GroceryItem(int id, String name, double price, Date packagingDate, Date expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.packagingDate = packagingDate;
        this.expiryDate = expiryDate;
    }

    public GroceryItem() {
    }
}
