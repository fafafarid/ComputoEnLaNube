/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int o=0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println ("Elige una opción:");
            System.out.println ("1. CUADRADO.");
            System.out.println ("2. RECTÁNGULO.");
            System.out.println ("3. CÍRCULO.");
            System.out.println ("4. SALIR.");
            o=leer.nextInt();
            switch (o) {
                case 1:
                    System.out.println ("Ingrese el lado del cuadrado: ");
                    int lado=0, p1=0, a1=0;
                    lado=leer.nextInt();
                    p1=4*lado;
                    a1=lado*lado;
                    System.out.println("El Perímetro del cuadrado es de: " +p1 +" unidades");
                    System.out.println("El Área del cuadrado es de: " +a1 +" unidades cuadaradas");
                    break;
                            case 2:
                                int base=0, altura=0, p2=0, a2=0;
                                System.out.println ("Ingrese la base del rectángulo: ");
                                base=leer.nextInt();
                                System.out.println ("Ingrese la altura del rectángulo: ");
                                altura=leer.nextInt();
                                p2=(2*base)+(2*altura);
                                a2=base*altura;
                                System.out.println("El Perímetro del rectángulo es de: " +p2 +" unidades");
                                System.out.println("El Área del rectángulo es de: " +a2 +" unidades cuadaradas");
                                break;
                                        case 3:
                                            int radio=0, diametro=0;
                                            double p3=0, a3=0;
                                            System.out.println("Ingrese el radio del círculo: ");
                                            radio=leer.nextInt();
                                            diametro=radio*2;
                                            p3 = 3.14*diametro;
                                            a3 = 3.14*radio*radio;
                                            System.out.println("El Perímetro del círculo es de: " +p3 +" unidades");
                                            System.out.println("El Área del círculo es de: " +a3 +" unidades cuadaradas");
                                            break;
            }
          
        }while (o!=4);
        System.out.println("Usted ha salido del programa.");

    }
    
}
