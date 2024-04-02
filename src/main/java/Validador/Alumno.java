package Validador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAp;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAp = new ArrayList<>();
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAp() {
        return materiasAp;
    }
    public Boolean cumpleCorrelativa(Materia materia) {
       return materiasAp.containsAll(materia.getMateriasCorrelativas());

    }
}
