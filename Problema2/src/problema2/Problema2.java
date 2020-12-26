package problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessia Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;
        String cadena = "";
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (int fila = 0; fila < vendedores.length; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.printf("Ingrese el dinero total de las ventas en el día %s para %s: ", dias[col], vendedores[fila]);
                ventas[fila][col] = entrada.nextDouble();
                suma = suma + ventas[fila][col];
            }
            cadena = String.format("%sVendedor(a) %s\n", cadena, vendedores[fila]);
        }
        System.out.printf("%sHan realizado un total de %.2f en ventas.\n", cadena, suma);
    }
}
