package com.example.salonmanagement.controller;

import com.example.salonmanagement.entity.ServiceEntity;
import com.example.salonmanagement.service.impl.ServiceService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<ServiceEntity> getAllServices() {
        return serviceService.getAllServices();
    }

    // Tạo mới service có upload ảnh
    @PostMapping(consumes = "multipart/form-data")
    public ServiceEntity createService(
            @RequestParam("serviceName") String serviceName,
            @RequestParam("category") ServiceEntity.Category category,
            @RequestParam("price") Integer price,
            @RequestParam("duration") Integer duration,
            @RequestParam("status") ServiceEntity.Status status,
            @RequestParam("image") MultipartFile image
    ) throws IOException {
        ServiceEntity service = new ServiceEntity();
        service.setServiceName(serviceName);
        service.setCategory(category);
        service.setPrice(price);
        service.setDuration(duration);
        service.setStatus(status);
        service.setImage(image.getBytes());
        return serviceService.saveService(service);
    }

    // Cập nhật dịch vụ (từng phần)
    @PutMapping(value = "/edit/{id}", consumes = "multipart/form-data")
    public ServiceEntity updateService(
            @PathVariable Integer id,
            @RequestParam(required = false) String serviceName,
            @RequestParam(required = false) ServiceEntity.Category category,
            @RequestParam(required = false) Integer price,
            @RequestParam(required = false) Integer duration,
            @RequestParam(required = false) ServiceEntity.Status status,
            @RequestParam(required = false) MultipartFile image
    ) throws IOException {
        return serviceService.updateService(id, serviceName, category, price, duration, status, image);
    }

    @GetMapping("/{id}")
    public ServiceEntity getServiceById(@PathVariable Integer id) {
        return serviceService.getServiceById(id)
                .orElseThrow(() -> new RuntimeException("Service not found"));
    }

}
