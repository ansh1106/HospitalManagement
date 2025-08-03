package com.AnshLearner.HospitalManagement.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.AppointmentDTO;
import com.AnshLearner.HospitalManagement.DTO.appointmentDTO.addAppointmentDTO;
import com.AnshLearner.HospitalManagement.Service.AppointmentService.appointmentCreateService;
import com.AnshLearner.HospitalManagement.Service.AppointmentService.appointmentDeleteService;
import com.AnshLearner.HospitalManagement.Service.AppointmentService.appointmentReadService;
import com.AnshLearner.HospitalManagement.Service.AppointmentService.appointmentUpdateService;

@RestController
public class appointmentController {
    @Autowired
    appointmentCreateService ser1;
    @Autowired
    appointmentReadService ser2;
    @Autowired
    appointmentUpdateService ser3;
    @Autowired
    appointmentDeleteService ser4;

    // create
    @PostMapping("createAppointment")
    public ResponseEntity<AppointmentDTO> createAppointment(@RequestBody addAppointmentDTO appoint) {
        return ResponseEntity.status(HttpStatus.OK).body(ser1.newAppointment(appoint));
    }

    // Read
    @GetMapping("readById")
    public ResponseEntity<AppointmentDTO> getAppointmentById(@RequestParam long id) {
        return ResponseEntity.status(HttpStatus.OK).body(ser2.readById(id));
    }

    @GetMapping("readByDoctorName")
    public ResponseEntity<List<AppointmentDTO>> getAppointmentByDoctorName(@RequestParam String name) {
        return ResponseEntity.status(HttpStatus.OK).body(ser2.readByDoctorName(name));
    }

    @GetMapping("readByPatientName")
    public ResponseEntity<List<AppointmentDTO>> getAppointmentByPatientName(@RequestParam String name) {
        return ResponseEntity.status(HttpStatus.OK).body(ser2.readByPatientName(name));
    }

    @GetMapping("readByDate")
    public ResponseEntity<List<AppointmentDTO>> getAppointmentByDate(@RequestParam LocalDate date) {
        return ResponseEntity.status(HttpStatus.OK).body(ser2.readByDate(date));
    }
    
    //update
    @PatchMapping("UpdateAppointment")
    public ResponseEntity<AppointmentDTO> UpdateAppointment(@RequestParam long id,@RequestBody Map<String ,Object> update) {
        return ResponseEntity.status(HttpStatus.OK).body(ser3.updateAppointment(update, id));
    }

    //delete
    @DeleteMapping("deleteAppointment")
    public ResponseEntity<Void> DeleteAppointment(@RequestParam long id) {
        ser4.deleteAppointment(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}