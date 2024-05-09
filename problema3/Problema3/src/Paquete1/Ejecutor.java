package Paquete1;

import Paquete2.Matricula;

/**
 *
 * @author gabyl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matricula matricula1 = new Matricula("110593728765", "Ford", 2019,
                279);
        Matricula matricula2 = new Matricula("1104867265", "Lexus", 2021);

        matricula1.calcularvMatricula();
        matricula2.calcularvMatricula();

        System.out.printf("%s\n", matricula1);
        System.out.printf("%s\n", matricula2);

    }

}
