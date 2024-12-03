package es.UCLM.esi.ISO2.C01.ejercicio01;

import java.util.ArrayList;

public class Pais {
	ArrayList<String> paisesEuropeos = new ArrayList<String>();
	
	public Pais() {
        paisesEuropeos.add("ESPAÑA");
        paisesEuropeos.add("FRANCIA");
        paisesEuropeos.add("ALEMANIA");
        paisesEuropeos.add("ITALIA");
        paisesEuropeos.add("PORTUGAL");
        paisesEuropeos.add("SUECIA");
        paisesEuropeos.add("DINAMARCA");
        paisesEuropeos.add("NORUEGA");
        paisesEuropeos.add("SUIZA");
        paisesEuropeos.add("PAÍSES BAJOS");
	}

	public ArrayList<String> getPaisesEuropeos() {
		return paisesEuropeos;
	}
	
}