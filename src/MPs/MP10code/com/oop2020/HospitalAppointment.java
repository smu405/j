package com.oop2020;

import java.time.LocalDateTime;

public class HospitalAppointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dt;

    public HospitalAppointment(Doctor d, Patient p, LocalDateTime dt) {
        doctor = d;
        patient = p;
        this.dt = dt;
    }

    public String toString() {
        return dt.toString() + "\n"
                + doctor.toString() + "\n"
                + patient.toString();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getDateTime() {
        return dt;
    }
}
