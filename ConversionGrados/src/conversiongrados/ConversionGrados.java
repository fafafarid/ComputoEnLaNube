/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiongrados;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class ConversionGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        double gc,gf;
        System.out.println("Grados Centígrados: ");
        gc=dato.nextDouble();
        gf=((gc*9)/5)+32;
        System.out.println( gc +"° Centígrados es equivalente a: " +gf +"° Farenheit");
    }
    
}
