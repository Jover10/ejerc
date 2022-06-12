package co.edu.sena.ejercicios.ejercicio3;

import java.util.Set;
import java.util.TreeSet;


public class App {
     public static void main(String[] args) {
          Set<Cliente> clienteSet = new TreeSet<>();
          clienteSet.add(new Cliente(1,"Juliana","Sanchez"));
          clienteSet.add(new Cliente(1,"Sofia","Martinez"));
          clienteSet.add(new Cliente(1,"Diana","llanos"));
          clienteSet.add(new Cliente(1,"Pedro","Villamil"));

          for (Cliente c: clienteSet){
                System.out.println(c.toString());
          }
     }
}
