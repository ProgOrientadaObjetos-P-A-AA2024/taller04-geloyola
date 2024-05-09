package Paquete1;

import Paquete2.Sueldos;

/**
 *
 * @author gabyl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Sueldos sueldo1 = new Sueldos("Julian", "Gomez", 450, "110582537");
        Sueldos sueldo2 = new Sueldos("Pedro", "Martinez", 450);

        sueldo1.calcularSueldoTotal();
        sueldo2.calcularSueldoTotal();

        System.out.printf("%s\n", sueldo1);
        System.out.printf("%s\n", sueldo2);
    }

}
