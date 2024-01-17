package Unidad_4;
import javax.swing.JOptionPane;

public class Binario {
    
    public String convertidor() {
        int decimal, modulo;
       String binario="";
        
        decimal=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero en decimal a convertir:"));
        
        while (decimal>0){
            modulo = (decimal%2);
            binario = modulo + binario;
            decimal = decimal/2;
        }
        JOptionPane.showMessageDialog(null,"El numero en binario es:"+binario);
        return binario;
    }
}
