package com.example.salonmanagement.model;

public class Staff extends BaseEntity {
    private String name;
    private String position;
    private double salary;

    public Staff() {}
    public Staff(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
