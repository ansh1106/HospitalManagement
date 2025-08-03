package com.AnshLearner.HospitalManagement.DTO.PatientDTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class patientDTO {
     private int id;
     private String name;
    private long mobileNumber;
    private String gender;
    private LocalDate birthdate;
    private String email;
}