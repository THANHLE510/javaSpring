package com.example.examspringframework.controller;
import com.example.examspringframework.model.Vehicle;
import com.example.examspringframework.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Controller
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/catalog")
    public String viewCatalog(Model model) {
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);
        return "catalog";
    }

    @GetMapping("/admin/vehicles")
    public String viewAdminCatalog(Model model) {
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);
        return "admin/vehicles";
    }

    @GetMapping("/admin/vehicles/add")
    public String addVehicleForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "admin/add-vehicle";
    }

    @PostMapping("/admin/vehicles/add")
    public String addVehicle(@Valid @ModelAttribute Vehicle vehicle, BindingResult result) {
        if (result.hasErrors()) {
            return "admin/add-vehicle";
        }
        vehicleService.save(vehicle);
        return "redirect:/admin/vehicles";
    }

    @GetMapping("/admin/vehicles/edit/{id}")
    public String editVehicleForm(@PathVariable Integer id, Model model) {
        Vehicle vehicle = vehicleService.findById(id);
        if (vehicle != null) {
            model.addAttribute("vehicle", vehicle);
            return "admin/edit-vehicle";
        }
        return "redirect:/admin/vehicles";
    }

    @PostMapping("/admin/vehicles/edit/{id}")
    public String editVehicle(@PathVariable Integer id, @Valid @ModelAttribute Vehicle vehicle, BindingResult result) {
        if (result.hasErrors()) {
            return "admin/edit-vehicle";
        }
        vehicle.setVehicleId(id);
        vehicleService.save(vehicle);
        return "redirect:/admin/vehicles";
    }

    @GetMapping("/admin/vehicles/delete/{id}")
    public String deleteVehicle(@PathVariable Integer id) {
        vehicleService.delete(id);
        return "redirect:/admin/vehicles";
    }
}
