package com.jhmk.jhmkestudianteservicio.Util;

import com.jhmk.jhmkestudianteservicio.Entidad.Estudiante;
import com.jhmk.jhmkestudianteservicio.Repositorio.EstudianteRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {

    private final EstudianteRepositorio estudianteRepositorio;

    public EstudianteSeeder(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (estudianteRepositorio.count() == 0) {

            Estudiante cat1 = new Estudiante(null, "jose", "sistemas", "incativo", 5);
            Estudiante cat2 = new Estudiante(null, "luis", "psicologia","activo", 2);


            estudianteRepositorio.save(cat1);
            estudianteRepositorio.save(cat2);


            System.out.println("Datos de Estudiante insertados correctamente.");
        } else {
            System.out.println("Las Estudiantes ya existen, no se insertaron datos.");
        }
    }

}
