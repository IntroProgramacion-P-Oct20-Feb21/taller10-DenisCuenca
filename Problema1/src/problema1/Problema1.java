package problema1;

public class Problema1 {

    public static void main(String[] args) {

        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gbriela Lewis", "Davis Bell"};
        double suma;
        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int col = 0; col < 4; col++) {
                suma = suma + notas[fila][col];

            }
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", estudiantes[fila], suma);
        }
    }
}
