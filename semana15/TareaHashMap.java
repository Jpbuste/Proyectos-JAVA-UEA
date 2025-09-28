package semana15;
import java.util.HashMap;

public class TareaHashMap {
    public static void main(String[] args) {
        // 1. Crear el mapa con claves iniciales
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Ana");
        informacionPersonal.put("edad", 28);
        informacionPersonal.put("ciudad", "Bahía de Caráquez");

        // 2. Acceder y modificar valores
        // Cambiar la ciudad
        informacionPersonal.put("ciudad", "Bahía de Caráquez");
        // Agregar profesión
        informacionPersonal.put("profesion", "Ingeniera de Software");

        // 3. Verificar existencia de la clave "telefono"
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "600123456");
        }

        // 4. Eliminar la clave "edad"
        informacionPersonal.remove("edad");

        // 5. Imprimir el contenido final del HashMap
        System.out.println("Contenido final del HashMap:");
        System.out.println(informacionPersonal);
    }
}