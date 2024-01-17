package Unidad2;

import javax.swing.JOptionPane;
public class Arreglos {
    public int materias(){
        byte calculo [] = new byte [5];
        int x,sumatoria = 0,pro;
        String titulos []={"U1","U2","U3","U4","U5","PRO"};
        for (x=0;x<5;x++){
            calculo [x]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa calificacion de la UNIDAD  " +(x+1)));
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
    return x;    
    }
}
