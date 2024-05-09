package Paquete2;

/**
 *
 * @author gabyl
 */
public class Matricula {

    private String cedula;
    private String marca;
    private int anFabricacion;
    private double valorVehiculo;
    private double vMatricula;

    public Matricula(String c, String m, int af, double vv) {
        cedula = c;
        marca = m;
        anFabricacion = af;
        valorVehiculo = vv;
    }

    public Matricula(String c, String m, int af) {
        cedula = c;
        marca = m;
        anFabricacion = af;
        valorVehiculo = 259.45;
       
    }

    public void establecerCedula(String a) {
        cedula = a;
    }

    public void establecermarca(String a) {
        marca = a;
    }

    public void establecerAnFabricacion(int a) {
        anFabricacion = a;
    }

    public void establecerValorVehiculo(double a) {
        valorVehiculo = a;
    }


    public void calcularvMatricula() {
        vMatricula = (0.00002 * valorVehiculo) * (2024 - anFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnFabricacion() {
        return anFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerVMatricula() {
        return vMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula \n\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n", obtenerCedula(),
                obtenerMarca(), obtenerAnFabricacion(),
                obtenerValorVehiculo(), obtenerVMatricula());
        return cadena;
    }
}
