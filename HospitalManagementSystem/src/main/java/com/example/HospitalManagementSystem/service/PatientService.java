package com.example.HospitalManagementSystem.service;

import com.example.HospitalManagementSystem.entity.Patient;
import com.example.HospitalManagementSystem.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }
}