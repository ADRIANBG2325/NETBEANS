package adrian.u.pkg2202323652;
import javax.swing.JOptionPane;
public class Comparasion {
     public static void main(String[]args){
        byte a,b,c;
        a=Byte.parseByte(JOptionPane.showInputDialog("dime 1 numero"));
        b=Byte.parseByte(JOptionPane.showInputDialog("dime 1 numero"));
        c=Byte.parseByte(JOptionPane.showInputDialog("dime 1 numero"));
         if (a<b) {
           if (a<c) {
               JOptionPane.showMessageDialog(null,+a+ "es el numero menor" );      
         } else  if (a==c) {
              JOptionPane.showMessageDialog(null,+a+ " , " +c+ "son los numeros menores");
         }
         }
         if (b<c) {
           if (b<a) {
               JOptionPane.showMessageDialog(null,+b+ "es el numero menor" );      
         } else  if (a==b) {
              JOptionPane.showMessageDialog(null,+a+ " , " +b+ "son los numeros menores");
         }
         }
         if (c<a) {
           if (c<b) {
               JOptionPane.showMessageDialog(null,+c+ "es el numero menor" );      
         } else  if (c==b) {
              JOptionPane.showMessageDialog(null,+c+ " , " +b+ "son los numeros menores");
         }
         }
                       if (a==b){
             if (b==c){
                  JOptionPane.showMessageDialog(null, "los 3 numeros son iguales");
              } 
             }
}
}  