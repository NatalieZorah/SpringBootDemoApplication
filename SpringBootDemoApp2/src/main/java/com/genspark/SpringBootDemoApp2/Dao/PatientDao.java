package com.genspark.SpringBootDemoApp2.Dao;

import com.genspark.SpringBootDemoApp2.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient,Integer> {

}
