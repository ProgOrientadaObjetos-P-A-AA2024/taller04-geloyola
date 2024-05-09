package paquete2;

/**
 *
 * @author utpl
 */
public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    //represantacion del objeto TOSTRING
    public void establecerNombreEstuadiante(String a) {
        nombreEstudiante = a;
    }

    public void establecerCalificacion(double a) {
        calificacion = a;
    }

    public void etablecerCalificacion2(double a) {
        calificacion2 = a;
    }

    public void establecerCalificacion3(double a) {
        calificacion3 = a;
    }

    public void establecerPromedio() {
        promedio = ((calificacion + calificacion2 + calificacion3) / 3);
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaciones n\n "
                + "nombre del estudiante %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.4f\n",
                obtenerNombreEstudiante(), obtenerCalificacion(),
                obtenerCalificacion2(), obtenerCalificacion3(), obtenerPromedio());

        return cadena;

    }

}
