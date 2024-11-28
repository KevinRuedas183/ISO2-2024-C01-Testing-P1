package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.time.LocalDate;
public class Persona {
	private String _nombre;
	private String _apellidos;
	private LocalDate _fecha_nacimiento;
	private Pais _nacionalidad;
	private Matricula _matricula;
	private enum _certificacion{
		
		
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

		throw new UnsupportedOperationException();
	}
}