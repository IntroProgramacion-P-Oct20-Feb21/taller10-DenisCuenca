package problema6;

public class Problema6 {

    public static void main(String[] args) {
        String cadena = "";
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if ((estudiantes[i][j].length()) == 11) {
                    cadena = String.format("%s%s    ", cadena, estudiantes[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
}
