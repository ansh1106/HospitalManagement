package com.AnshLearner.HospitalManagement.Service.AppointmentService;

import java.time.LocalDate;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.AppointmentDTO;
import com.AnshLearner.HospitalManagement.Entity.appointment;
import com.AnshLearner.HospitalManagement.Repository.appointmentRepository;

import jakarta.transaction.Transactional;

@Service
public class appointmentUpdateService {
    @Autowired
    appointmentRepository repo;
    ModelMapper modelMapper=new ModelMapper();

    @Transactional
    public AppointmentDTO updateAppointment(Map<String,Object> update,long id){
       appointment d=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Appoint Not Found"));
         if(update.containsKey("doctor")){
            d.setDoctor((String)update.get("doctor"));

        }
        if(update.containsKey("patient")){
            d.setPatient((String)update.get("patient"));
            
        }
        if(update.containsKey("date")){
           d.setDate(LocalDate.parse((String)update.get("date")));
            
        }
        repo.save(d);
        AppointmentDTO result=modelMapper.map(d,AppointmentDTO.class);
        
        return result;
       
    }
}