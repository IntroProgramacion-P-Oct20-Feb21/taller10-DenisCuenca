package problema4;

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Ingresar el valor numérico "
                        + "del arreglo 'datos' en la posicion [%d][%d]: ", i, j);
                datos[i][j] = entrada.nextDouble();
            }
        }
        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {           // Por si se desea comprobar las asignaciones.
                System.out.printf("[%d][%d] %.2f\n",i,j,datos[i][j]);
                
            }
        }*/
    }
}
