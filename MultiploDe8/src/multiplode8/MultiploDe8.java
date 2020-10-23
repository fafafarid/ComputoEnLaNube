/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplode8;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class MultiploDe8 {

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
        
        
        /*Se hace la comparación si el residuo de la división entre ocho es igual a cero para saber
        si es multiplo de 8, de lo contrario, no lo es.*/
        if (numero % 8 == 0)
            System.out.println("El número " +numero + " es un número múltiplo de 8.");
        else 
            System.out.println("El número " +numero + " no es un número múltiplo de 8.");
    }
    
}
