package com.example.salonmanagement.model;

public class Promotion extends BaseEntity {
    private String code;
    private String description;
    private double discountPercent;

    public Promotion() {}
    public Promotion(String code, String description, double discountPercent) {
        this.code = code;
        this.description = description;
        this.discountPercent = discountPercent;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getDiscountPercent() { return discountPercent; }
    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }
}