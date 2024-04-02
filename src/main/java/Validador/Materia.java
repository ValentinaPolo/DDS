package Validador;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
