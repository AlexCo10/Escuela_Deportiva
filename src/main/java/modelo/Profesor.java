
package modelo;


public class Profesor extends Trabajador{
    
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String especialidad, Double salario, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
