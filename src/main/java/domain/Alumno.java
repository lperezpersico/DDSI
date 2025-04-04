package domain;
import java.util.Collections;
import java.util.HashSet;
import domain.Inscripcion;

public class Alumno {
    private String nombre;
    private HashSet<Materia> materiasAprobadas;
    //TODO ver como poner un set en el diagrama


    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
    }

    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean aprobo(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }
}
