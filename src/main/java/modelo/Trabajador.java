
package modelo;


public class Trabajador extends Persona{
    
    private Double salario;

    public Trabajador() {
    }

    public Trabajador(Double salario) {
        this.salario = salario;
    }

    public Trabajador(Double salario, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        
    }

    
    

    
    
}
