package modelo;

public class AuxiliarContable extends Trabajador {

    public AuxiliarContable() {
    }

    public AuxiliarContable(Double salario, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
    }

    public boolean validarEstadoAuxiliarContable() {
        boolean aux = false;

        if ((this.calcularEdad() > 25) && (this.calcularEdad() < 35)) {
            aux = true;
        }
        return aux;
    }

}
