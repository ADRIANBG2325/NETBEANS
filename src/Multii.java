import javax.swing.JOptionPane;
public class Multii {
       public static void main (String []args){
            short mut1 [][] = new short [2][2];
            short mut2 [][] = new short [2][2];
           // short mut3 [][] = new short [2][2];
            byte x ,v = 0,b = 0,y,m=0,n=0,multi = 0,f,l=0,k=0;
            for(k=0;k<=8;k++){
            for(x=0;x<=2;x++){
                mut1[v][b]=Short.parseShort(JOptionPane.showInputDialog("inserta numeros matriz 1"));
           
              
             for(y=0;y<=2;y++){
                 mut2[m][n]=Short.parseShort(JOptionPane.showInputDialog("inserta numeros matriz 2 "));
             multi= (byte) (mut1[v][b]*mut2[m][n]);
                
               System.out.print( multi+" ");
            // System.out.print("\t");
            }
            System.out.println();
            }
            System.out.println();
}
             System.out.print(mut1[v][b]);
       }
}

