package com.AnshLearner.HospitalManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AnshLearner.HospitalManagement.Entity.doctor;

public interface doctorRepository extends JpaRepository<doctor,Long>{

    List<doctor> findByName(String name);

    doctor findByEmail(String email);

    public doctor findByPhoneNumber(Long phoneNumber);

    List<doctor> findBySpecification(String specification);
    
}