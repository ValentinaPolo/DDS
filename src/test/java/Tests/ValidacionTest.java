package Tests;

import Validador.Alumno;
import Validador.Inscripccion;
import Validador.Materia;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidacionTest {

private Materia analisisMatI,mateDiscreta, arquitectura, pdp, ssoo, algebra, algoritmos, analisisMatII;
@Before
    public void setup() {
    algoritmos = new Materia("Algoritmos");
    arquitectura = new Materia("Arquitectura");
    mateDiscreta = new Materia("MatematicaDiscreta");
    analisisMatI = new Materia("AnalisisMatematicoI");
    analisisMatII = new Materia("AnalisisMatematicoII");
    algebra = new Materia("Algebra");
    pdp = new Materia("ParadigmasDeProgramacion");
    ssoo = new Materia("SistemasOperativos");
    analisisMatII.getMateriasCorrelativas().add(analisisMatI);
    analisisMatII.getMateriasCorrelativas().add(algebra);
    pdp.getMateriasCorrelativas().add(algoritmos);
    pdp.getMateriasCorrelativas().add(mateDiscreta);
    ssoo.getMateriasCorrelativas().add(algoritmos);
    ssoo.getMateriasCorrelativas().add(arquitectura);

}
@Test
public void cumpleCorrelativa5(){
    Alumno alumno = createAlumno("Davina", mateDiscreta, analisisMatI);
    Inscripccion inscripccion = createInscripccion(alumno,analisisMatI );
    Assert.assertFalse(inscripccion.aprobada());
}
@Test
    public void cumpleCorrelativas(){
    Alumno alumno = createAlumno("Masumi", algebra,analisisMatI,algoritmos,mateDiscreta);
    Inscripccion inscripccion = createInscripccion(alumno, analisisMatII,pdp);
     Assert.assertTrue(inscripccion.aprobada());
    }
@Test
    public void cumpleCorrelativas2(){

    Alumno alumno = createAlumno("Candy",algoritmos, mateDiscreta,analisisMatI);
    Inscripccion inscripccion = createInscripccion(alumno, analisisMatII,pdp);
    Assert.assertFalse(inscripccion.aprobada());


}

private Alumno createAlumno(String nombre, Materia ...materiasAp){
        Alumno alumno = new Alumno(nombre);
        for(Materia materia : materiasAp){
            alumno.getMateriasAp().add(materia);
        }
        return alumno;
}
private Inscripccion createInscripccion(Alumno alumno, Materia ...materias){
        Inscripccion inscripccion = new Inscripccion(alumno);
        for(Materia materia : materias){
            inscripccion.getMaterias().add(materia);

        }
        return inscripccion;
}

}
