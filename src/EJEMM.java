
import javax.swing.JOptionPane;

public class EJEMM {
  public static void main(String[] args) {
  
      byte g,o,h,j,v;
      v= Byte.parseByte(JOptionPane.showInputDialog("teclea un numero "));
              if (v<=3){
                     g=(byte) (v-2);
                     o=(byte) (g+v);
                     h=(byte) (v-1);
                     j=(byte) (o*h);
                           JOptionPane.showMessageDialog(null,"total es "+j);
  }
}
}