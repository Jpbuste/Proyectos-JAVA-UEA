package semana12;
public class fp_registro_temperaturas {
    public static void main(String[] args) {
        // Ciudades costeras de Ecuador
        String[] ciudades = {"Bahía de Caráquez", "Guayaquil"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int semanas = 3; // Ahora 3 semanas

        // Matriz 3D: [ciudad][día][semana]
        double[][][] temperaturas = new double[ciudades.length][dias.length][semanas];

        // ========= BAHÍA DE CARÁQUEZ - SEMANA 1 =========
        temperaturas[0][0][0] = 26.5; // Lunes
        temperaturas[0][1][0] = 28.0; // Martes
        temperaturas[0][2][0] = 27.2; // Miércoles
        temperaturas[0][3][0] = 29.5; // Jueves
        temperaturas[0][4][0] = 30.8; // Viernes
        temperaturas[0][5][0] = 31.5; // Sábado
        temperaturas[0][6][0] = 29.0; // Domingo

        // ========= BAHÍA DE CARÁQUEZ - SEMANA 2 =========
        temperaturas[0][0][1] = 27.0;
        temperaturas[0][1][1] = 28.5;
        temperaturas[0][2][1] = 27.8;
        temperaturas[0][3][1] = 30.0;
        temperaturas[0][4][1] = 31.2;
        temperaturas[0][5][1] = 32.0;
        temperaturas[0][6][1] = 29.5;

        // ========= BAHÍA DE CARÁQUEZ - SEMANA 3 =========
        temperaturas[0][0][2] = 26.8;
        temperaturas[0][1][2] = 28.2;
        temperaturas[0][2][2] = 27.5;
        temperaturas[0][3][2] = 29.8;
        temperaturas[0][4][2] = 31.0;
        temperaturas[0][5][2] = 31.8;
        temperaturas[0][6][2] = 29.2;

        // ========= GUAYAQUIL - SEMANA 1 =========
        temperaturas[1][0][0] = 27.0; // Lunes
        temperaturas[1][1][0] = 29.5; // Martes
        temperaturas[1][2][0] = 28.0; // Miércoles
        temperaturas[1][3][0] = 31.0; // Jueves
        temperaturas[1][4][0] = 32.5; // Viernes
        temperaturas[1][5][0] = 33.0; // Sábado
        temperaturas[1][6][0] = 30.5; // Domingo

        // ========= GUAYAQUIL - SEMANA 2 =========
        temperaturas[1][0][1] = 27.5;
        temperaturas[1][1][1] = 30.0;
        temperaturas[1][2][1] = 28.5;
        temperaturas[1][3][1] = 31.5;
        temperaturas[1][4][1] = 33.0;
        temperaturas[1][5][1] = 33.5;
        temperaturas[1][6][1] = 31.0;

        // ========= GUAYAQUIL - SEMANA 3 =========
        temperaturas[1][0][2] = 27.2;
        temperaturas[1][1][2] = 29.8;
        temperaturas[1][2][2] = 28.3;
        temperaturas[1][3][2] = 31.2;
        temperaturas[1][4][2] = 32.8;
        temperaturas[1][5][2] = 33.3;
        temperaturas[1][6][2] = 30.7;

        // ========= CÁLCULO Y MOSTRAR RESULTADOS =========
        System.out.println("📊 === REGISTRO DE TEMPERATURAS - CIUDADES COSTERAS DE ECUADOR ===\n");

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("📍 Ciudad: " + ciudades[i]);

            for (int s = 0; s < semanas; s++) {
                double suma = 0.0;

                for (int d = 0; d < dias.length; d++) {
                    suma += temperaturas[i][d][s];
                }

                double promedio = suma / dias.length;
                System.out.printf("   📅 Semana %d: %.2f°C\n", s + 1, promedio);
            }
            System.out.println(); // Separador visual entre ciudades
        }

        System.out.println("✅ Datos basados en rangos climáticos aproximados de ciudades costeras del Ecuador.");
    }
}