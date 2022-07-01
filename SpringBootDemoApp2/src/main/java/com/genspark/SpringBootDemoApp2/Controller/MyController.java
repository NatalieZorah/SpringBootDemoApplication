package com.genspark.SpringBootDemoApp2.Controller;

import com.genspark.SpringBootDemoApp2.Entity.Patient;
import com.genspark.SpringBootDemoApp2.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to the Patient Registry</H1></HTML>";
    }

    @GetMapping("/patients")
    public List<Patient> getPatients()
    {
        return this.patientService.getAllPatients();
    }

    @GetMapping("/patients/{patientId}")
    public Patient getPatient(@PathVariable String patientId) {
        return this.patientService.getPatientById(Integer.parseInt(patientId));
    }

    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient patient) {
        return this.patientService.addPatient(patient);
    }

    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody Patient patient) {
        return this.patientService.updatePatient(patient);
    }

    @DeleteMapping("/patients/{patientId}")
    public String deletePatient(@PathVariable String patientId) {
        return this.patientService.deletePatientById(Integer.parseInt(patientId));
    }

}
