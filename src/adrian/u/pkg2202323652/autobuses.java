package adrian.u.pkg2202323652;
 import javax.swing.JOptionPane;
      public class autobuses{
                  public static void main(String[]args) {
                    byte s= 1,n = 2,id, f=1, h=2;
                     int tol = 0,km = 0,desc = 0,compra;
                     short pg = 0,ptsa,pts = 0;
                        System.out.println(("¿cuentas con una membresia?"));
                          s=Byte.parseByte(JOptionPane.showInputDialog("si=1,no=2"));
                            if(s==1) {
                            System.out.print("felicidades");
                             id=Byte.parseByte(JOptionPane.showInputDialog("inserte id"));
                                       km=Short.parseShort(JOptionPane.showInputDialog("cuantos kilometros viajara"));
                                          pg=Short.parseShort(JOptionPane.showInputDialog("costo del viaje"));
     pts=Short.parseShort(JOptionPane.showInputDialog("cuantos puntos acumulados tiene"));
                                             if(pts>0){
                                               if(pts<=100){
                                               }
                                           desc=km*10*5;
                                             tol=pg-desc ;
                                             System.out.println("total a pagar es"+tol);
                                              System.out.println("cada km equivale a 10pts lo que en dinero=$5 sus puntos acumulados son"+desc);
                                                System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);  
                                             }else if(pts<=0){
                                                   if(tol<=0){
                                                   System.out.println("su total a pagar es"+pg);
                                                      System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                                   }
                                                   } else if(pts>101){
                                                if(pts<=180){
                                                desc=km*15*5;
                                                tol=pg-desc;
                                                 System.out.println("total a pagar es"+tol);
                                             System.out.println("cada km equivale a 10pts lo que en dinero=$5 sus puntos acumulados son"+desc);
                                                     System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                                }
                                               } else if(km<181){
                                                    if(km>250){
                                                        System.out.println("total a pagar es"+tol);
                                             System.out.println("cada km equivale a 10pts lo que en dinero=$5 sus puntos acumulados son"+desc);
                                                    System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                                    }
                                               }
                            }else   if (n==2) {
                                s=Byte.parseByte(JOptionPane.showInputDialog("gustas adquirir una si=1,no=2"));
                            } if (f==1){ 
                                        System.out.println("gracias por su compra");
                                           id=Byte.parseByte(JOptionPane.showInputDialog("inserte id"));
                                       km=Short.parseShort(JOptionPane.showInputDialog("cuantos kilometros viajara"));
                                          pg=Short.parseShort(JOptionPane.showInputDialog("costo del viaje"));
                                           pts=Short.parseShort(JOptionPane.showInputDialog("cuantos puntos acumulados tiene"));
                                           if(pts>0){
                                               if(pts<=100){
                                             desc=km*10*5;
                                                   tol=pg-desc ;
                                             System.out.println("total a pagar es" +tol);
                                              System.out.println("cada km equivale a 10pts lo que en dinero=$5,sus puntos acumulados son" +desc);
                                            System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                               }    
                                           }else if(pts<=0){
                                                   System.out.println("su total a pagar es"+pg);
                                                        System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                           }else if(pts>101){
                                                if(pts<=180){
                                                desc=km*15*5;
                                                tol=pg-desc;
                                                 System.out.println("total a pagar es"+tol);
                                             System.out.println("cada km equivale a 10pts lo que en dinero=$5 sus puntos acumulados son"+desc);
                                                    System.out.println("id"+id);
                                              System.out.println("recorrio km "+km);
                                                }
                                               } else if(km<181){
                                                    if(km>250){
                                                        System.out.println("total a pagar es"+tol);
                                             System.out.println("cada km equivale a 10pts lo que en dinero=$5 sus puntos acumulados son"+desc);
                                               System.out.println("id"+id);

                                                    }
                                               }
                            }
                              else if(h==2) {
                                System.out.println("gracias por su visita");
                                  }  
                  }
                  }
      