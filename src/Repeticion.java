import javax.swing.JOptionPane;
public class Repeticion {
  public static void main (String [] args){
   short p = 0,t = 0,s = 0,m = 0,a,v,l = 0,r = 0,ac = 0,k;;;
    byte g,h,j,o;
      v= Short.parseShort(JOptionPane.showInputDialog("teclea un numero "));
       for (  a=v; v>=0; v++){
        r  =   (short) (a-2);
         ac=(short)  (r+v);
           if(a==v){
             t=(short)  (v-1);
              p= (short) (t*ac);
                l=(short) (r-2);
                 k=(short) (l+p);
                  m=(short) (t-2);
                   s=(short) (m*k);
                   JOptionPane.showMessageDialog(null,"total es "+s);
           } 
       }             
                     }
                     }

  


