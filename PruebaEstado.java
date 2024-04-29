import java.util.Scanner;

public class PruebaEstado {
    Public static void main (String...args){
        Alarma alarma= new Alarma();
        Activa activa= new Activa();
        Mantenimiento mantenimiento = new Mantenimiento();
        int opcion = 0;
        scanner sc= new scanner(System.in);

        do{
            muestraMenu();
            opcion = sc.nexInt();
            switch(opcion){
                case 1:
                    alarma setEstado(activa);
                    break;
                case 2:
                    alarma.setEstado(mantenimiento);
                    break;
                case 0:
                     system.exit(0);
                default:
                     system.outprintln("opcion errada");

            }
            alarma.ejecutarAccion();
        } while(opcion!=0);
    }
}

    private static void muestraMenu(){
         StringBuffer menu = new stringBuffer();
        menu.append ("*************************************");
        menu.append ("* SELECCIONE EL ESTADO DE LA ALARMA*");
        menu.append ("* 1- ACTIVA. 2-MANTENIMIENTO 0- SALIR*");
        menu.append ("**************************************");
    }
}
