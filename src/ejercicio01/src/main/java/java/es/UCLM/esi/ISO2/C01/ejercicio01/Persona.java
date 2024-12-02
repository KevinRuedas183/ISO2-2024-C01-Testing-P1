package java.es.UCLM.esi.ISO2.C01.ejercicio01;

import java.io.IOException;
import java.time.DateTimeException;
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


	// para luego comprobar nivel de titulacion. igual al final no es necesario
	
	/*
	 * pongo nivel como tipo titulacion en lugar de como int
	 */


	
	public Persona(String _nombre, String _apellidos, LocalDate _fecha_nacimiento, String _nacionalidad,
			 String titulacion, int _numero_tlf, String _correo_electronico) throws Exception {
		set_nombre(_nombre);
		set_apellidos(_apellidos);
		set_nacionalidad(_nacionalidad);
		set_correo_electronico(_correo_electronico);
		this.nivel = setnivel(titulacion); // metodo controlado errores
		set_numero_tlf(_numero_tlf);
		set_fecha_nacimiento(_fecha_nacimiento);
	}

	
	
	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) throws Exception {
		compruebaString(_nombre);
		this._nombre=_nombre;
		
	}
	
	public String get_apellidos() {
		return _apellidos;
	}

	public void set_apellidos(String _apellidos) throws Exception {
		compruebaString(_apellidos);
		this._apellidos = _apellidos;
	}

	public LocalDate get_fecha_nacimiento() {
		return _fecha_nacimiento;
	}

	public void set_fecha_nacimiento(LocalDate _fecha_nacimiento)throws Exception{
		
		
		if(Period.between(_fecha_nacimiento, LocalDate.now()).getYears()<0 || Period.between(_fecha_nacimiento, LocalDate.now()).getYears()>200) {
			throw new Exception("Debe escribir una fecha correcta.");
		}
		try{
			this._fecha_nacimiento = _fecha_nacimiento;
		}catch(DateTimeException e) {
            System.out.println("Error: Día, mes o año inválido.");
        }
	}

	public String get_nacionalidad() {
		return _nacionalidad;
	}

	public void set_nacionalidad(String _nacionalidad) throws Exception {
		compruebaString(_nacionalidad);
		this._nacionalidad = _nacionalidad.toUpperCase();	
	}
	
	public int get_numero_tlf() {
		return _numero_tlf;
	}

	public void set_numero_tlf(int _numero_tlf) throws Exception {
		if(_numero_tlf<0) {
			throw new Exception("No existen los numeros de tlf negativos.");
		}else if (String.valueOf(_numero_tlf).length()!=9) {
			throw new Exception("El número debe contener un total de 9 números");
		}else {
			this._numero_tlf = _numero_tlf;	
		}
	}

	public String get_correo_electronico() {
		return _correo_electronico;
	}

	public void set_correo_electronico(String _correo_electronico) throws Exception {
		compruebaString( _correo_electronico);
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

	// no hace falta excepcion, aqui el dato llega bien y MASTER ES predifinido
	public boolean hacer_matricula() {
		if (this.nivel.get_nivel_titulacion() >= TITULACION.MASTER.get_nivel_titulacion()) {
			return true;
		}
		return false;
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