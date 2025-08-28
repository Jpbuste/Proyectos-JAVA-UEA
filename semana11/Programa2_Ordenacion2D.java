package semana11;
import java.util.Arrays;

public class Programa2_Ordenacion2D {
    public static void main(String[] args) {
        // Matriz 3x3 con nuevos valores
        int[][] matriz = {
            {99, 11, 44},
            {77, 22, 66},
            {15, 80, 50}
        };

        int filaAOrdenar = 2; // Vamos a ordenar la fila con índice 2 (tercera fila)

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Validar que el índice de la fila sea válido
        if (filaAOrdenar >= 0 && filaAOrdenar < matriz.length) {
            Arrays.sort(matriz[filaAOrdenar]);
        } else {
            System.out.println("Error: El índice de la fila está fuera de rango.");
            return;
        }

        System.out.println("\nMatriz después de ordenar la fila " + filaAOrdenar + " (índice 2):");
        imprimirMatriz(matriz);
    }

    /**
     * Imprime la matriz de forma clara y alineada.
     * @param matriz La matriz a mostrar.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]); // Espacio fijo para alinear
            }
            System.out.println();
        }
    }
}