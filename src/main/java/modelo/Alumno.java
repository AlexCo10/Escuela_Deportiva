
package modelo;


public class Alumno extends Persona{
    
    private Categoria categoria;
    private PadreResponsable padre;

    public Alumno() {
    }    

    public Alumno(Categoria categoria, PadreResponsable padre) {
        this.categoria = categoria;
        this.padre = padre;
    }

    public Alumno(Categoria categoria, PadreResponsable padre, String dni, String nombre, String apellidos, String direccion, String telefono, int fechaNacimiento, String genero) {
        super(dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.categoria = categoria;
        this.padre = padre;
    }       

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public PadreResponsable getPadre() {
        return padre;
    }

    public void setPadre(PadreResponsable padre) {
        this.padre = padre;
    }
    
    
    
}
