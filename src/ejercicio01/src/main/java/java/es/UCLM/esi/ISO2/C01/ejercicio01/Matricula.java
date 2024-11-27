package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.time.LocalDate;

public class Matricula {
    private String dniPersona;
    private LocalDate fecha;

    // Constructor
    public Matricula(String dniPersona, LocalDate fecha) {
        this.dniPersona = dniPersona;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
