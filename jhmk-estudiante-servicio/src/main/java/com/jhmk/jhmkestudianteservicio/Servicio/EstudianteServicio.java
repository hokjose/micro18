package com.jhmk.jhmkestudianteservicio.Servicio;

import com.jhmk.jhmkestudianteservicio.Entidad.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteServicio {

    List<Estudiante> Listar();
    Optional<Estudiante> Buscar(Long id);
    Estudiante Guardar(Estudiante estudiante);
    Estudiante Modificar(Long id, Estudiante estudiante);
    void Eliminar(Long id);


}
