package menu;
import javax.swing.JOptionPane;
import Unidad_3.Cafeteria1;
import Unidad_3.VACUNAS;
import Unidad_3.Comparasion;
import Unidad_4.Binario;
import Unidad_3.autobuses;
import Unidad2.Dibujo;
import Unidad2.Selectiva_Switch;
import Unidad2.Arreglos;
import Unidad2.Materias;
import Unidad2.Repeticion;
import Unidad2.Factorial;
import Unidad2.Promedios;
public class Menu {
    public static void main(String[] args) {
        byte op;
        op=Byte.parseByte(JOptionPane.showInputDialog("capture el numero del programa que desea ejecutar \n 1.sorteo cafeteria \n 2.vacunas \n 3.comparacion \n 4.calculo promedio \n 5.binario \n 6.autobuses \n 7.factorial \n 8.dibujo con ciclos \n 9.switch \n 10.Suma y multilicacion \n 11.vector \n 12. promedio matrices \n 13.examen arreglos"));
   switch(op){
       case 1:Cafeteria1 obj=new Cafeteria1();
       obj.calculaDescuentos();
       break;
       case 2:VACUNAS obj1=new VACUNAS ();
       obj1.devuelveTipo ();
       break;
       case 3:Comparasion obj2=new Comparasion();
       obj2.compara ();
       break;
       case 4:Promedios obj12= new Promedios ();
       obj12.promedia();
           
           
           
       break;
       case 5:Binario obj4= new Binario ();
       obj4.convertidor ();
       break;
       case 6:autobuses obj5=new autobuses();
       obj5.total();
       break;
       case 7: Factorial obj11= new Factorial ();
       obj11.factor();
       break;
       case 8:Dibujo obj6=new Dibujo();
       obj6.dibuja();
       break;
       case 9:Selectiva_Switch obj7= new Selectiva_Switch();
       obj7.compras();
       break;
       case 10:Repeticion obj10=new Repeticion ();
       obj10.multi();
       break;
       case 11:Arreglos obj8= new Arreglos ();
       obj8.materias();
       break;
       case 12:Materias obj9=new Materias();
       obj9.promedio();
       break;
       case 13:
   }
    }
    
}
