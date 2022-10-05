
package modelo;


public class Campeonato {
    
    private Integer edicionCampeonato;
    private String fechaInicio;
    private String horaInicio;
    private String horaFin;
    private String lugar;

    public Campeonato() {
    }

    public Campeonato(Integer edicionCampeonato, String fechaInicio, String horaInicio, String horaFin, String lugar) {
        this.edicionCampeonato = edicionCampeonato;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
    }

    public Integer getEdicionCampeonato() {
        return edicionCampeonato;
    }

    public void setEdicionCampeonato(Integer edicionCampeonato) {
        this.edicionCampeonato = edicionCampeonato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
