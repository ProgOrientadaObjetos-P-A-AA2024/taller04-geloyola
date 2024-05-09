package Paquete2;

/**
 *
 * @author gabyl
 */
public class Cheque {
    private String cliente;
    private String banco;
    private double valorCheque;
    private double comision;
    
    public Cheque(String c, String b, double vc){
        cliente = c;
        banco = b;
        valorCheque = vc;
    }
    public Cheque(String c, String b){
        cliente = c;
        banco = b;
        valorCheque = 900;
    }
    public void establecerCliente(String a){
        cliente = a;
    }
    public void establecerBanco(String a){
        banco = a;
    }
    public void establecerValorCheque(double a){
        valorCheque = a;
    }
    public void calculorComision(){
        comision = valorCheque*0.00003;
    }
    public String obtenerCliente(){
        return cliente;
    }
    public String obtenerBanco(){
        return banco;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }
    public double obtenerComision(){
        return comision;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Comision del Cheque \n\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Valor de la Comision: %.2f\n", obtenerCliente(),
                obtenerBanco(),obtenerValorCheque(),
                obtenerComision());
        return cadena;
    }
}
