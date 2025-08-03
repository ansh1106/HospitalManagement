package com.AnshLearner.HospitalManagement.Service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.AnshLearner.HospitalManagement.DTO.PatientDTO.patientDTO;
import com.AnshLearner.HospitalManagement.Entity.patient;
import com.AnshLearner.HospitalManagement.Repository.patientRepo;

import java.time.LocalDate;
import java.util.Map;
import jakarta.transaction.Transactional;

@Service
public class patientUpdateService {
     private final patientRepo repo;
   ModelMapper modelMapper = new ModelMapper();

  

    public patientUpdateService(patientRepo repo){
        this.repo=repo;
    }

    @Transactional
    public patientDTO UpdatePatient(long id,Map<String ,Object> update){
      patient entity=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Patient Not Found"));
      if(update.containsKey("name")){
        entity.setName((String) update.get("name"));
      }
      if(update.containsKey("email")){
        entity.setEmail((String)update.get("email"));
      }
      if(update.containsKey("mobileNumber")){
        entity.setMobileNumber((Long)update.get("mobileNumber"));
      }
      if(update.containsKey("birthdate")){
        entity.setBirthdate(LocalDate.parse((String)update.get("birthdate")));
      }
      if(update.containsKey("gender")){
        entity.setGender((String)update.get("gender"));
      }
      repo.save(entity);
      patientDTO result=modelMapper.map(entity,patientDTO.class);
      return result;


    }
}
