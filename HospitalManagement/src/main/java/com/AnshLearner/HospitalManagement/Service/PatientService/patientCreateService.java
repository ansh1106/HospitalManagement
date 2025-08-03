package com.AnshLearner.HospitalManagement.Service.PatientService;



import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.PatientDTO.AddpatientDTO;
import com.AnshLearner.HospitalManagement.DTO.PatientDTO.patientDTO;
import com.AnshLearner.HospitalManagement.Entity.patient;
import com.AnshLearner.HospitalManagement.Repository.patientRepo;

import jakarta.transaction.Transactional;



@Service
public class patientCreateService {
   private final  patientRepo repo;
   ModelMapper modelMapper = new ModelMapper();

  

    public patientCreateService(patientRepo repo) {
       this.repo=repo;
    }

    
    
    @Transactional
    public  patientDTO insertPatient(AddpatientDTO dto){
       patient var = modelMapper.map(dto, patient.class);
       var = repo.save(var);
       
       patientDTO resultDto = modelMapper.map(var, patientDTO.class);
       return resultDto;
    }
}