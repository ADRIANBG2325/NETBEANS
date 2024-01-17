package Unidad2;

import javax.swing.JOptionPane;

public class Promedios {
    public byte promedia(){
        byte pro = 0;
        pro=Byte.parseByte(JOptionPane.showInputDialog("ingresa tu promedio"));
        if(pro<70){
            JOptionPane.showMessageDialog(null,"N/A");
        } else if(pro>=70){
                if(pro<=74){
                    JOptionPane.showMessageDialog(null,"SUFICIENTE");
                
            }
            else if(pro>=75){
                if(pro<=84){
                    JOptionPane.showMessageDialog(null,"BUENO");
                
            }else if (pro>=85){
                if(pro<=94){
                   JOptionPane.showMessageDialog(null,"NOTABLE");
                
            }else if (pro>=95){
                if(pro==100){
                   JOptionPane.showMessageDialog(null,"EXCELENTE");
                }
            }
            }
            }
    }
        return pro;
}
}