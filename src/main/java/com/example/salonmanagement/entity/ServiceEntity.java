package com.example.salonmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "service")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ServiceId;

    @Lob
    @Column(columnDefinition = "LONGBLOB", nullable = false)
    private byte[] Image;

    @Column(nullable = false, length = 100)
    private String serviceName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer duration;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    // Enum cho Category
    public enum Category {
        Haircut, Skincare, Nail, Makeup, Massage
    }

    // Enum cho Status
    public enum Status {
        ACTIVE, INACTIVE
    }

}
