package co.edu.sena.ejercicios.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante(1, "jose", "morales"));
        listaEstudiantes.add(new Estudiante(1, "antonio", "moreno"));
        listaEstudiantes.add(new Estudiante(1, "enrique", "moncada"));
        listaEstudiantes.add(new Estudiante(1, "alejandro", "mora"));
        listaEstudiantes.add(new Estudiante(1, "moises", "moreno"));
        listaEstudiantes.add(new Estudiante(1, "jesus", "mora"));

        SortEstudianteId sortEstudianteId = new SortEstudianteId();
        SortEstudianteNombre sortEstudianteNombre = new SortEstudianteNombre();
        SortEstudianteApellido sortEstudianteApellido = new SortEstudianteApellido();


        Collections.sort(listaEstudiantes, sortEstudianteNombre);
        for (Estudiante e: listaEstudiantes){
            System.out.println(e.toString());
        }

    }
}

