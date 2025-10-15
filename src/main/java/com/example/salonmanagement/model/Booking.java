package com.example.salonmanagement.model;


import java.time.LocalDateTime;

public class Booking extends BaseEntity {
    private int customerId;
    private int serviceId;
    private LocalDateTime bookingTime;
    private String status; // Pending / Confirmed / Completed / Cancelled

    public Booking() {}
    public Booking(int customerId, int serviceId, LocalDateTime bookingTime, String status) {
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.bookingTime = bookingTime;
        this.status = status;
    }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public int getServiceId() { return serviceId; }
    public void setServiceId(int serviceId) { this.serviceId = serviceId; }

    public LocalDateTime getBookingTime() { return bookingTime; }
    public void setBookingTime(LocalDateTime bookingTime) { this.bookingTime = bookingTime; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}