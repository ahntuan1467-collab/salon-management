package com.example.salonmanagement.model;

public class ProductUsage extends BaseEntity {
    private int bookingId;
    private String productName;
    private int quantity;
    private double unitPrice;

    public ProductUsage() {}
    public ProductUsage(int bookingId, String productName, int quantity, double unitPrice) {
        this.bookingId = bookingId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public double getTotal() { return quantity * unitPrice; }
}