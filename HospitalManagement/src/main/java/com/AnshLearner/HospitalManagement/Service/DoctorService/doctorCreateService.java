package com.AnshLearner.HospitalManagement.Service.DoctorService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.AddDoctorDTO;
import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.doctorDTO;
import com.AnshLearner.HospitalManagement.Entity.doctor;
import com.AnshLearner.HospitalManagement.Repository.doctorRepository;

import jakarta.transaction.Transactional;

@Service
public class doctorCreateService {
    ModelMapper modelMapper =new ModelMapper();
    @Autowired
    doctorRepository repo;
 
    @Transactional
    public doctorDTO insertDoctor(AddDoctorDTO doctor){
        doctor d=modelMapper.map(doctor, doctor.class);
        repo.save(d);
        doctorDTO result=modelMapper.map(d, doctorDTO.class);
        return result;
        
    }
    
}