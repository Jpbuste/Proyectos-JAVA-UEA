package semana14;
public class CalculoDescuento {

    /**
     * Método para calcular el descuento aplicado a una compra.
     * 
     * @param montoTotal Monto total de la compra.
     * @param porcentajeDescuento Porcentaje de descuento a aplicar (en valor decimal, ej. 15.0 para 15%).
     * @return Valor del descuento calculado.
     */
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100.0);
    }

    /**
     * Método sobrecargado: calcula el descuento con un 10% por defecto.
     * 
     * @param montoTotal Monto total de la compra.
     * @return Valor del descuento calculado (10% del monto total).
     */
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10.0); // Llama al método con descuento del 10%
    }

    /**
     * Método principal (main) para probar los métodos de cálculo de descuento.
     * Realiza dos llamadas: una con descuento por defecto (10%) y otra con descuento personalizado (15%).
     * Muestra por consola el descuento y el monto final a pagar.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Definir montos de ejemplo
        double montoCompra1 = 500.0;
        double montoCompra2 = 800.0;

        // Llamada 1: Usando descuento por defecto (10%)
        System.out.println("=== Compra 1: Descuento por defecto (10%) ===");
        double descuento1 = calcularDescuento(montoCompra1);
        double montoFinal1 = montoCompra1 - descuento1;
        System.out.println("Monto total: $" + montoCompra1);
        System.out.println("Descuento aplicado: $" + String.format("%.2f", descuento1));
        System.out.println("Monto final a pagar: $" + String.format("%.2f", montoFinal1));
        System.out.println();

        // Llamada 2: Usando descuento personalizado (15%)
        System.out.println("=== Compra 2: Descuento personalizado (15%) ===");
        double descuento2 = calcularDescuento(montoCompra2, 15.0);
        double montoFinal2 = montoCompra2 - descuento2;
        System.out.println("Monto total: $" + montoCompra2);
        System.out.println("Descuento aplicado: $" + String.format("%.2f", descuento2));
        System.out.println("Monto final a pagar: $" + String.format("%.2f", montoFinal2));
    }
}