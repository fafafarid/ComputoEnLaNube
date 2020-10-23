/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienvenida;
import java.util.Scanner; 

/**
 *
 * @author fafafarid
 */
public class Bienvenida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here*
        Scanner dato = new Scanner (System.in);
        String nom="";
        System.out.println ("Introduce tu nombre:");
        nom=dato.nextLine();
        System.out.println("Bienvenido(a) " + nom);
    }
    
}
