package com.AnshLearner.HospitalManagement.Service.DoctorService;

import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.doctorDTO;
import com.AnshLearner.HospitalManagement.Entity.doctor;
import com.AnshLearner.HospitalManagement.Repository.doctorRepository;

@Service
public class doctorUpdateService {
    @Autowired
    doctorRepository repo;
    ModelMapper modelMapper =new ModelMapper();

    public doctorDTO UpdateDoctor(Map<String ,Object> update ,long id){
        doctor d=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Docotr Not Found"));
        if(update.containsKey("name")){
            d.setName((String)update.get("name"));

        }
        if(update.containsKey("email")){
            d.setEmail((String)update.get("email"));
            
        }
        if(update.containsKey("specification")){
            d.setSpecification((String)update.get("specification"));
            
        }
        if(update.containsKey("phoneNumber")){
            d.setPhoneNumber((Long)update.get("phoneNumber"));
            
        }
        repo.save(d);
        doctorDTO result =modelMapper.map(d,doctorDTO.class);
        return  result;
    }
}
