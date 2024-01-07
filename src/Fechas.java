import javax.swing.JOptionPane;
public class Fechas {
    public static void main(String[]args){
		int año_actual=0, año_de_nacimiento=0;
		int dia_actual=0, dia_de_nacimiento=0;
		int mes_actual=0, mes_de_nacimiento=0;
		int edad,mes,dias;
		dia_actual= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día del mes actual en números: "));
            
		  mes_actual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes actual en números: "));
        
          año_actual=  Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año actual: "));
       
		dia_de_nacimiento= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu día de nacimiento en números: "));
          
		mes_de_nacimiento= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu mes de nacimiento en números: "));
           
      año_de_nacimiento=  Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento: "));
           
		edad = año_actual - año_de_nacimiento;
		mes=mes_de_nacimiento-mes_actual; 
                dias=dia_de_nacimiento-dia_actual;
		if (mes_de_nacimiento > mes_actual){
		edad = (edad - 1);
		}
		else if(mes_de_nacimiento == mes_actual)
		{	
		if (dia_de_nacimiento > dia_actual){
		edad= (edad - 1);
		}
		}	
	else if (dia_de_nacimiento == dia_actual) {
		 Integer.parseInt(JOptionPane.showInputDialog("¡Felíz cumpleaños!"));
		}
                if(edad>0){
		 JOptionPane.showMessageDialog(null,"tu edad actual es: "+edad+" con "+mes+"meses");
		}
                else if (edad==0){
                     JOptionPane.showMessageDialog(null,"cuentas con: "+mes+"meses y "+dias+"dias de vida");
                }
                    
    }
}

