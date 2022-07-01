package com.genspark.SpringBootDemoApp2.Service;

import com.genspark.SpringBootDemoApp2.Entity.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();
    Patient getPatientById(int patientId);
    Patient addPatient(Patient patient);
    Patient updatePatient(Patient patient);
    String deletePatientById(int patientId);
}
