package co.edu.sena.ejercicios.ejercicio8;

import java.util.Comparator;

public class Estudiante implements Comparator<Estudiante> {
    private int id;
    private String nombres;
    private String apellidos;

    public Estudiante (int id,String nombres, String apellidos){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return 0;
    }
}
