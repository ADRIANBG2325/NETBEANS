package Unidad2;


import javax.swing.JOptionPane;

public class Metodos_1 {
private static byte a=10;
public static void main (String [] args){
    System.out.println("HOLA MUNDO");
    Metodos_1 objeto =new Metodos_1 ();
    
    objeto.imprimir();
         //////////////////////////////   objeto.calcular();
     
}

    private void imprimir() {
        short anioNac;
        System.out.println(a);
        anioNac=Short.parseShort(JOptionPane.showInputDialog("ingresa el año de nacimiento"));
    calcular(anioNac);//llamadaalmetodo calcular
    System.out.println(calcular(anioNac));
    }

    private short calcular(short m ) {
    byte res;
    short edad;
    edad=(short) (2024-m);
    return edad;
    /*res=(byte) (a*10);
    return res ;*/
    }
}
