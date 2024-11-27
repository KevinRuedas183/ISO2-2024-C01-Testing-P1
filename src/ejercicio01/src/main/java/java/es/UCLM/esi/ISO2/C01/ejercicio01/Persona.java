package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private ArrayList<Matricula> matriculas;

    // Constructor
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.matriculas = new ArrayList<Matricula>();
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para hacer una matrícula
    public void hacerMatricula() {
        Matricula nuevaMatricula = new Matricula(this.dni, LocalDate.now());
        matriculas.add(nuevaMatricula);
        System.out.println("Matrícula registrada para el DNI: " + this.dni + " en la fecha: " + LocalDate.now());
    }

    // Obtener las matrículas de la persona
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
}

