package java.es.UCLM.esi.ISO2.C01.ejercicio01;
import java.util.ArrayList;

public interface IVariables {

	
	public enum TITULACION {
		LICENCIATURA(1), MASTER(2), DOCTORADO(3);

		private int nivel;

		TITULACION(int nivel) {
			this.nivel = nivel;
		}

		public int get_nivel_titulacion() {
			return nivel;
		}

	}
}
