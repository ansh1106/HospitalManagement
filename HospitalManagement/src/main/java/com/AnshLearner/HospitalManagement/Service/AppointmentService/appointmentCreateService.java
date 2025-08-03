package com.AnshLearner.HospitalManagement.Service.AppointmentService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.AppointmentDTO;
import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.addAppointmentDTO;
import com.AnshLearner.HospitalManagement.Entity.appointment;
import com.AnshLearner.HospitalManagement.Repository.appointmentRepository;

import jakarta.transaction.Transactional;

@Service
public class appointmentCreateService {
    @Autowired
    appointmentRepository repo;
    ModelMapper modelMapper =new ModelMapper();

    @Transactional
    public AppointmentDTO newAppointment(addAppointmentDTO appoint){
        appointment a=modelMapper.map(appoint, appointment.class);
        a=repo.save(a);
        AppointmentDTO result=modelMapper.map(a, AppointmentDTO.class);
        return result;
    }
}