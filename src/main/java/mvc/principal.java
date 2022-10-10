package mvc;

import modelo.*;
import vista.*;
import controlador.*;

public class principal {

    public static void main(String[] args) {

        VistaPrincipal vistaP = new VistaPrincipal();

        Administradora administradora = new Administradora();
        Alumno alumno = new Alumno();
        Ambulancia ambulancia = new Ambulancia();
        Aseguradora aseguradora = new Aseguradora();
        AuxiliarContable auxiliarContable = new AuxiliarContable();
        Campeonato campeonato = new Campeonato();
        PadreResponsable padreResponsable = new PadreResponsable();
        Partido partido = new Partido();
        Profesor profesor = new Profesor();
        Trabajador trabajador = new Trabajador();

        Controlador control = new Controlador(alumno, padreResponsable, administradora, aseguradora, auxiliarContable, campeonato, profesor, trabajador, vistaP);

        vistaP.setVisible(true);
        vistaP.setTitle("Escuela Deportiva");
    }

}
