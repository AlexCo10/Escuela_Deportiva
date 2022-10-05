
package modelo;


public class Ambulancia {
    
    private String telefono;
    private Aseguradora aseguradora;

    public Ambulancia() {
    }

    public Ambulancia(String telefono, Aseguradora aseguradora) {
        this.telefono = telefono;
        this.aseguradora = aseguradora;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    
    
    
}
