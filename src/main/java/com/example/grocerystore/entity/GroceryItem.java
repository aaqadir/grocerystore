package com.example.grocerystore.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
//    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd")
//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
//    private LocalDate packagingDate;

//    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd")
//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
//    private LocalDate expiryDate;

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

//    public LocalDate getPackagingDate() {
//        return packagingDate;
//    }
//
//    public void setPackagingDate(LocalDate packagingDate) {
//        this.packagingDate = packagingDate;
//    }
//
//    public LocalDate getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(LocalDate expiryDate) {
//        this.expiryDate = expiryDate;
//    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
//                ", packagingDate=" + packagingDate +
//                ", expiryDate=" + expiryDate +
                '}';
    }

    public GroceryItem(int id, String name, double price, LocalDate packagingDate, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
//        this.packagingDate = packagingDate;
//        this.expiryDate = expiryDate;
    }

    public GroceryItem() {
    }
}
