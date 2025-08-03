package com.AnshLearner.HospitalManagement.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AnshLearner.HospitalManagement.Entity.patient;

public interface patientRepo extends JpaRepository<patient,Long> {

   
     
    List<patient> findByName(String name);
      List<patient> findByEmail(String email);
        List<patient> findByMobileNumber(long  num);
        List<patient> findByBirthdate(LocalDate birthdate);
}
