package semana11;
public class Programa1_Busqueda2D {
    public static void main(String[] args) {
        // Matriz 3x3 con nuevos valores
        int[][] matriz = {
            {12,  7, 23},
            {45, 88,  3},
            {19,  6, 31}
        };

        int valorBuscado = 88; // Valor que vamos a buscar

        int[] resultado = buscarValor(matriz, valorBuscado);

        if (resultado[0] != -1) {
            System.out.println("✅ El valor " + valorBuscado +
                    " fue encontrado en la posición [" + resultado[0] +
                    "][" + resultado[1] + "]");
        } else {
            System.out.println("❌ El valor " + valorBuscado +
                    " no fue encontrado en la matriz.");
        }
    }

    /**
     * Busca un valor en una matriz 2D.
     * @param matriz La matriz donde se busca.
     * @param valor El valor a encontrar.
     * @return Arreglo [fila, columna] si se encuentra, o [-1, -1] si no.
     */
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}