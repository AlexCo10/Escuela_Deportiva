
package modelo;


public class Categoria {
    
    private Integer identificador;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer identificador, String descripcion) {
        this.identificador = identificador;
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
