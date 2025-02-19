import javax.swing.JOptionPane
import java.*;
public class Arreglos {
    public static void main (String []args){
        byte calculo [] = new byte [5];
        int x,sumatoria = 0,pro;
        String titulos []={"u1","u2","u3","u4","u5","pro"};
        for (x=0;x<5;x++){
            calculo [x]=Byte.parseByte(JOptionPane.showInputDialog("ingresa calificacion de la unidad" +(x+1)));
         sumatoria+=calculo[x];
        }
        for(x=0;x<6;x++){
            System.out.print (titulos[x]+"\t");
        } 
        System.out.println(" ");
         for(x=0;x<5;x++){
        System.out.print (calculo[x]+"\t");
        
         }
         pro=sumatoria/x;
        System.out.print (pro);
        
    }
}
