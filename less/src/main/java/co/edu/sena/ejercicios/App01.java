package co.edu.sena.ejercicios;

import java.util.Set;
import java.util.TreeSet;

public class App01 {
    public static void main(String[] args) {
        Set<Integer> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add(6);
        conjuntoOrdenado.add(10);
        conjuntoOrdenado.add(21);
        conjuntoOrdenado.add(70);
        conjuntoOrdenado.add(100);
        conjuntoOrdenado.add(6);
        conjuntoOrdenado.add(7);

        for (Integer s: conjuntoOrdenado
        ){
            System.out.println(s);
        }

    Set<String> setNombres = new TreeSet<>();
        setNombres.add("julian");
        setNombres.add("pepito");
        setNombres.add("pedro");
        setNombres.add("chantal");
        setNombres.add("ricardo");
        setNombres.add("tatiana");
        setNombres.add("viviana");

        for (String nombre: setNombres){
        System.out.println(nombre);
    }
}
}
