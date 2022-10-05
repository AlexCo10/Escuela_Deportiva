
package modelo;


public class Administradora extends Trabajador{
    
    private String fechaInicio;
    private String fechaFin;

    public Administradora() {
    }

    public Administradora(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Administradora(String fechaInicio, String fechaFin, Double salario, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public void validarContrato(){ 
        
    }
    
    public void renovarContrato(){
        
    }
    
    public void consultarContrato(){
        
    }
    
    
    
    
}
