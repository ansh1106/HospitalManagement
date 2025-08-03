package com.AnshLearner.HospitalManagement.Service.PatientService;

import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.Repository.patientRepo;

import jakarta.transaction.Transactional;

@Service
public class patientDeleteService {
    private final patientRepo repo;
    public patientDeleteService(patientRepo repo){
        this.repo=repo;
    }
    
    @Transactional
    public void DeletePatient(long id){
            repo.deleteById(id);
    }
}
