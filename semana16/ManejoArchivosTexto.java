package semana16;
import java.io.*;

/**
 * Clase que demuestra cómo escribir y leer un archivo de texto en Java.
 * Realiza las siguientes operaciones:
 * 1. Escribe tres líneas de notas personales en un archivo llamado "mis_notas.txt".
 * 2. Lee el contenido del archivo línea por línea y lo muestra en consola,
 *    precediendo cada línea con la palabra "Nota:".
 * 3. Cierra correctamente los recursos usando try-with-resources.
 */
public class ManejoArchivosTexto {

    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "mis_notas.txt";

        // === 1. ESCRITURA DEL ARCHIVO ===
        System.out.println("Escribiendo en el archivo...");

        // Usamos try-with-resources para garantizar el cierre automático
        try (FileWriter fileWriter = new FileWriter(nombreArchivo);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Escribimos tres líneas de notas personales
            printWriter.println("Hoy aprendí a manejar archivos de texto en Java.");
            printWriter.println("Es importante cerrar los recursos para evitar fugas de memoria.");
            printWriter.println("La programación me permite expresar soluciones de forma lógica y creativa.");

            System.out.println("Notas escritas exitosamente en '" + nombreArchivo + "'.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // === 2. LECTURA DEL ARCHIVO ===
        System.out.println("\nLeyendo el archivo...");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leemos línea por línea hasta que no queden más
            while ((linea = bufferedReader.readLine()) != null) {
                // Mostramos cada línea precedida por la palabra "Nota:"
                System.out.println("Nota: " + linea);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}