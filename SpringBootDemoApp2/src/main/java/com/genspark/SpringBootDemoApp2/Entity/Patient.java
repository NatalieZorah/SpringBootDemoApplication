package com.genspark.SpringBootDemoApp2.Entity;

import javax.persistence.*;

@Entity
@Table
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PatientId;
    private String Name;
    private String Room;

    public Patient(){}

    public Patient(String name, String room) {
        Name = name;
        Room = room;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public String getRoom() {return Room;}

    public void setRoom(String room) {Room = room;}
}
