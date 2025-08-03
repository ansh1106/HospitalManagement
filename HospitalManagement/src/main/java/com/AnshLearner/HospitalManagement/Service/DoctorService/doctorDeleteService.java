package com.AnshLearner.HospitalManagement.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnshLearner.HospitalManagement.Repository.doctorRepository;
@Service
public class doctorDeleteService {
    @Autowired
    doctorRepository repo;
    public void deleteDoctor(long id ){
        repo.deleteById(id);
    }
}