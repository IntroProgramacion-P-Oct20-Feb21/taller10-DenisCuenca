package problema3;

public class Problema3 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        for (int filas = 0; filas < notasCualitativas.length; filas++) {
            for (int col = 0; col < notasCualitativas.length; col++) {
                if (notasCuantitativas[filas][col] >= 9.6) {
                    notasCualitativas[filas][col] = "Sobresaliente";
                } else {
                    if (notasCuantitativas[filas][col] >= 8 && notasCuantitativas[filas][col] <= 9.5) {
                        notasCualitativas[filas][col] = "Muy Buena";

                    } else {
                        if (notasCuantitativas[filas][col] >= 5 && notasCuantitativas[filas][col] <= 7.9) {
                            notasCualitativas[filas][col] = "Buena";
                        } else {
                            if (notasCuantitativas[filas][col] >= 3 && notasCuantitativas[filas][col] <= 4.9) {
                                notasCualitativas[filas][col] = "Regular";
                            } else {
                                if (notasCuantitativas[filas][col] >= 0 && notasCuantitativas[filas][col] <= 2.9) {
                                    notasCualitativas[filas][col] = "Insuficiente";
                                }
                            }
                        }
                    }
                }
            }
        }
        /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                                  // Por si se desea comprobar las asignaciones.
                System.out.printf("[%.2f] %s\n", notasCuantitativas[i][j], notasCualitativas[i][j]);                
            }
        }*/
    }
}
