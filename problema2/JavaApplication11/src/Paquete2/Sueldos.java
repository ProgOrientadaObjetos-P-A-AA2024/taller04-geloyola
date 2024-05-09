/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author gabyl
 */
public class Sueldos {

    private String nombresPro;
    private String apellidosPro;
    private double basico;
    private double sueldoTotal;
    private String cedula;

    public Sueldos(String n, String a, double b, String c) {
        nombresPro = n;
        apellidosPro = a;
        basico = b;
        cedula = c;
    }

    public Sueldos(String n, String a, double b) {
        nombresPro = n;
        apellidosPro = a;
        basico = b;
        cedula = "1104869385";
    }

    public void establecerNombresPro(String a) {
        nombresPro = a;
    }

    public void establecerApellidosPro(String a) {
        apellidosPro = a;
    }

    public void establecerBasico(double a) {
        basico = a;
    }

    public void establecerCedula(String a) {
        cedula = a;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (basico + (basico * 0.20));
    }

    public String obtenerNombresPro() {
        return nombresPro;
    }

    public String obtenerApellidosPro() {
        return apellidosPro;
    }

    public double obtenerBasico() {
        return basico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Sueldos a Profesores \n\n"
                + "Nombre del profesor: %s\n"
                + "Apellido del profesor: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s\n", obtenerNombresPro(),
                obtenerApellidosPro(), obtenerBasico(),
                obtenerSueldoTotal(), obtenerCedula());
        return cadena;
    }

}
