/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int o=0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println ("Elige una opción:");
            System.out.println ("1. REGRESAR AL MENÚ.");
            System.out.println ("2. REPETIR EL MENÚ.");
            System.out.println ("3. VOLVER AL MENÚ.");
            System.out.println ("4. TERMINAR.");
            o=leer.nextInt();
            switch (o) {
                case 1:
                    break;
                            case 2:
                                break;
                                        case 3:
                                            break;
            }
          
        }while (o!=4);
        System.out.println("Usted ha terminado el proceso.");
    }
    
}
