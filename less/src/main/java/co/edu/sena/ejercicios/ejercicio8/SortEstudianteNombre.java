package co.edu.sena.ejercicios.ejercicio8;


import java.util.Comparator;

public class SortEstudianteNombre implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return o1.getNombres().compareTo(o2.getNombres());
    }
}
