package com.AnshLearner.HospitalManagement.Service.PatientService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.PatientDTO.patientDTO;
import com.AnshLearner.HospitalManagement.Entity.patient;
import com.AnshLearner.HospitalManagement.Repository.patientRepo;

import jakarta.transaction.Transactional;

@Service
public class patientReadService {
     private final patientRepo repo;
   ModelMapper modelMapper = new ModelMapper();

  

    public patientReadService(patientRepo repo) {
       this.repo=repo;
    }
    @Transactional
    public patientDTO ReadByID(long id){
        
            patient pt=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Patient Not found"));
            patientDTO result=modelMapper.map(pt, patientDTO.class);
       
            return result;
    }

    @Transactional
   public List<patientDTO> ReadByName(String name) {
    List<patient> p = repo.findByName(name);
    List<patientDTO> result = new ArrayList<>();
    for (patient entity : p) {
        result.add(modelMapper.map(entity, patientDTO.class));
    }
    return result;
}
 @Transactional
   public List<patientDTO> ReadByEmail(String email) {
    List<patient> p = repo.findByEmail(email);
    List<patientDTO> result = new ArrayList<>();
    for (patient entity : p) {
        result.add(modelMapper.map(entity, patientDTO.class));
    }
    return result;
}
 @Transactional
   public List<patientDTO> ReadByMobileNumber(long number) {
    List<patient> p = repo.findByMobileNumber(number);
    List<patientDTO> result = new ArrayList<>();
    for (patient entity : p) {
        result.add(modelMapper.map(entity, patientDTO.class));
    }
    return result;
}

@Transactional
   public List<patientDTO> ReadByDOB(LocalDate birthdate) {
    List<patient> p = repo.findByBirthdate(birthdate);
    List<patientDTO> result = new ArrayList<>();
    for (patient entity : p) {
        result.add(modelMapper.map(entity, patientDTO.class));
    }
    return result;
}
}
