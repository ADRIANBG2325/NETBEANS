package Unidad_3;


import javax.swing.JOptionPane;


public class VACUNAS {
    public byte devuelveTipo (){
        byte v=0;
        v=Byte.parseByte(JOptionPane.showInputDialog("Elegir el nùmero de vacunas, 0=Parmovirus, 1=Moquillo, 2=Rabia, 3=Felicidades tienes todas tus vacunas"));
        if (v==0){ 
        System.out.print("Toca la vacuna del parmovitus");
        }
         if (v==1){
        System.out.println("Administrar vacuna anti-moquillo");        
        }
         if (v==2){
             System.out.println("Adminitrar vacuna anti-rabia");
         }
         if(v==3){
             System.out.println("Felicidades tiene todas las vacunas");
         
         }
         return v;
    }
}
  

