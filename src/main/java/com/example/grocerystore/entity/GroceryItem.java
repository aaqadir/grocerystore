package com.example.grocerystore.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int availableCount;
    private int requiredCount;
    private Boolean placeOrder;
    private int orderQuantity;
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

    public GroceryItem() {
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public int getRequiredCount() {
        return requiredCount;
    }

    public void setRequiredCount(int requiredCount) {
        this.requiredCount = requiredCount;
    }

    public Boolean getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(Boolean placeOrder) {
        this.placeOrder = placeOrder;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
