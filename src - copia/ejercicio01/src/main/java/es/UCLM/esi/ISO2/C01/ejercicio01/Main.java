package es.UCLM.esi.ISO2.C01.ejercicio01;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	
	public static void main(String[] args) throws Exception {
		Scanner TECLADO = new Scanner(System.in);
		
		System.out.print("Introduzca su nombre: ");
        String nombre = TECLADO.next(); 
        System.out.print("Introduzca su apellido ");
        String apellido = TECLADO.next();  
        System.out.print("Introduzca el día que nació: ");
        int dia = 0;
        try{
        	dia = TECLADO.nextInt();  
        }catch(InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número entero.");
        }
        System.out.print("Introduzca el mes que nació:  ");
        int mes = 0;
        try{
        	mes = TECLADO.nextInt();  
        }catch(InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número entero.");
        }
        System.out.print("Introduzca el año que nació:  ");
        int anio = 0;
        try{
        	anio = TECLADO.nextInt();  
        }catch(InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número entero.");
        }  
        
        System.out.print("Introduzca su país:  ");
        String pais = TECLADO.next();  
        
        System.out.print("Introduzca su titulación:  ");
        String titulo = TECLADO.next();  
        
        System.out.print("Introduzca su número de tlf:  ");
        int num = 0;
        try{
        	num = TECLADO.nextInt();  
        }catch(InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número entero.");
        }  
        
        System.out.print("Introduzca su correo electrónico:  ");
        String correo = TECLADO.next(); 
     
        LocalDate fecha_nac = LocalDate.of(anio, mes, dia);
	
		Persona p = new Persona(nombre, apellido, fecha_nac, pais, titulo, num, correo );
	
	}
}
