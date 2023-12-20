import javax.swing.JOptionPane;
public class Materias {
    public static void main (String []args){
       byte y = 0,x = 0,c,p = 0;
       short sum = 0 ,pro = 0,ge=0,k = 0,s = 0;
       short matriz [][]=new short [6][5];
       String titulos []={"MATERI","U1","U2","U3","U4","U5","PRO"};
       String materia[]={"DES","FUI","FUP","CAL","MAD","QUI"};
      /// System.out.print("        ");
       for(p=0;p<=6;p++){
           System.out.print(titulos[p]+ "\t");
       }
       System.out.println("");
       for(c=0;c<=5;c++){
            System.out.print(materia[c]+"\t");
            sum=0;
            for (y=0;y<=4;y++){  
            matriz [x][y]=Short.parseShort(JOptionPane.showInputDialog("Ingresa la calificacion de "+materia[c] + " de la unidad "+(y+1)));
            System.out.print(matriz[x][y]+"\t");         
            sum+=matriz[x][y];
            pro=  (short) (sum/5);
            ge+=matriz[x][y];
            k=(short) (ge/5);
           }     
        System.out.println(pro);
       // System.out.println("");
                s=(short) (k/6);        
       }
     System.out.println("PROMEDIO GENERAL");
     System.out.println(s);
    }
}
         
         
         


