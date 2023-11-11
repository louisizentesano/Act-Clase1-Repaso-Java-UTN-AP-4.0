import java.util.ArrayList;

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
public boolean puedeCursar(Alumno alumno) {
        if (this.getCorrelativas().isEmpty()) {
            return true;
        } else {
            for (Materia correlativa : this.getCorrelativas()) {
                if (  this.materiasAprobadas.contains(correlativa)) {
                    return false;
                }
            }
            return true;
        }
    }

}
