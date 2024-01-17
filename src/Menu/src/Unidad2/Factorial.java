
package Unidad2;
import javax.swing.JOptionPane;
public class Factorial {
    public int factor(){
        int factorial=1, numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("numero"));
        while (numero !=0){
            factorial= (factorial*numero);
            numero--;
            
        }
       JOptionPane.showMessageDialog(null,"resultado es "+factorial);
    return factorial;
    }
}