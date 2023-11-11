import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    private List<Materia> materiasAprobadas;

    public Materia() {
        this.correlativas = new ArrayList<>();
        this.materiasAprobadas = new ArrayList<>();
    }

    public Materia(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarMateriaCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public void eliminarMateriaCorrelativa(Materia materia) {
        this.correlativas.remove(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public void eliminarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.remove(materia);
    }
}

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }

    public String aprobadaString() {
        if (aprobada()) {
            return "Aprobada";
        } else {
            return "Rechazada";
        }
    }
}
