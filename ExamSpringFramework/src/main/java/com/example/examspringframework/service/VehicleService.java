package com.example.examspringframework.service;
import com.example.examspringframework.model.Vehicle;
import com.example.examspringframework.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void delete(Integer id) {
        vehicleRepository.deleteById(id);
    }

    public Vehicle findById(Integer id) {
        return vehicleRepository.findById(id).orElse(null);
    }
}
