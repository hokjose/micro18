package com.jhmk.jhmkestudianteservicio.Controlador;

import com.jhmk.jhmkestudianteservicio.Entidad.Estudiante;
import com.jhmk.jhmkestudianteservicio.Servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteServicio;

    // Obtener todas las Apoderados
    @GetMapping
    public ResponseEntity<List<Estudiante>> listarApoderado() {
        List<Estudiante> apoderados = estudianteServicio.Listar();
        return new ResponseEntity<>(apoderados, HttpStatus.OK);
    }

    // Obtener una Apoderado por ID
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> buscarApoderado(@PathVariable Long id) {
        Optional<Estudiante> apoderado = estudianteServicio.Buscar(id);
        return apoderado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear una nueva Apoderado
    @PostMapping
    public ResponseEntity<Estudiante> guardarApoderado(@RequestBody Estudiante apoderado) {
        Estudiante nuevoApoderado = estudianteServicio.Guardar(apoderado);
        return new ResponseEntity<>(nuevoApoderado, HttpStatus.CREATED);
    }


    // Actualizar o modificar una Apoderado existente
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> modificarApoderado(@PathVariable Long id, @RequestBody Estudiante apoderado) {
        Estudiante apoderadoModificado = estudianteServicio.Modificar(id, apoderado);
        return apoderadoModificado != null ? new ResponseEntity<>(apoderadoModificado, HttpStatus.OK)
                : ResponseEntity.notFound().build();
    }

    // Eliminar una Apoderado por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Estudiante> eliminarApoderado(@PathVariable Long id) {
        estudianteServicio.Eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
