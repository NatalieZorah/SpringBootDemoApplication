package com.genspark.SpringBootDemoApp2.Service;

import com.genspark.SpringBootDemoApp2.Dao.PatientDao;
import com.genspark.SpringBootDemoApp2.Entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;
    @Override
    public List<Patient> getAllPatients() {
        return this.patientDao.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) {

        Optional<Patient> p = this.patientDao.findById(patientId);
        Patient patient = null;
        if (p.isPresent()) {
            patient = p.get();
        } else {
            throw new RuntimeException("Course not found for id :: " + patientId);
        }
        return patient;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return this.patientDao.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return this.patientDao.save(patient);
    }

    @Override
    public String deletePatientById(int patientId) {
        this.patientDao.deleteById(patientId);
        return "Patient has been DELETED";
    }
}
