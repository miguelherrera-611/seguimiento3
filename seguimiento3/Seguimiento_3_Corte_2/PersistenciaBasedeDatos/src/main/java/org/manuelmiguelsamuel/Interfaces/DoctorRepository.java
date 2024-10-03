package org.manuelmiguelsamuel.Interfaces;

import org.carlos_arturo_baron.Domain.Doctor;

import java.util.List;

public interface DoctorRepository {
    void saveDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);

    void deleteDoctor(int id);

    Doctor findDoctorById(int id);
    List<Doctor> findAll();
}
