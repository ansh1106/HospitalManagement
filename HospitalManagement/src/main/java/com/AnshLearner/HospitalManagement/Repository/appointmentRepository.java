package com.AnshLearner.HospitalManagement.Repository;

import java.time.LocalDate;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.AnshLearner.HospitalManagement.Entity.appointment;

public interface appointmentRepository extends JpaRepository<appointment, Long>{

    List<appointment> findByDoctor(String name);

     List<appointment> findByPatient(String name);

     List<appointment> findByDate(LocalDate date);
    
}