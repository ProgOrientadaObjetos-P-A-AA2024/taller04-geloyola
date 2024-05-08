/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.LibretaNotas;
/**
 *
 * @author utpl
 */
public class Ejecutor {
    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Rene", 10 , 10,10);
        LibretaNotas libreta2 = new LibretaNotas("Gaby", 10, 10);
        
        libreta1.establecerPromedio();
        libreta2.establecerPromedio();
        
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }
}
