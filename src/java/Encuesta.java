public class Encuesta {
    private String Nombre;
    private String Objetivo;
    private String Estado;
    private String FechaInicio;
    private String FechaFin;

    public Encuesta(String Nombre, String Objetivo, String Estado, String FechaInicio, String FechaFin) {
        this.Nombre = Nombre;
        this.Objetivo = Objetivo;
        this.Estado = Estado;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }

    public Encuesta() {
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getObjetivo() {
        return Objetivo;
    }
    public void setObjetivo(String objetivo) {
        Objetivo = objetivo;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }

}
