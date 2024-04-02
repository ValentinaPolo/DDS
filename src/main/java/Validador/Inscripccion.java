package Validador;

import java.util.ArrayList;
import java.util.List;

public class Inscripccion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripccion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Boolean aprobada(){
        for(Materia materia: materias){
            if(!alumno.cumpleCorrelativa(materia)){
                return false;
            }
            if(alumno.getMateriasAp().contains(materia)){
                return false;
            }

        }
        return true;
    }
}
