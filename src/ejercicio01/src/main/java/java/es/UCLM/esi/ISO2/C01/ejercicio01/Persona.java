package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.time.LocalDate;
public class Persona implements IVariables{
	private String _nombre;
	private String _apellidos;
	private LocalDate _fecha_nacimiento;
	private Pais _nacionalidad;
	private Matricula _matricula;
	private enum _certificacion{
	}
	
	// para luego comprobar nivel de titulacion. igual al final no es necesario 
	private final int nivel;

	// Constructor
	Persona(int nivel) {
	    this.nivel = nivel;
	}
	private int _numero_tlf;
	private String _correo_electronico;


	public void esEuropeo() {
		throw new UnsupportedOperationException();
	}

	public void esMayordeEdad() {
		throw new UnsupportedOperationException();
	}

	public void HacerMatricula() {
// metodo con lo de las variables de en una interfaz con enum de titulacion y su nivel de prioridad
		throw new UnsupportedOperationException();
	}
}