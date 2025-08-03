package com.AnshLearner.HospitalManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class appointment {
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
    private String doctor;
   
    private String patient;
    private LocalDate date;
}