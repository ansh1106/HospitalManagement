package com.AnshLearner.HospitalManagement.Service.AppointmentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.AppointmentDTO;
import com.AnshLearner.HospitalManagement.Entity.appointment;
import com.AnshLearner.HospitalManagement.Repository.appointmentRepository;

@Service
public class appointmentReadService {
    @Autowired
    appointmentRepository repo;
    ModelMapper modelMapper=new ModelMapper();

    //BYID
    public AppointmentDTO readById(long id){
        appointment a=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Appoint Not Found"));
        AppointmentDTO result =modelMapper.map(a,AppointmentDTO.class);
        return result;
    }

    //BY Doctor Name
      public List<AppointmentDTO> readByDoctorName(String name ){
        List<appointment> a=repo.findByDoctor(name);
        List<AppointmentDTO> result =new ArrayList<>();
        for(appointment i:a){
            result.add( modelMapper.map(i,AppointmentDTO.class));
        }
        return result;
    }

    //By ptient Name

    public List<AppointmentDTO> readByPatientName(String name ){
        List<appointment> a=repo.findByPatient(name);
        List<AppointmentDTO> result =new ArrayList<>();
        for(appointment i:a){
            result.add( modelMapper.map(i,AppointmentDTO.class));
        }
        return result;
    }

    //By Local Date

     public List<AppointmentDTO> readByDate(LocalDate date ){
        List<appointment> a=repo.findByDate(date);
        List<AppointmentDTO> result =new ArrayList<>();
        for(appointment i:a){
            result.add( modelMapper.map(i,AppointmentDTO.class));
        }
        return result;
    }
}
