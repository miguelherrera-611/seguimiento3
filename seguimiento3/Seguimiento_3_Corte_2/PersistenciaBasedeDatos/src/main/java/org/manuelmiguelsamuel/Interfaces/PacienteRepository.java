package org.manuelmiguelsamuel.Interfaces;

import org.carlos_arturo_baron.Domain.Paciente;

import java.util.List;

public interface PacienteRepository {
    void save(Paciente paciente);
    void update(Paciente paciente);

    void delete(int id);

    Paciente findById(long id);
    List<Paciente> findAll();
}
