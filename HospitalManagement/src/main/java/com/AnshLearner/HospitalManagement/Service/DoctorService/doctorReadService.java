package com.AnshLearner.HospitalManagement.Service.DoctorService;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.doctorDTO;
import com.AnshLearner.HospitalManagement.Entity.doctor;
import com.AnshLearner.HospitalManagement.Repository.doctorRepository;

@Service
public class doctorReadService {
    @Autowired
    doctorRepository repo;
    ModelMapper modelmapper =new ModelMapper();
    public doctorDTO ReadById(long id){
        doctor d=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Doctor Not Fouond"));
        doctorDTO result=modelmapper.map(d, doctorDTO.class);
        return result;
    }

      public List<doctorDTO> ReadByName(String name){
        List<doctor> d=repo.findByName(name);
       List <doctorDTO> result=new ArrayList<>();

       for(doctor i:d){
         result.add(modelmapper.map(i, doctorDTO.class));
       }
        return result;
    }

     public doctorDTO ReadByEmail(String email){
        doctor d=repo.findByEmail(email);
       doctorDTO result =modelmapper.map(d, doctorDTO.class);

        return result;
    }

    
     public doctorDTO ReadByPhoneNumber(Long phoneNumber){
        doctor d=repo.findByPhoneNumber(phoneNumber);
       doctorDTO result =modelmapper.map(d, doctorDTO.class);

        return result;
    }

    public List<doctorDTO> ReadBySpecification(String specification){
        List<doctor> d=repo.findBySpecification(specification);
       List <doctorDTO> result=new ArrayList<>();

       for(doctor i:d){
         result.add(modelmapper.map(i, doctorDTO.class));
       }
        return result;
    }


}
