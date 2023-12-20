import javax.swing.JOptionPane;
public class cal {
    public static void main (String []args){
       byte y = 0,x = 0,c,p = 0;
       short sum = 0 ,pro = 0,ge=0,k = 0,s = 0;
        short matriz [][]=new short [6][5];
        String titulos []={"u1","u2","u3","u4","u5","pro"};
         String materia;
         System.out.print("        ");
         for(p=0;p<=5;p++){
             System.out.print(titulos[p]+ "\t");
         }
         
         System.out.println("");
         for(c=0;c<=5;c++){
              materia=JOptionPane.showInputDialog("ingresa nombre de la materia");
            System.out.print(materia+"\t");
            sum=0;
      for (y=0;y<=4;y++){  
       matriz [x][y]=Short.parseShort(JOptionPane.showInputDialog("ingresa la calificacion de la materia de la unidad "+(y+1)));
             System.out.print(matriz[x][y]+"\t");         
       
             sum+=matriz[x][y];
       pro=  (short) (sum/5);
       ge+=matriz[x][y];
       k=(short) (ge/5);
      }     
         System.out.println(pro);
       System.out.println("");
                s=(short) (k/6);
         }

       System.out.println(s);
         }
        
         }
         
         
         


