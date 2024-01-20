 package _U3_;
import javax.swing.JOptionPane;
public class Decrementar {
public  void dec() {
long a=0;
int b=0, c;
b=Integer.parseInt(JOptionPane.showInputDialog ("ingresa el valor inicial"));
a=b;
for ( c=b-2;c>=0 ; c=c-2) {
System.out.println(c);
System.out.println(a+"+"+c);
a+=c;
System.out.println(a+"x"+(c+1));
a=a* (c+1) ;
System.out.println(a);
    }
  }
}
