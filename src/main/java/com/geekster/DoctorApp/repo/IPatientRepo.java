package com.geekster.DoctorApp.repo;

import com.geekster.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient , Long> {
    Patient findFirstByPatientEmail(String userEmail);
}
