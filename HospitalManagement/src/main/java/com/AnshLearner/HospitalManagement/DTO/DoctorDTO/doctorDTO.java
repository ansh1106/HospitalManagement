package com.AnshLearner.HospitalManagement.DTO.DoctorDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class doctorDTO {
    private long id;
    private String name;
    private String email;
    private String  specification;
    private long phoneNumber;
}