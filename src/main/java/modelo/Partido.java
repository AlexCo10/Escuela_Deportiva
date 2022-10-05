
package modelo;


public class Partido {
    
    private String marcador;
    private String nombreArbitro;
    private String horaPartido;
    private String equipoContrincante;
    private Double valorArbitraje;

    public Partido() {
    }

    public Partido(String marcador, String nombreArbitro, String horaPartido, String equipoContrincante, Double valorArbitraje) {
        this.marcador = marcador;
        this.nombreArbitro = nombreArbitro;
        this.horaPartido = horaPartido;
        this.equipoContrincante = equipoContrincante;
        this.valorArbitraje = valorArbitraje;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public String getEquipoContrincante() {
        return equipoContrincante;
    }

    public void setEquipoContrincante(String equipoContrincante) {
        this.equipoContrincante = equipoContrincante;
    }

    public Double getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(Double valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }
    
    
    
}
