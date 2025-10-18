package com.example.salonmanagement.repository;

import com.example.salonmanagement.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {

    // Tìm kiếm theo tên (chứa ký tự)
    List<ServiceEntity> findByServiceNameContainingIgnoreCase(String name);
}

