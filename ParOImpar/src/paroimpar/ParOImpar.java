/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroimpar;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner scn=new Scanner(System.in);
        System.out.println("Digite una cantidad: ");
        int digito=scn.nextInt();
        numero=digito;
        
        
        /*Se hace la comparación si el residuo de la división entre dos es igual a cero para saber
        si es un número par, de lo contrario, será número impar*/
        if (numero % 2 == 0)
            System.out.println("El número " +numero + " es un número Par");
        else 
            System.out.println("El número " +numero + " es un número Impar");
        
        
    }
    
}
