package co.edu.sena.ejercicios.ejercicio2;

import java.util.TreeSet;
import java.util.Set;

    public class App01 {
        public static void main(String[] args) {
            Set<TipoDocumento> tipoDocumentoSet = new TreeSet<>();
            tipoDocumentoSet.add(new TipoDocumento(2,"cedula extranjeria", "CE"));
            tipoDocumentoSet.add(new TipoDocumento(1,"cedula", "CC"));
            tipoDocumentoSet.add(new TipoDocumento(1,"cedula", "CC"));
            tipoDocumentoSet.add(new TipoDocumento(1,"cedula", "CC"));
            tipoDocumentoSet.add(new TipoDocumento(1,"cedula", "CC"));

            for (TipoDocumento documento:tipoDocumentoSet
            ) {
                System.out.println(documento.toString());
            }
        }
    }

