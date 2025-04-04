package domain;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import domain.Materia;
import domain.Alumno;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;

    public Inscripcion(Alumno alumno, Set<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada () {
        for (Materia materia : this.materias) {
            for (Materia correlativa : materia.getMateriasCorrelativas()) {
                if (!alumno.aprobo(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }
}