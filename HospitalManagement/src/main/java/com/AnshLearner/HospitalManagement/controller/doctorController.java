package com.AnshLearner.HospitalManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.AddDoctorDTO;
import com.AnshLearner.HospitalManagement.DTO.DoctorDTO.doctorDTO;
import com.AnshLearner.HospitalManagement.Service.DoctorService.doctorCreateService;
import com.AnshLearner.HospitalManagement.Service.DoctorService.doctorDeleteService;
import com.AnshLearner.HospitalManagement.Service.DoctorService.doctorReadService;
import com.AnshLearner.HospitalManagement.Service.DoctorService.doctorUpdateService;

@RestController
public class doctorController {
    @Autowired
    doctorCreateService ser1;
    @Autowired
    doctorReadService ser2;
    @Autowired
    doctorUpdateService ser3;
    @Autowired
    doctorDeleteService ser4;
    

    //Create
    @PostMapping("createDoctor")
    public ResponseEntity<doctorDTO> createDoctor(@RequestBody AddDoctorDTO doctor ){
            return ResponseEntity.status(HttpStatus.OK).body(ser1.insertDoctor(doctor));
    }

    //Read
    @GetMapping("searchDoctorById")
     public ResponseEntity<doctorDTO> SearchDoctorById(@RequestParam Long id ){
            return ResponseEntity.status(HttpStatus.OK).body(ser2.ReadById(id));
    }

     @GetMapping("searchDoctorByName")
    public ResponseEntity<List<doctorDTO>> SearchDoctorByName(@RequestParam String name ){
            return ResponseEntity.status(HttpStatus.OK).body(ser2.ReadByName(name));
    }
     @GetMapping("searchDoctorByEmail")
    public ResponseEntity<doctorDTO> SearchDoctorByEmail(@RequestParam String email ){
            return ResponseEntity.status(HttpStatus.OK).body(ser2.ReadByEmail(email));
    }

     @GetMapping("searchDoctorByPhoneNumber")
    public ResponseEntity<doctorDTO> SearchDoctorByPhoneNumber(@RequestParam Long phoneNumber ){
            return ResponseEntity.status(HttpStatus.OK).body(ser2.ReadByPhoneNumber(phoneNumber));
    }
    
     @GetMapping("searchDoctorBySpecification")
    public ResponseEntity<List<doctorDTO>> SearchDoctorBySpecification(@RequestParam String specification ){
            return ResponseEntity.status(HttpStatus.OK).body(ser2.ReadBySpecification(specification));
    }

    //update
     @PatchMapping("updateDoctor/{id}")
    public ResponseEntity<doctorDTO> updateDoctor( @PathVariable long id ,@RequestBody Map<String ,Object> update){
            return ResponseEntity.status(HttpStatus.OK).body(ser3.UpdateDoctor(update, id));
    }
    //delete
    @DeleteMapping("deleteDoctor")
    public ResponseEntity<Void> updateDoctor(@RequestParam long id) {
        ser4.deleteDoctor(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }



}