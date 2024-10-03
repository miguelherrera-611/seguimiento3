package org.manuelmiguelsamuel.Aplication;

import org.carlos_arturo_baron.Aplication.Services.CitaService;
import org.carlos_arturo_baron.Aplication.Services.DoctorService;
import org.carlos_arturo_baron.Aplication.Services.PacienteService;
import org.carlos_arturo_baron.Infraestructure.FileCitasRepository;
import org.carlos_arturo_baron.Infraestructure.FileDoctorRepository;
import org.carlos_arturo_baron.Infraestructure.FilePacienteRepository;
import org.carlos_arturo_baron.Interfaces.CitasRepository;
import org.carlos_arturo_baron.Interfaces.DoctorRepository;
import org.carlos_arturo_baron.Interfaces.PacienteRepository;

public class Main {
    public static void main(String[] args) {
        PacienteRepository repository = new FilePacienteRepository();
        PacienteService service = new PacienteService(repository);
        

        DoctorRepository doctorRepository = new FileDoctorRepository();
        DoctorService service2 = new DoctorService(doctorRepository);

        CitasRepository citasRepository = new FileCitasRepository();
        CitaService service3 = new CitaService(citasRepository);


        Visual visual = new Visual(service,service2,service3);

        visual.iniciar();


    }
}
