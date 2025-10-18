package com.example.salonmanagement.service.impl;

import com.example.salonmanagement.entity.ServiceEntity;
import com.example.salonmanagement.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository repository;

    public List<ServiceEntity> getAllServices() {
        return repository.findAll();
    }

}


