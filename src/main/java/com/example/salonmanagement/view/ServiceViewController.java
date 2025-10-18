package com.example.salonmanagement.view;

import com.example.salonmanagement.entity.ServiceEntity;
import com.example.salonmanagement.service.impl.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/services")
public class ServiceViewController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public String home(Model model) {
        List<ServiceEntity> services = serviceService.getAllServices();
        model.addAttribute("services", services);
        model.addAttribute("totalPages", 1);  // sau này có thể dùng pagination
        model.addAttribute("currentPage", 1);
        return "service/list";  // trỏ tới templates/service/detail.html
    }

    @GetMapping("/image/{id}")
    @ResponseBody
    public ResponseEntity<byte[]> getImage(@PathVariable("id") Integer id) {
        byte[] image = serviceService.getImageById(id);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
}
