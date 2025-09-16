package semana13;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    // Catálogo de productos predefinidos
    static List<Producto> catalogo = Arrays.asList(
        new Producto("Laptop", 850.00, "Tecnología"),
        new Producto("Mouse Inalámbrico", 25.50, "Tecnología"),
        new Producto("Camiseta Algodón", 15.99, "Ropa"),
        new Producto("Jeans", 45.00, "Ropa"),
        new Producto("Lámpara LED", 30.75, "Hogar"),
        new Producto("Juego de Toallas", 22.30, "Hogar")
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Producto> carrito = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion(sc);

            switch (opcion) {
                case 1:
                    mostrarCatalogo();
                    System.out.print("👉 Seleccione el número del producto: ");
                    int seleccion = sc.nextInt();
                    if (seleccion >= 1 && seleccion <= catalogo.size()) {
                        agregarProducto(carrito, catalogo.get(seleccion - 1));
                        System.out.println("✅ Agregado: " + catalogo.get(seleccion - 1).getNombre());
                    } else {
                        System.out.println("❌ Producto no válido.");
                    }
                    break;
                case 3:
                    if (carrito.isEmpty()) {
                        System.out.println("❌ Carrito vacío. Agrega productos primero.");
                    } else {
                        pagar(carrito, sc);
                        salir = true;
                    }
                    break;
                case 4:
                    System.out.println("👋 ¡Gracias por visitar Tienda Express!");
                    salir = true;
                    break;
                default:
                    System.out.println("⚠️ Opción inválida.");
            }
        }
        sc.close();
    }

    // Muestra el menú principal
    static void mostrarMenu() {
        System.out.println("\n=== 🛒 TIENDA EXPRESS ===");
        System.out.println("1. Ver catálogo y agregar producto");
        System.out.println("3. Pagar");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Lee opción como entero, con validación
    static int leerOpcion(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("❌ Ingrese un número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }

    // Muestra el catálogo numerado
    static void mostrarCatalogo() {
        System.out.println("\n--- 📚 CATÁLOGO DE PRODUCTOS ---");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + ". " + catalogo.get(i));
        }
        System.out.println("--------------------------------");
    }

    // Agrega un producto al carrito
    static void agregarProducto(List<Producto> carrito, Producto producto) {
        carrito.add(producto);
    }

    // Calcula total con impuesto
    static double total(double base, double imp) {
        return base + (base * imp / 100);
    }

    // Valida correo con expresión regular
    static boolean validarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(correo).matches();
    }

    // Genera y muestra el reporte de compra
    static void confirmarCompra(String correo, List<Producto> carrito, double total) {
        System.out.println("\n=== 🧾 REPORTE DE COMPRA ===");
        System.out.println("✉️  Enviado a: " + correo);
        System.out.println("📦 Productos comprados:");
        for (Producto p : carrito) {
            System.out.println("   - " + p.getNombre() + " ($" + String.format("%.2f", p.getPrecio()) + ")");
        }
        System.out.printf("💵 TOTAL A PAGAR: $%.2f\n", total);
        System.out.println("✅ ¡Gracias por su compra!");
        System.out.println("============================");
    }

    // Proceso de pago: pide correo, valida, calcula, confirma
    static void pagar(List<Producto> carrito, Scanner sc) {
        sc.nextLine(); // Limpiar buffer

        System.out.print("📧 Ingrese su correo: ");
        String correo = sc.nextLine();

        while (!validarCorreo(correo)) {
            System.out.print("❌ Correo inválido. Intente de nuevo: ");
            correo = sc.nextLine();
        }

        double subtotal = carrito.stream().mapToDouble(Producto::getPrecio).sum();
        double totalConImpuesto = total(subtotal, 13); // 13% impuesto

        confirmarCompra(correo, carrito, totalConImpuesto);
    }
}