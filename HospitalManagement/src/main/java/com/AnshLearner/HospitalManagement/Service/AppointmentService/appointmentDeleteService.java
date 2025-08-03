package com.AnshLearner.HospitalManagement.Service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.Repository.appointmentRepository;

import jakarta.transaction.Transactional;

@Service
public class appointmentDeleteService {
    @Autowired
    appointmentRepository repo;

    @Transactional
    public void deleteAppointment(long id){
        repo.deleteById(id);
    }

}
