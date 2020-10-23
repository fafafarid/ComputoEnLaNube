/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumeros;
import java.util.Scanner; 

/**
 *
 * @author fafafarid
 */
public class DosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Primer número:");
        int n1=scn.nextInt();
        System.out.println("Segundo número:");
        int n2=scn.nextInt();
        System.out.println("El primer número introducido es: " + n1);
        System.out.println("El segundo número introducido es: " + n2);
    }
    
}
