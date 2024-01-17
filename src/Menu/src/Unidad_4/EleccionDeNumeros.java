package Unidad_4;

import javax.swing.JOptionPane;
public class EleccionDeNumeros{
    public static void main(String[]agrs){
        byte a,b,c;
        a=Byte.parseByte(JOptionPane.showInputDialog("dame un numero"));
	b=Byte.parseByte(JOptionPane.showInputDialog("dame otro numero"));
	c=Byte.parseByte(JOptionPane.showInputDialog("pues dame otro numero"));
        if (a<=c){
            System.out.println(a+"es el numero menor");
        }
            else if (a==c){
                System.out.println(a+" y "+b+" son los numeros menores");
            } 
        if (b<=c){
            System.out.println(b+"es el numero menor");
            }
            else if (a==b){
                System.out.println(a+" y "+b+" son los numeros menores");
	 if (c<=a){
            System.out.println(c+"es el numero menor");
        }
        else if (c==b){
            System.out.println(c+" y "+c+" son los numeros menores");
	 if (a==b){
	    if (b==c)
              if (c==c)
                  if (a==a)
                      if (b==b)
                System.out.println("todos son iguales");
        if (b<=a){
            System.out.println(b+"es el numero menor");
            }
        
         }
       
    }
        }
            }
    }

            
