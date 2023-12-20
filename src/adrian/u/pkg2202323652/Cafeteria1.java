package adrian.u.pkg2202323652;


import javax.swing.JOptionPane;

public class Cafeteria1 {
    public static void main (String [ ] args){
        short desc, tol = 0;
        byte col=0;
        float pre;
        col=Byte.parseByte(JOptionPane.showInputDialog("Color de bola que te tovo, 1=verde, 2=rojo, 3=blanco"));
        pre=Float.parseFloat(JOptionPane.showInputDialog("Precio del producto que adquiere"));
        if (col==1) {
         desc=(short) (0.20*pre);
            tol=(short) (desc-pre);
        }
        else if (col==2){
            desc=(short) (0.12*pre);
            tol=(short) (desc-pre);
        }
        else if (col==3){
            desc=(short) (0.5*pre);
            tol=(short) (desc-pre);
        }
        System.out.print("pagaras"+tol);
    }
}
        
    
        
   
