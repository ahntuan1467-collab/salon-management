package com.example.salonmanagement.repository;

import com.example.salonmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByNameContainingIgnoreCase(String name);
    List<Customer> findByPhoneContaining(String phone);
    List<Customer> findByMembershipTypeContainingIgnoreCase(String membershipType);
}