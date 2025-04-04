package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest1 {
    @Test
    public void inscripcionAceptada() {
        Alumno alumno = new Alumno("Lucía");

        Materia anaSist = new Materia("anaSist");
        Materia sistOp = new Materia("sistOp");
        Materia fis1 = new Materia("fis1");
        Materia comuDatos = new Materia("comuDatos");

        Set<Materia> materiasInscriptas = new HashSet<>();
        materiasInscriptas.add(comuDatos);
        materiasInscriptas.add(anaSist);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);

        alumno.agregarMateriasAprobadas(sistOp, fis1);
        comuDatos.agregarCorrelativas(sistOp, fis1);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada() {

        Alumno alumno = new Alumno("Lucía");

        Materia diseSist = new Materia("diseSist");
        Materia anaSist = new Materia("anaSist");
        Materia sistOp = new Materia("sistOp");
        Materia fis1 = new Materia("fis1");
        Materia comuDatos = new Materia("comuDatos");

        Set<Materia> materiasInscriptas = new HashSet<>();
        materiasInscriptas.add(comuDatos);
        materiasInscriptas.add(diseSist);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);

        alumno.agregarMateriasAprobadas(sistOp, fis1);
        comuDatos.agregarCorrelativas(sistOp, fis1);
        diseSist.agregarCorrelativas(anaSist);

        assertFalse(inscripcion.aprobada());
    }
}
