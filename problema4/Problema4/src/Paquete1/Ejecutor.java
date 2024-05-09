package Paquete1;
import Paquete2.Cheque;
/**
 *
 * @author gabyl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("Raul Roman", "Banco de Loja",
        205);
        Cheque cheque2 = new Cheque("Camila Moreno", "Banco de Guayaquil");
        
        cheque1.calculorComision();
        cheque2.calculorComision();
       
        System.out.printf("%s\n",cheque1);
        System.out.printf("%s\n",cheque2);
    }
    
}
