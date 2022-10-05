package modelo;

import java.util.ArrayList;
import java.util.List;

public class PadreResponsable extends Persona {

    private String email;
    List<Alumno> hijos = null;

    public PadreResponsable() {

    }

    public PadreResponsable(String email) {
        this.email = email;
        hijos = new ArrayList<Alumno>();
    }

    public PadreResponsable(String email, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.email = email;
        hijos = new ArrayList<Alumno>();
    }

}
