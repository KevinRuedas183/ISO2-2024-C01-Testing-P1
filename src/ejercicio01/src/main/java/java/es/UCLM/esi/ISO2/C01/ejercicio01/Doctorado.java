package java.es.UCLM.esi.ISO2.C01.ejercicio01;

public class Doctorado {
    private int idCarrera;
    private String nombreCarrera;

    // Constructor con parámetros
    public Doctorado(int idCarrera, String nombreCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    // Getters y Setters
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
}
