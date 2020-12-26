package problema5;

public class Problema5 {

    public static void main(String[] args) {
        String cadena = "";
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };
        char[][] letra = new char[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                letra[i][j] = estudiantes[i][j].charAt(0);
                if (letra[i][j] == 'S' || letra[i][j] == 'T' || letra[i][j] == 'P') {
                    cadena = String.format("%s%s    ", cadena, estudiantes[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
}
