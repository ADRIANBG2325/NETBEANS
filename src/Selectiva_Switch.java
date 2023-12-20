import javax.swing.JOptionPane;
public class Selectiva_Switch {
    public static void main (String [] args){
        byte x =0, a,p;
        a=Byte.parseByte(JOptionPane.showInputDialog("Dime el precio de la compra"));
        x=Byte.parseByte(JOptionPane.showInputDialog("1 Para incrementar , 2 para descontar"));
        switch (x) {
            case 1:
                a+=a * 0.10;
                break;
            case 2: a-=a * 0.10;
            break;
            default:
                System.out.println("dato incorrecto"); 
        }
        JOptionPane.showMessageDialog(null,"total es"+ a);
    }
}
