package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class Persona implements IVariables {

	private String _nombre;
	private String _apellidos;
	private LocalDate _fecha_nacimiento;
	private String _nacionalidad;
	private TITULACION nivel;
	private int _numero_tlf;
	private String _correo_electronico;
	private Pais p= new Pais();
	private enum _certificacion {
	}

	// para luego comprobar nivel de titulacion. igual al final no es necesario
	
	/*
	 * pongo nivel como tipo titulacion en lugar de como int
	 */


	
	public Persona(String _nombre, String _apellidos, LocalDate _fecha_nacimiento, Pais _nacionalidad,
			Matricula _matricula, String titulacion, int _numero_tlf, String _correo_electronico) {
		this._nombre = _nombre;
		this._apellidos = _apellidos;
		this._fecha_nacimiento = _fecha_nacimiento;
		this._nacionalidad = _nacionalidad;
		this._matricula = _matricula;
		this.nivel = setnivel(titulacion); // metodo controlado errores
		this._numero_tlf = _numero_tlf;
		this._correo_electronico = _correo_electronico;
	}

	
	//Calcula si es europeo
	public boolean esEuropeo() {
		boolean esEuropeo=false;
		if(p.getPaisesEuropeos().contains(_nacionalidad)) {
			esEuropeo=true;
		}
		
		return esEuropeo;
	}

	//Calcula si es mayor de edad
	public boolean esMayordeEdad() {
		int edad=Period.between(_fecha_nacimiento, LocalDate.now()).getYears();
		boolean esMayor=false;
		if(edad>=18) {
			esMayor=true;
		}	
		return esMayor;
	}
	
	public void compruebaString(String e) throws Exception {
		if(e.isEmpty()) {
			throw new Exception("El String no puede estar vacío o ser nulo.");
		}
	}

	/*public void HacerMatricula() throws Exception {
		try {
			if (nivel >= TITULACION.MASTER.ordinal() + 1) {
				_matricula = new Matricula(_apellidos, _fecha_nacimiento);
				// System.out.println("Matrícula realizada con éxito.");
				return;
			}
			System.out.println("No se alcanza la titulacion requerida");
		}

		catch (Exception e) {
			System.out.println("Ha ocurrido un problema:\n" + e);
		}

	}*/

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		try {
			
			
			this._nombre = _nombre;
		} catch (Exception e) {

		}

	}

	public String get_apellidos() {
		return _apellidos;
	}

	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}

	public LocalDate get_fecha_nacimiento() {
		return _fecha_nacimiento;
	}

	public void set_fecha_nacimiento(LocalDate _fecha_nacimiento) {
		this._fecha_nacimiento = _fecha_nacimiento;
	}

	public Pais get_nacionalidad() {
		return _nacionalidad;
	}

	public void set_nacionalidad(Pais _nacionalidad) {
		this._nacionalidad = _nacionalidad;
	}

	public Matricula get_matricula() {
		return _matricula;
	}

	public void set_matricula(Matricula _matricula) {
		this._matricula = _matricula;
	}

	public int get_numero_tlf() {
		return _numero_tlf;
	}

	public void set_numero_tlf(int _numero_tlf) {
		this._numero_tlf = _numero_tlf;
	}

	public String get_correo_electronico() {
		return _correo_electronico;
	}

	public void set_correo_electronico(String _correo_electronico) {
		this._correo_electronico = _correo_electronico;
	}

	public TITULACION getNivel() {

		return nivel;
	}
	public TITULACION setnivel (String titulacion) {
		titulacion = titulacion.toUpperCase();
		try {
			nivel = TITULACION.valueOf(titulacion);
		   } catch (IllegalArgumentException e) {
               throw new IllegalArgumentException("Nivel de titulación inválido. Debe ser LICENCIATURA, MASTER o DOCTORADO.");
               // aqui deberia ir algo que llamase de nuevo a introducir datos de titulacion, pero roleamos
           }
		return nivel;
	}
	
}