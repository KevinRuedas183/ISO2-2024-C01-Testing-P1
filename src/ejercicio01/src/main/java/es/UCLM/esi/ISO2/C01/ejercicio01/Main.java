package es.UCLM.esi.ISO2.C01.ejercicio01;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner TECLADO = new Scanner(System.in);

        try {
            String nombre = solicitarEntradaTexto(TECLADO, "Introduzca su nombre: ");
            String apellido = solicitarEntradaTexto(TECLADO, "Introduzca su apellido: ");
            int dia = solicitarEntradaNumero(TECLADO, "Introduzca el día que nació: ");
            int mes = solicitarEntradaNumero(TECLADO, "Introduzca el mes que nació: ");
            int anio = solicitarEntradaNumero(TECLADO, "Introduzca el año que nació: ");
            String pais = solicitarEntradaTexto(TECLADO, "Introduzca su país: ");
            String titulo = solicitarEntradaTexto(TECLADO, "Introduzca su titulación: ");
            int num = solicitarEntradaNumero(TECLADO, "Introduzca su número de tlf: ");
            String correo = solicitarEntradaTexto(TECLADO, "Introduzca su correo electrónico: ");

            // Crear la fecha de nacimiento
            LocalDate fecha_nac = LocalDate.of(anio, mes, dia);

            // Crear un objeto Persona (asumiendo que tienes esta clase definida)
            Persona p = new Persona(nombre, apellido, fecha_nac, pais, titulo, num, correo);

            System.out.println("Persona creada con éxito: " + p);

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            TECLADO.close();
        }
    }

    // Método para solicitar y validar entrada de texto
    private static String solicitarEntradaTexto(Scanner teclado, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String entrada = leerEntrada(teclado);
                return entrada; // Devuelve el valor si es válido
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + " Intente nuevamente.");
            }
        }
    }

    // Método para solicitar y validar entrada numérica
    private static int solicitarEntradaNumero(Scanner teclado, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = leerNumero(teclado);
                return numero; // Devuelve el valor si es válido
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + " Intente nuevamente.");
            }
        }
    }

    // Método para leer cadenas de texto y validar saltos de línea o entradas vacías
    private static String leerEntrada(Scanner teclado) throws Exception {
        String entrada = teclado.nextLine().trim(); // Captura la línea completa y elimina espacios extra
        if (entrada.isEmpty()) { // Si está vacío, el usuario solo presionó Enter
            throw new Exception("La entrada no puede estar vacía ni contener solo un salto de línea.");
        }
        return entrada; // Retorna la entrada válida
    }

    // Método para leer números enteros y validar entradas vacías
    private static int leerNumero(Scanner teclado) throws Exception {
        String entrada = teclado.nextLine().trim(); // Captura la entrada como texto para verificar si está vacía
        if (entrada.isEmpty()) { // Verifica si el usuario no ingresó nada
            throw new Exception("La entrada no puede estar vacía ni contener solo un salto de línea.");
        }
        try {
            return Integer.parseInt(entrada); // Intenta convertir la entrada a número entero
        } catch (NumberFormatException e) {
            throw new Exception("Por favor, ingrese un número entero válido.");
        }
    }
}
