package com.jhmk.jhmkestudianteservicio.Repositorio;

import com.jhmk.jhmkestudianteservicio.Entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
