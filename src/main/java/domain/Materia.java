package domain;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<Materia>();
    }
    //TODO se pone el constructor en el diagrama?

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarCorrelativas(Materia ... materias) {
        Collections.addAll(this.materiasCorrelativas, materias);
    }
}
