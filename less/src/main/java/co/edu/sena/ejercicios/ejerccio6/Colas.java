package co.edu.sena.ejercicios.ejerccio6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Colas {
    public static void main(String[] args) {
        Deque<String> colaBanco = new ArrayDeque<>();
        colaBanco.push("jose");
        colaBanco.push("miguel");
        colaBanco.push("antonio");
        colaBanco.push("alejandro");

        for (String persona : colaBanco) {
            System.out.println(persona);
        }
        colaBanco.remove();
        for (String persona : colaBanco) {
            System.out.println(persona);
        }
    }
}
