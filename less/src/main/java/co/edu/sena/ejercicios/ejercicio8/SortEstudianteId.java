package co.edu.sena.ejercicios.ejercicio8;
import java.util.Comparator;
public class SortEstudianteId implements Comparator<Estudiante>{
    @Override
    public int compare(Estudiante o1, Estudiante o2){
        if (o1.getId()<o2.getId())
            return -1;
        else if (o1.getId()>o2.getId())
            return 1;
        else
            return 0;
    }
}
