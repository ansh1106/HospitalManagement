package com.AnshLearner.HospitalManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Entity annotation marks the patient class as a JPA Entity
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class patient {
    //@Id annotation define long id field as the primary key of the ENtity
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private long mobileNumber;
    private String gender;
    private LocalDate birthdate;
    private String email;
}