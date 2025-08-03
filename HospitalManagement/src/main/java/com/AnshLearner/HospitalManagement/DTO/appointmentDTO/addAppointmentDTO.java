package com.AnshLearner.HospitalManagement.DTO.appointmentDTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class addAppointmentDTO {
     private String doctor;
   
    private String patient;
    private LocalDate date;
}