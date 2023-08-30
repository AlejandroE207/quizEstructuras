/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;
import javax.swing.JOptionPane;
import modelo.*;
/**
 *
 * @author USUARIO
 */
public class Contactos {

    public static void main(String[] args) {
        int opc;
        Contacto user = new Contacto();
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1. Agregar Contacto\n2. Buscar Contacto\n3. Mostrar agenda\n4. Salir"));
            switch (opc) {
                case 1:
                    user.agregarContacto();
                    break;

                case 2:
                    user.buscarCont();
                    break;

                case 3:
                    user.imprimir();
                    break;    
            }
            
        }
        while(opc!=4);
    }
}
