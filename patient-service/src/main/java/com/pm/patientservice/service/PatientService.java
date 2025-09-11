package com.pm.patientservice.service;

import com.pm.patientservice.repository.PatientRespository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private PatientRespository patientRespository;

    public PatientService(PatientRespository patientRepository){
        this.patientRespository = patientRepository;
    }

}
