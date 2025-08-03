package com.AnshLearner.HospitalManagement.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AnshLearner.HospitalManagement.DTO.PatientDTO.AddpatientDTO;
import com.AnshLearner.HospitalManagement.DTO.PatientDTO.patientDTO;
import com.AnshLearner.HospitalManagement.Service.PatientService.patientCreateService;
import com.AnshLearner.HospitalManagement.Service.PatientService.patientReadService;

import java.util.Map;

import com.AnshLearner.HospitalManagement.Service.PatientService.patientDeleteService;
import com.AnshLearner.HospitalManagement.Service.PatientService.patientUpdateService;


@RestController
public class patientController {
    //this is a patient Controller
    private patientCreateService ser;
    private patientReadService ser1;
    private patientUpdateService ser2;
    private patientDeleteService ser3;
    public patientController(patientCreateService ser,patientReadService ser1,patientUpdateService ser2,patientDeleteService ser3) {
        this.ser=ser;
        this.ser1=ser1;
        this.ser2=ser2;
        this.ser3=ser3;
    }
    

    

    //CREATE
    @PostMapping("/createPatient")
    public ResponseEntity<patientDTO> createPatient( @RequestBody  AddpatientDTO dto) {
       
        return ResponseEntity.status(HttpStatus.OK).body(ser.insertPatient(dto));
        
    }


    //READ
     @GetMapping("/SearchPatientById")
    public ResponseEntity<patientDTO> SearchPatientById(@RequestParam long id){
           return  ResponseEntity.status(HttpStatus.OK).body(ser1.ReadByID(id));
    }
    @GetMapping("/SearchPatientByName")
    public ResponseEntity<List<patientDTO>> SearchPatientByName(@RequestParam String name){
            return ResponseEntity.status(HttpStatus.OK).body(ser1.ReadByName(name));
    }

     @GetMapping("/SearchPatientByDOB")
    public ResponseEntity<List<patientDTO>> SearchPatientByDOB(@RequestParam LocalDate birthdate){
            return ResponseEntity.status(HttpStatus.OK).body(ser1.ReadByDOB(birthdate));
    }

      
    @GetMapping("/SearchPatientByEmail")
    public ResponseEntity<List<patientDTO>> SearchPatientByEmail(@RequestParam String email){
        return ResponseEntity.status(HttpStatus.OK).body(ser1.ReadByEmail(email));
    }
      @GetMapping("/SearchPatientByMobileNumber")
    public ResponseEntity<List<patientDTO>> SearchPatientByMobileNumber(@RequestParam Long mobileNumber){
               return ResponseEntity.status(HttpStatus.OK).body(ser1.ReadByMobileNumber(mobileNumber));
    }

    //Update-Patch Mapping
    @PatchMapping("/updatePatient/{id}")
     public ResponseEntity<patientDTO> updatePatient(@PathVariable long id,@RequestBody Map<String,Object> update ){
             return  ResponseEntity.status(HttpStatus.OK).body(ser2.UpdatePatient(id, update));
    }

    //delete
    @DeleteMapping("/deletePatient")
    public ResponseEntity<Void> deletePatient(@RequestParam long id ){
        ser3.DeletePatient(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

     
}